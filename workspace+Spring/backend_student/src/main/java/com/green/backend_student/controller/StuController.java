package com.green.backend_student.controller;

import com.green.backend_student.dto.ClassDTO;
import com.green.backend_student.dto.StuDTO;
import com.green.backend_student.service.StuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuController {
  private StuService stuService;

  public StuController(StuService stuService){
    this.stuService = stuService;
  }

  //학급
  @GetMapping("/classInfo")
  public List<ClassDTO> getClassList(){
    return stuService.getClassList();
  }

  //학생목록조회
  @GetMapping("/students")
  public List<StuDTO> getStuList(){
    ClassDTO classDTO = new ClassDTO();//깡통 문법 맞추기용 DTO 생성
    return stuService.selectStuList(classDTO); //...List('깡통DTO')
  }

  //(학과별) 학생목록 조회
  @GetMapping("/students/{classNum}")
  public List<StuDTO> getStuListByClassNum(@PathVariable("classNum") int classNum){
    ClassDTO classDTO = new ClassDTO();//깡통 객체 생성
    classDTO.setClassNum(classNum);//classNum 넣어줘야하니까, classNum 불러오기
    return stuService.selectStuList(classDTO);
  }


}
