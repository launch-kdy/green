package com.green.backend_shop.buy.controller;

import com.green.backend_shop.buy.dto.BuyDTO;
import com.green.backend_shop.buy.dto.BuyDTOForAdmin;
import com.green.backend_shop.buy.dto.SearchBuyDTO;
import com.green.backend_shop.buy.service.BuyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buys")
@RequiredArgsConstructor
public class BuyController {
  private final BuyService buyService;

  //(디테일 페이지에서) 상품구매
  @PostMapping("")
  public ResponseEntity<?> insertBuy(@RequestBody BuyDTO buyDTO){
    try{
      // 실행 코드
      buyService.insertBuy(buyDTO);
      return ResponseEntity.status(HttpStatus.CREATED).build();
    }catch(Exception e){
      // 오류가 발생하면 실행 할 코드
      e.printStackTrace();
      return ResponseEntity
              .status(HttpStatus.INTERNAL_SERVER_ERROR)
              .body("구매하기 쿼리 실행 중 오류가 발생했습니다");
    }
  }

  //(장바구니 페이지에서) 상품구매
  @PostMapping("/all")
  public void buyAll(@RequestBody BuyDTO buyDTO){
    System.out.println(buyDTO);
    buyService.buyAll(buyDTO);
  }

  //관리자 구매이력조회 페이지의 구매목록 조회
  @GetMapping("/buy-list-admin")
  public ResponseEntity<?> getBuyListForAdmin(SearchBuyDTO searchBuyDTO){
    System.out.println(searchBuyDTO);

    //예외 상황 대비(구매목록)
    try{
      List<BuyDTOForAdmin> list = buyService.getBuyListForAdmin(searchBuyDTO);
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch(Exception e){
      e.printStackTrace();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //구매 내역 상세 조회
  @GetMapping("/{orderNum}")
  public List<BuyDTO> getBuyDetail(@PathVariable("orderNum") int orderNum) {
    return buyService.getBuyDetail(orderNum);
  }

}
