package com.green.basic_board2.controller;

import com.green.basic_board2.dto.MemberDTO;
import com.green.basic_board2.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
  private MemberService memberService;

  public MemberController(MemberService memberService){
    this.memberService = memberService;
  }

  //회원가입 API
  @PostMapping("/members")
  public void join(@RequestBody MemberDTO memberDTO){
    memberService.join(memberDTO);
  }

  //API
  //조회니까 @GetMapping
  @GetMapping("/test1")
  public String getMemberName(){
    String result = memberService.getMemberName();
    return result;
  }

  //API
  //(모든회원의) 조회 @GetMapping
  @GetMapping("/test2")
  public List<String> getMemberNameAll(){
    List<String> result = memberService.getMemberNameAll();
    return result;
  }

  //실습 1 1 MemberList.jsx - getMemberAll
  @GetMapping("/members")
  public List<MemberDTO> getMemberAll(){
    List<MemberDTO> memberList = memberService.getMemberAll();
    return memberList;
  }
}
