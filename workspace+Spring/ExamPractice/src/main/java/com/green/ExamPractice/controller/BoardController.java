package com.green.ExamPractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Rest Controller 어노테이션을 만들어준다.
@RestController
public class BoardController {

  //게시글의 목록 데이터를 리액트로 전달 할 수 있는 API 만들기
  @GetMapping("/boardList")
  public List<BoardDTO> getBoardList(){
    List<BoardDTO> boardList = new ArrayList<>();
    boardList.add(new BoardDTO(1, "울산", "김자바", "그린컴", 11));
    boardList.add(new BoardDTO(2, "서울", "이자바", "옐로우컴", 22));
    boardList.add(new BoardDTO(3, "부산", "윤자바", "레드컴", 33));
    boardList.add(new BoardDTO(4, "대구", "박자바", "블루컴", 44));
    boardList.add(new BoardDTO(5, "대전", "홍자바", "블랙컴", 55));
    return boardList;
  }

}
