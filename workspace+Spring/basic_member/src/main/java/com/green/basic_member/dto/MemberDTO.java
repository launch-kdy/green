package com.green.basic_member.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
// 1. <DTO에서> '겟쎗투스트링' 만들기
public class MemberDTO {
  // 2. <DTO에서> '키값' 대소카멜('_'금지) 만들기
  private String memId;
  private String memPw;
  private String memName;
  private int memAge;
  //* new 날짜 시간 자료형 (무조건) : localdateTime
  private LocalDateTime birthDay;
}
