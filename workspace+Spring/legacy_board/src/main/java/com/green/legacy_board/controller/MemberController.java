package com.green.legacy_board.controller;

import com.green.legacy_board.dto.MemberDTO;
import com.green.legacy_board.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Enumeration;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
  private final MemberService memberService;

  //회원가입 페이지로 이동
  @GetMapping("/join")
  public String goJoin(){
    return "join";
  }

  //회원가입 실행
  //form 태그 안의 input ModelAttribute
  @PostMapping("/join")
  public String join(@ModelAttribute MemberDTO memberDTO){
    System.out.println(memberDTO);

    //회원가입 후 게시글 목록 페이지로 이동
    memberService.join(memberDTO);

    //리턴문 안의 내용은 기본적으로 html 파일명으로 인식
    // redirect 키워드를 붙이면 html 파일명으로 해석하지않음
    return "redirect:/boards";
  }

  //로그인 실행
  @GetMapping("/login")
  public String goLogin(){
    return "login";
  }

  //로그인처리
  //session 객체는 controller 매서드의 매개변수의 선언
  @PostMapping("/login")
  public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
    //로그인 하기 전 session 데이터 조회
    Enumeration<String> names = session.getAttributeNames();
    System.out.println("=== 로그인 전 세션에 저장된 데이터 ===");
    while(names.hasMoreElements()){
      String name = names.nextElement();
      Object value = session.getAttribute(name);
      System.out.println("key : " + name + " / value : " + value);
    }

    //로그인 처리
    MemberDTO result = memberService.login(memberDTO);

    //로그인 가능한 회원이면 로드인 정보를 세션에 저장
    if(result != null){
      session.setAttribute("loginInfo", result);
    }

    //로그인 후 세션 데이터 조회
    Enumeration<String> keys = session.getAttributeNames();
    System.out.println("=== 로그인 (후) 세션에 저장된 데이터 ===");
    while(keys.hasMoreElements()){
      String name = keys.nextElement();
      Object value = session.getAttribute(name);
      System.out.println("key : " + name + " / value : " + value);
    }

    //게시물 목록 페이지
    return "redirect:/boards";
  }

  //로그아웃
  @GetMapping("/logout")
  public String logout(HttpSession session){
    session.removeAttribute("loginInfo");
    return "redirect:/boards";
  }

}
