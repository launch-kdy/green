package com.green.form2.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 자 DTO 가 뭐냐
// DTO(Data Transfer Object)
// 데이터를 전송할 때 사용하는 객체

@Getter
@Setter
@ToString
//ToString으로 잘 나오는지 출력확인

public class ChickenDTO {
  //React 파일 키값 동일해야 하오니, 오타 주의
  private String menu;
  private int cnt;
  private String addr;
  private String addradd;
  private String please;

  public ChickenDTO(){}

  public ChickenDTO(String menu, int cnt, String addr, String addradd, String please) {
    this.menu = menu;
    this.cnt = cnt;
    this.addr = addr;
    this.addradd = addradd;
    this.please = please;
  }
}
