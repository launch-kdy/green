package com.green.basic_board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Locale;

//DTO : 데이터를 서로 전송 받을 수 있는 DTO
//BASIC_BOARD 테이블과 데이터 전송을 하기 위한 클래스
//BASIC_BOARD 테이블의 컬럼과 매칭되는 멤버변수를 생성
//DB에 있는 BASIC_BOARD 테이블이 '기준'이 됨

@Getter
@Setter
@ToString
public class BoardDTO {
  //소문자로 하되, 카멜케이스로
  private int boardNum;
  private String title;
  private String writer;
  private String content;
  private String readCnt;
  /* nev 새로운 자료형*/
  private LocalDateTime createDate;

}
