package com.green.car_info_backend.sales.service;

import com.green.car_info_backend.sales.dto.SaleDTO;
import com.green.car_info_backend.sales.mapper.SaleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 판매 정보 비즈니스 로직 처리 서비스
 * - Controller와 Mapper 사이에서 비즈니스 로직을 담당
 * - 트랜잭션 처리, 데이터 검증, 복잡한 비즈니스 규칙 등을 수행
 */
@Service // 스프링의 서비스 계층 컴포넌트임을 선언
@RequiredArgsConstructor // final 필드에 대한 생성자 자동 생성 (Lombok)
public class SaleService {
  
  // MyBatis Mapper를 의존성 주입 받음 (DB와 통신하는 계층)
  private final SaleMapper saleMapper;

  /**
   * 판매정보 등록 비즈니스 로직
   * - Controller로부터 받은 판매 정보를 검증하고 데이터베이스에 저장
   * - 현재는 단순히 Mapper를 호출하지만, 필요시 다음 로직을 추가 가능:
   *   1. 고객 정보 유효성 검증 (전화번호 형식, 필수값 체크 등)
   *   2. 차량 모델 번호 존재 여부 확인
   *   3. 중복 판매 방지 로직
   *   4. 판매 통계 업데이트
   *   5. 알림 발송 등
   * 
   * @param saleDTO 등록할 판매 정보
   *                - cusName: 고객명 (필수)
   *                - cusPhone: 고객 전화번호 (필수)
   *                - color: 차량 색상 (필수)
   *                - modelNum: 차량 모델 번호 (필수, CAR_INFO 테이블 참조)
   */
  public void addSale(SaleDTO saleDTO){
    // TODO: 필요시 여기에 비즈니스 로직 추가
    // 예) if (saleDTO.getCusName() == null) throw new Exception("고객명은 필수입니다");
    
    // MyBatis Mapper를 호출하여 데이터베이스에 INSERT 쿼리 실행
    saleMapper.addSale(saleDTO);
    
    // 등록 완료 후 추가 작업이 필요한 경우 여기에 작성
    // 예) 판매 완료 이메일 발송, 재고 감소 등
  }

  /**
   * 판매정보 조회 비즈니스 로직
   * - 등록된 모든 판매 정보를 차량 정보와 함께 조회
   * - JOIN을 통해 판매 정보와 연결된 차량의 상세 정보도 함께 가져옴
   * - 판매일자 기준 내림차순 정렬 (최신 판매 정보가 먼저 표시)
   * 
   * @return List<SaleDTO> 판매 정보 목록
   *         각 항목에는 다음이 포함됨:
   *         - sellNum: 판매 번호 (PK, 자동 증가)
   *         - cusName: 고객명
   *         - cusPhone: 고객 전화번호
   *         - color: 차량 색상
   *         - sellDate: 판매일자 (등록 시 자동 생성)
   *         - modelNum: 차량 모델 번호
   *         - carDTO: 차량 상세 정보 객체
   *           ㄴ modelName: 차량 모델명
   *           ㄴ modelPrice: 차량 가격
   *           ㄴ madeCompany: 제조사
   */
  public List<SaleDTO> getSaleList(){
    // MyBatis Mapper를 호출하여 데이터베이스에서 데이터를 조회
    // sales-mapper.xml의 getSaleList 쿼리가 실행됨
    return saleMapper.getSaleList();
  }

}
