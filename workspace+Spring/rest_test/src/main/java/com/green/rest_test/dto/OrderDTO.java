package com.green.rest_test.dto;

import lombok.Getter;
import lombok.Setter;

  @Getter
  @Setter
  public class OrderDTO {
    private int orderNum;
    private String name;
    private int price;
    private int cnt;
    private String buyer;
    private int buyPrice;

    public OrderDTO(){}

    public OrderDTO(int orderNum, String name, int price, int cnt, String buyer, int buyPrice) {
      this.orderNum = orderNum;
      this.name = name;
      this.price = price;
      this.cnt = cnt;
      this.buyer = buyer;
      this.buyPrice = buyPrice;
    }
  }
