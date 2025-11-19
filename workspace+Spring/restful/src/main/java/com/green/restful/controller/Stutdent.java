package com.green.restful.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Stutdent {
  private String name;
  private int korScore;
  private int engScore;

  //기본생성자도 무조건만들기
  public Stutdent(){}
  public Stutdent(String name, int korScore, int engScore) {
    this.name = name;
    this.korScore = korScore;
    this.engScore = engScore;
  }

}
