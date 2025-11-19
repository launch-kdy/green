package com.green.basic_member.controller;


import com.green.basic_member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// 3. <Controller클래스에서>
// ( @RestController 넣기 )
// 객체생성 + controller 역할을 부여

@RestController
public class MemberController {
  // 3. - 1 <Controller클래스에서>
  // ( 프라이빗 'Service' 들고 오기 )
  private MemberService memberService;
  // <8.1 마지막>

  @Autowired
  public MemberController(MemberService memberService){
    this.memberService = memberService;
  }


  // 기능 api 넣고 싶은대로 넣기
  // <8. 마지막>
  @PostMapping("/members")
  public void insertMember() {
    memberService.regMember();
  }

}

