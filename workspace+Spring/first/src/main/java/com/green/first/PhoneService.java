package com.green.first;

import org.springframework.beans.factory.annotation.Autowired;

public class PhoneService {
  private Phone p;

  //클래스 안에 '생성자가 1개'라면 'Autowired 아노테이션'이 자동으로 붙는다
  //생성자생성
  @Autowired
  public PhoneService(Phone phone){
    //p 객체생성
    p = phone;
  }

}
