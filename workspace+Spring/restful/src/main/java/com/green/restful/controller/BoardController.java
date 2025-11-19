package com.green.restful.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class BoardController {

  //게시글 목록 조회 API
  //(게시글 목록 정보를 react로 전달하기 위해 만든 기능)
  @GetMapping("/boards")
  public String getBoardList(){
    System.out.println("게시글 목록 조회 실행");
    return "목록 조회 성공";
  }

  // <하나의> 게시글 정보를 조회하는 API - 변수 '한개' 저장
  // ( '/' + '데이터베이스 PK 넘버' = ex)/boards/1")
  //url에 변수를 작성하려면 {}를 사용한다.
  //{}안의 변수명은 마음대로 지정,
  //url로 전달되는 데이터는 PathVariable 어노테이션으로 받을 수 있다.
  //문법 - ('@PathVariable("변수명")' + '자료형') 데이터들을 받을 변수
  @GetMapping("/boards/{boardNum}") // 앞으로 여러개 넣을 예정일때 '/' + '{변수}' 입력 -> localhost:8080/boards/숫자
  public String getBoard(@PathVariable("boardNum") int a ){
    System.out.println("하나의 게시글 조회 실행");
    System.out.println("a = " + a);
    return "하나의 게시글 조회 성공";
  }

  // <하나의> 게시글 정보를 조회하는 API - 변수 '여러개' 저장
  @GetMapping("/boards/{boardNum}/{title}")
  public String getBoard2(@PathVariable("boardNum") int a, @PathVariable("title") String b){
    System.out.println(a);
    System.out.println(b);
    return "성공";
  }

  //게시글 등록 API
  //요청바디에 당겨 전달되는 데이터는 '@RequestBody' 어노테이션으로 받을 수 있다.
  //데이터를 받는 클래스의 멤버변수 이름이 요청 바디에 담겨 넘어오는 'key'와 동일하면 ex) title, writer
  //데이터를 받을 수 있다.
  @PostMapping("/boards")
  public String insertBoard(@RequestBody BoardDTO boardDTO){
    //1. 화면에서 입력된 게시글 정보를 가져온다.
    System.out.println(boardDTO.toString());

    //2. 가져온 데이터를 가지고 insert 커리를 실행한다.
    return "등록성공";
  }

  // <하나의> 게시글 정보를 삭제하는 API
  @DeleteMapping("/boards/{boardNum}")
  public String deleteBoard(@PathVariable("boardNum") int a){
    System.out.println("a = " + a);
    return "삭제 성공";
  }

  // <하나의> 게시글에 제목, 내용을 수정하는 API
  @PutMapping("/boards/{boardNum}")
  public String updateBoard(@RequestBody BoardDTO boardDTO, @PathVariable("boardNum") int a){
    System.out.println("a = " + a);
    System.out.println(boardDTO);
    return "수정성공";
  }

}
