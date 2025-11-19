package com.green.backend_shop.cart.controller;

import com.green.backend_shop.cart.dto.CartDTO;
import com.green.backend_shop.cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
@RequiredArgsConstructor
public class CartController {
  private final CartService cartService;

  //장바구니 등록 api
  @PostMapping("")
  public void addCart(@RequestBody CartDTO cartDTO){
    System.out.println(cartDTO);
    cartService.addCart(cartDTO);
  }

  //장바구니 목록 조회 api
  //  /carts/java
  @GetMapping("/{memId}")
  public List<CartDTO> getCartList(@PathVariable("memId") String memId){
    return cartService.getCartList(memId);
  }

  //장바구니 상품 삭제
  @DeleteMapping("/{cartNum}")
  public void deleteCart(@PathVariable("cartNum") int cartNum){
    cartService.deleteCart(cartNum);
  }

  //장바구니 수량 변경(장바구니 목록페이지에서 수량 변경)
  @PutMapping("")
  public void updateCart(@RequestBody CartDTO cartDTO){
    cartService.updateCart(cartDTO);
  }

}










