package com.green.basic_member.mapper;

import org.apache.ibatis.annotations.Mapper;

// 5. <Mapper 에서 객체생성 + 해당 인터페이스에 쿼리를 실행할 메서드가 있음을 인지시켜주는 역할>
@Mapper
public interface MemberMapper {
  // 5. - 1 <Mapper 에서> 만든 쿼리 ('실행하는' 추상 메서드) 만들기
  public void insertMember();
}
