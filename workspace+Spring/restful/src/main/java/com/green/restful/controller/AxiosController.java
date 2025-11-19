package com.green.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AxiosController {

  @GetMapping("/getNum")
  public int getNum(){
    System.out.println("getNum() 메서드 실행");
    return 10;
  }

  @GetMapping("/getStr")
  public String getSrt(){
    return "react";
  }

  @GetMapping("/getStu")
  public Stutdent getStudent(){
    Stutdent stu = new Stutdent("kim", 90, 70);
    return stu;
  }

  //Axios_4.jsx
  @GetMapping("/stuList")
  public List<Stutdent> stuList(){
    List<Stutdent> stuList = new ArrayList<>();
    stuList.add(new Stutdent("김자바", 70, 70));
    stuList.add(new Stutdent("이자바", 90, 80));
    stuList.add(new Stutdent("박자바", 85, 90));
    return stuList;
  }

  @GetMapping("/getClass")
  public List<String> getOptionList(){
    List<String> classList = new ArrayList<>();
    classList.add("자바반");
    classList.add("캐드반");
    classList.add("회계반");
    return classList;
  }

  @GetMapping("/getHobby")
  public List<String> getHobbyList(){
    List<String> hobbyList = new ArrayList<>();
    hobbyList.add("게임");
    hobbyList.add("운동");
    hobbyList.add("낮잠");
    return hobbyList;
  }


}
