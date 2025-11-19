package com.green.car_info_backend.sales.controller;

import com.green.car_info_backend.sales.dto.SaleDTO;
import com.green.car_info_backend.sales.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 판매 정보 관리 컨트롤러
 * - 판매 정보의 등록, 조회 기능을 제공하는 REST API 엔드포인트
 * - 기본 경로: /sales
 */
@RestController // REST API 컨트롤러임을 선언 (JSON 형태로 데이터 반환)
@RequestMapping("/sales") // 이 컨트롤러의 기본 URL 경로 설정
@RequiredArgsConstructor // final 필드에 대한 생성자를 자동으로 생성 (Lombok)
public class SaleController {
  
  // SaleService를 의존성 주입 받음 (final이므로 생성자 주입 방식)
  private final SaleService saleService;

  /**
   * 판매정보 등록 API
   * - HTTP Method: POST
   * - URL: /sales
   * - 요청 본문(Body)으로 받은 판매 정보를 데이터베이스에 저장
   * 
   * @param saleDTO 등록할 판매 정보 (고객명, 전화번호, 차량 색상, 모델번호)
   *                - cusName: 고객명
   *                - cusPhone: 고객 전화번호
   *                - color: 차량 색상
   *                - modelNum: 차량 모델 번호 (CAR_INFO 테이블의 외래키)
   */
  @PostMapping("") // POST 요청을 처리 (데이터 등록)
  public void addSale(@RequestBody SaleDTO saleDTO){
    // 디버깅용: 클라이언트로부터 받은 판매 정보를 콘솔에 출력
    System.out.println("=== 판매정보 등록 요청 ===");
    System.out.println(saleDTO);
    
    // Service 계층을 호출하여 판매 정보를 데이터베이스에 저장
    saleService.addSale(saleDTO);
  }

  /**
   * 판매정보 조회 API
   * - HTTP Method: GET
   * - URL: /sales
   * - 등록된 모든 판매 정보를 차량 정보와 함께 조회
   * 
   * @return List<SaleDTO> 판매 정보 목록 (차량 정보 포함, 최신순 정렬)
   *         각 SaleDTO는 다음 정보를 포함:
   *         - 판매 정보: 판매번호, 고객명, 전화번호, 색상, 판매일자
   *         - 차량 정보: 모델명, 가격, 제조사 (carDTO 객체 내부)
   */
  @GetMapping("") // GET 요청을 처리 (데이터 조회)
  public List<SaleDTO> getSaleList(){
    // Service 계층을 호출하여 판매 정보 목록을 가져와 반환
    return saleService.getSaleList();
  }

}
