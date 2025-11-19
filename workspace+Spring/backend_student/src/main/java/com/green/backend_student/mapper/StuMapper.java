package com.green.backend_student.mapper;

import com.green.backend_student.dto.ClassDTO;
import com.green.backend_student.dto.StuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {

  //학급목록조회
  public List<ClassDTO> getClassList();

  //학생목록조회
  public List<StuDTO> selectStuList(ClassDTO classDTO);

}
