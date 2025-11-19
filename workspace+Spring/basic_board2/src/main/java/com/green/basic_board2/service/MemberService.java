package com.green.basic_board2.service;

import com.green.basic_board2.dto.MemberDTO;
import com.green.basic_board2.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
  // 실습 3 회원등록
  private MemberMapper memberMapper;

  public MemberService(MemberMapper memberMapper){
    this.memberMapper = memberMapper;
  }

  public int join(MemberDTO memberDTO){
    System.out.println("회원등록을 하겠습니다.");
    return memberMapper.join(memberDTO);
  }

  public String getMemberName(){
    return memberMapper.getMemberName();
  }

  //list
  public List<String> getMemberNameAll(){
    List<String> result = memberMapper.getMemberNameAll();
    return result;
  }

  //실습 1 MemberList.jsx - getMemberAll
  public List<MemberDTO> getMemberAll(){
    List<MemberDTO> memberList = memberMapper.getMemberAll();
    return memberList;
  }

}
