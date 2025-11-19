package com.green.form2.controller;

import com.green.form2.dto.ChickenDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// <1> 필수 어노테이션 @RestController - URL 작성법
@RestController
public class ChickenController {

  // <2> 치킨 주문받기 - api = '주문을 등록하는 것이므로 ' post 가 적절함
  @PostMapping("/orders")
  public String getOrder(@RequestBody ChickenDTO chickenDTO){
    System.out.println("주문 접수");

    //System.out.println(chickenDTO); 치면 실행된다
    System.out.println(chickenDTO);

    return "주문 성공";
  }

}
