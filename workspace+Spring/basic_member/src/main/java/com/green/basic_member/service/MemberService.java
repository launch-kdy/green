package com.green.basic_member.service;

import com.green.basic_member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 7. < Service에서 > 회원 등록기능
@Service
public class MemberService {
  // 7. - 2 객체를 의존성 주입
  private MemberMapper memberMapper;

  // 7. - 3
  @Autowired
  public MemberService(MemberMapper memberMapper){
    this.memberMapper = memberMapper;
  }

  // 7. - 1 'regMember' 새로 임의로 생성 (선언)
  public void regMember(){
    // 7. -4
    memberMapper.insertMember();
  }

}
