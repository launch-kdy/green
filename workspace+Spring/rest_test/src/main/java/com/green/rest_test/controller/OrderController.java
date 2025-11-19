package com.green.rest_test.controller;

import com.green.rest_test.dto.OrderDTO;
import com.green.rest_test.dto.StudentDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //객체생성
public class OrderController {
  // 1) 모든 주문정보를 조회하는 기능을 제공하는 RESET API
  // SELECT *
  // FROM REST_ORDER_TABLE
  @GetMapping("/orders")
  public String getOrderList(){
    System.out.println("모든 주문정보를 조회합니다");
    return "모든 주문정보 조회성공";
  }

  // 2) 하나의 주문정보를 조회하는 기능을 제공하는 REST API
  // SELECT *
  // FROM REST_ORDER_TABLE
  // WHERE 상품번호 = ? ;
  @GetMapping("/orders/{orderNum}")
  public String getOrder(@PathVariable("orderNum") int orderNum){
    System.out.println("하나의 주문정보를 조회합니다");
    System.out.println("orderNum = " + orderNum);
    return "111";
  }

  // 3) 하나의 주문정보를 등록하는 기능을 제공하는 REST API
  // INSERT INTO ORDER(상품번호, 상품명, 가격, 수량. 주문자ID, 구매금액)
  // VALUE(?,'?', ?, ?, '?', ?);
  @PostMapping("/orders")
  //@OrderDTO에 관한 매개변수 orderDTO
  public String insertOrder(@RequestBody OrderDTO orderDTO) {
    System.out.println("하나의 주문정보를 등록합니다");
    System.out.println(orderDTO);
    return "222";
  }

  // 4) 하나의 주문정보를 삭제하는 기능을 제공하는 REST API
  // DELETE FROM ORDER
  // WHERE = ?;
  @DeleteMapping("/orders/{orderNum}")
  public String deleteOrder(@PathVariable("orderNum") int orderNum){
    System.out.println("11");
    System.out.println("orderNum = " + orderNum);
    return "33";
  }


  // 5) 하나의 주문정보에서 상품명과 상품가격을 수정하는 기능을 제공하는 REST API
  // UPDATE ORDER
  // SET
  // 상품명 = ?;
  // 상품가격 = ?;
  // WHERE 상품번호 = ?;
  @PutMapping("/orders/{orderNum}")
  public String updateOrder(@PathVariable("orderNum")  int orderNum, @RequestBody OrderDTO orderDTO){
    System.out.println("수정");
    System.out.println("orderNum" + orderNum);
    System.out.println(orderDTO);
    return "수정완료";
  }

  @PostMapping("/students")
  public String getStudent(@RequestBody StudentDTO studentDTO){
    System.out.println("학생정보를 입력");
    System.out.println("studentDTO :" + studentDTO);
    return "입력완료";
  }


}
