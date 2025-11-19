package com.green.backend_shop.buy.mapper;

import com.green.backend_shop.buy.dto.BuyDTO;
import com.green.backend_shop.buy.dto.BuyDTOForAdmin;
import com.green.backend_shop.buy.dto.SearchBuyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyMapper {
  //(디테일 페이지에서) 상품구매
  public void insertBuy(BuyDTO buyDTO);

  //(장바구니 페이지에서) 상품구매
  public void buyAll(BuyDTO buyDTO);

  //관리자 구매이력조회 페이지의 구매목록 조회
  public List<BuyDTOForAdmin> getBuyListForAdmin(SearchBuyDTO searchBuyDTO);

  //구매 내역 상세 조회
  public List<BuyDTO> getBuyDetail(int orderNum);

}
