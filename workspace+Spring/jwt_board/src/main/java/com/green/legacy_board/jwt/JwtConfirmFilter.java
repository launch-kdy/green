package com.green.legacy_board.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

//토큰 검증 필터
@Slf4j
@RequiredArgsConstructor
public class JwtConfirmFilter extends OncePerRequestFilter {
  private final JwtUtil jwtUtil;

  //각 요청마다 무조건 실행하는 필터
  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
    log.info("토큰 검증 메서드 실행");

    //토큰 검증 실행(클라이언트에 토큰은 헤더 영역에 담겨 있음)
    String authorization = request.getHeader("authorization");

    //토큰이 없거나, 토큰인 Bearer로 시작하지 않으면
    if(authorization == null || authorization.startsWith("Bearer ")){
      log.info("토큰이 없습니다");

      //토큰 검증 후 다음 필터 동작을 진행
      filterChain.doFilter(request, response);
      return ;
    }



    String token = authorization.split(" ")[1];

    //토큰이 있지만 만료가 되었다면
    if(jwtUtil.isExpired(token)){
      log.info("만료된 토큰입니다");

      //토큰 검증 후 다음 필터 동작을 진행
      filterChain.doFilter(request, response);
      return ;
    }

    //토큰에서 정보 추출
    String memEmail = jwtUtil.getUsername(token);
    String memRole = jwtUtil.getRole(token);


    //토큰 검증 후 다음 필터 동작을 진행
    filterChain.doFilter(request, response);
  }

}






