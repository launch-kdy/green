package com.green.backend_shop.buy.service;

import com.green.backend_shop.buy.dto.BuyDTO;
import com.green.backend_shop.buy.dto.BuyDTOForAdmin;
import com.green.backend_shop.buy.dto.SearchBuyDTO;
import com.green.backend_shop.buy.mapper.BuyMapper;
import com.green.backend_shop.cart.mapper.CartMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BuyService {
  private final BuyMapper buyMapper;
  private final CartMapper cartMapper;

  //(디테일 페이지에서) 상품구매
  public void insertBuy(BuyDTO buyDTO) {
    buyMapper.insertBuy(buyDTO);
  }

  //(장바구니 페이지에서) 상품구매
  //구매는
  //1. SHOP_BUY 테이블에 INSERT 쿼리와
  //2. SHOP_CART 테이블에 DELETE 쿼리와
  // 두 쿼리의 실행으로 이루어져 있다.
  // 두 쿼리는 둘 다 성공해서 성공으로 판단할 수 있기 때문에
  // Transaction을 사용하여 두 쿼리를 하나의 묶음으로 간주해야 한다.
  // Transactional 어노테이션이 선언된 메서드 내의 모든 쿼리는 하나의 묶음으로 간주함
  // -> 메서드 내 모든 쿼리실행 명령어가 정상 작동 되어야지만 commit을 진행함
  //rollbackFor : 어떤 경우에 롤백을 진행할지 설정 할 수 있는 속성
  //rollbackFor : Exception.class
  // -> "오류생기면 '아묻따' 묶어서 롤백 시킴."
  @Transactional(rollbackFor = Exception.class)
  public void buyAll(BuyDTO buyDTO){
    //SHOP_BUY 테이블에 구매 정보 INSERT
    buyMapper.buyAll(buyDTO);

    //구매한 장바구니 정보는 SHOP_CART 테이블에서 DELETE
    cartMapper.deleteCartAll(buyDTO);
  }

  //관리자 구매이력조회 페이지의 구매목록 조회
  public List<BuyDTOForAdmin> getBuyListForAdmin(SearchBuyDTO searchBuyDTO){
    return buyMapper.getBuyListForAdmin(searchBuyDTO);
  }

  //구매 내역 상세 조회
  public List<BuyDTO> getBuyDetail(int orderNum){
    return buyMapper.getBuyDetail(orderNum);
  }

}
