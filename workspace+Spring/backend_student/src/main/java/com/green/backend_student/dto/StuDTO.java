package com.green.backend_student.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StuDTO {
  private int stuNum;
  private String stuName;
  private int stuAge;
  private int classNum;
  private ClassDTO classDTO; //학생 1명을 class를 1개 갖고 있어요 (여러개면 List)
}
