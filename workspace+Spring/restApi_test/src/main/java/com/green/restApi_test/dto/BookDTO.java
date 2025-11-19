package com.green.restApi_test.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookDTO {
  private int bookNum;
  private String title;
  private String writer;
  private String intro;
  private int price;

  public BookDTO(){}

  public BookDTO(int bookNum, String title, String writer, String intro, int price) {
    this.bookNum = bookNum;
    this.title = title;
    this.writer = writer;
    this.intro = intro;
    this.price = price;
  }
}
