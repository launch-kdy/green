package com.green.back_item.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString // (확인용)
public class BackItemDTO {
  // DTO를 만든다.
  private int itemNum; // <아이템 넘버>
  private String itemCategory; // <카테고리>
  private String itemName; // <상품명>
  private int itemPrice; // <가격>
  private String itemIntro; // <상품소개>
  private String itemStatus; // <상태/상품준비중/판매중/매진>
  private LocalDateTime regDate; // <등록일>
}
