package com.green.car_info_backend.sales.mapper;

import com.green.car_info_backend.sales.dto.SaleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 판매 정보 MyBatis Mapper 인터페이스
 * - 데이터베이스와 직접 통신하는 계층
 * - 이 인터페이스의 메서드는 sales-mapper.xml의 쿼리와 1:1 매핑됨
 * - @Mapper 어노테이션으로 MyBatis가 자동으로 구현체를 생성
 */
@Mapper // MyBatis Mapper임을 선언 (스프링이 자동으로 Bean 등록 및 구현체 생성)
public interface SaleMapper {

    /**
     * 판매정보 등록 쿼리 실행
     * - sales-mapper.xml의 <insert id="addSale"> 쿼리와 연결됨
     * - SALES_INFO 테이블에 새로운 판매 정보를 INSERT
     * 
     * 실행되는 쿼리:
     * INSERT INTO sales_info (CUS_NAME, COLOR, MODEL_NUM, CUS_PHONE)
     * VALUES (#{cusName}, #{color}, #{modelNum}, #{cusPhone})
     * 
     * 참고:
     * - SELL_NUM(판매번호)는 자동 증가(AUTO_INCREMENT)로 자동 생성
     * - SELL_DATE(판매일자)는 데이터베이스 기본값(CURRENT_TIMESTAMP)으로 자동 설정
     * 
     * @param saleDTO 등록할 판매 정보
     *                - cusName: 고객명 (필수)
     *                - cusPhone: 고객 전화번호 (필수)
     *                - color: 차량 색상 (필수)
     *                - modelNum: 차량 모델 번호 (필수, CAR_INFO 외래키)
     */
    void addSale(SaleDTO saleDTO);

    /**
     * 판매정보 전체 조회 쿼리 실행
     * - sales-mapper.xml의 <select id="getSaleList"> 쿼리와 연결됨
     * - SALES_INFO와 CAR_INFO 테이블을 JOIN하여 판매 정보와 차량 정보를 함께 조회
     * 
     * 실행되는 쿼리:
     * SELECT s.SELL_NUM, s.CUS_NAME, s.CUS_PHONE, s.COLOR, s.SELL_DATE, s.MODEL_NUM,
     *        c.MODEL_NAME, c.MODEL_PRICE, c.MADE_COMPANY
     * FROM SALES_INFO s
     * JOIN CAR_INFO c ON s.MODEL_NUM = c.MODEL_NUM
     * ORDER BY s.SELL_DATE DESC
     * 
     * 반환 구조:
     * - MyBatis의 <resultMap>을 통해 결과를 SaleDTO 객체로 자동 매핑
     * - <association>을 통해 차량 정보는 carDTO 객체에 매핑
     * 
     * @return List<SaleDTO> 판매 정보 목록 (차량 정보 포함, 최신순 정렬)
     */
    List<SaleDTO> getSaleList();

}
