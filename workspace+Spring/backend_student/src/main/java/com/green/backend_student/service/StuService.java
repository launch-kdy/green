package com.green.backend_student.service;

import com.green.backend_student.dto.ClassDTO;
import com.green.backend_student.dto.StuDTO;
import com.green.backend_student.mapper.StuMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
// 선언
public class StuService {
  private StuMapper stuMapper;

  // 생성자 의존성 주입
  public StuService(StuMapper stuMapper){
    this.stuMapper = stuMapper;
  }

  // 학급 목록조회
  public List<ClassDTO> getClassList() {
    return stuMapper.getClassList();
  }

  // 학생 목록조회
  public List<StuDTO> selectStuList(ClassDTO classDTO){ return stuMapper.selectStuList(classDTO); }

}
