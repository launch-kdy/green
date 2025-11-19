package com.green.ExamPractice.controller;

import lombok.Getter;
import lombok.Setter;

//마지막으로 롬복으로 게터 세터도 생성해준다!!!
@Getter
@Setter
//첫번째로 멤버변수 생성해준다 !
public class BoardDTO {
  private int boardNum;
  private String title;
  private String writer;
  private String content;
  private int readCnt;

  //두번째로 constructor을 생성해준다 !!

  public BoardDTO(){}
  public BoardDTO(int boardNum, String title, String writer, String content, int readCnt) {
    this.boardNum = boardNum;
    this.title = title;
    this.writer = writer;
    this.content = content;
    this.readCnt = readCnt;
  }
}
