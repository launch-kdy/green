package com.green.basic_board2.mapper;

import com.green.basic_board2.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

  //실습 3 회원등록
  public int join(MemberDTO memberDTO);

  public String getMemberName();

  //리턴타입은 '조회된 모든 데이터'를 가져오는 것으로 이해하자
  public List<String> getMemberNameAll();

  public int getMemberAge();

  //종합선물세트
  public MemberDTO getMember();

  //여러줄 List
  public List<MemberDTO> getMemberAll();

  public List<MemberDTO> getMemberAll2(int memAge);

}
