package com.green.restful.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {

  //모든 사원 정보를 조회하는 api
  @GetMapping("/emps")
  public String getEmp(){
    System.out.println("모든 사원 정보조회 실행");
    return "조회완료";
  }

  //<한명의> 사원 정보를 조회하는 api
  @GetMapping("/emps/{empNum}")
  public String getEmpList(@PathVariable("empNum") int a){
    System.out.println("a = " + a);
    return "하나의 사원 조회완료";
  }

  //<한명의> 사원 정보를 등록하는 api (사원명, 직급, 급여 정보)
  @PostMapping("/emps/{empNum}")
  public String postEmp(@RequestBody EmpDTO empDTO, @PathVariable("empNum") int a){
    System.out.println(empDTO.toString());
    return "등록 성공";
  }

  //<한명의> 사원을 삭제하는 api
  @DeleteMapping("/emps/{empNum}")
  public String getEmp(@PathVariable("empNum") int a){
    System.out.println("a = " + a);
    return "삭제 성공";
  }

  //<한명의> 사원 정보를 수정하는 api (직급, 급여를 수정)
  @PutMapping("/emps/{empNum}")
  public String updateEmp(@RequestBody EmpDTO empDTO, @PathVariable("empNum") int a){
    System.out.println("a = " + a);
    System.out.println(empDTO);
    return "수정 성공";
  }

}
