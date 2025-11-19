package com.green.basic_board.service;

//-------------------//
//까먹은 개념 IOC + DI//
//-------------------//
// ( IOC ) : 스프링이 '알아서 객체를 만들게 한다'
// - 1. 객체 생성하려는 클래스는 반드시 기본패키지 안에서 만든다
// - 2. 객체 생성이 필요한 클래스 위에 객체 생성을 명령하는 어노테이션을 추가한다.

// ( DI ) : 스프링이 만든 객체를 '우리가 가져와서 사용한다'

import com.green.basic_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//핵심기능을 (쿼리 작업) 제공하는 메서드 구현
@Service
public class BoardService {
  private BoardMapper boardMapper;

  // BoardService 클래스 생성자
  // 생성자를 이용한 의존성 주입
  // (미리 생성된 객체를 매개변수에 주입시켜줌)
  @Autowired
  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  //모든 게시글을 조회하는 기능 <추상메서드가 아님 - 중괄호 있어야 함{}>
  public void getBoardList(){

  }

  //하나의 게시글을 조회하는 기능
  public void getBoard(){

  }

  //하나의 게시글을 등록하는 기능
  public void regBoard(){
    boardMapper.insertBoard();
  }

  //하나의 게시글을 삭제하는 기능
  public void removeBoard(){
    boardMapper.deleteBoard();
  }

  //(5) 글번호가 2번인 게시글의 제목을 'java' 내용을 '수정하는 내용'으로 수정하는 기능=(메서드)
  public void upgradeBoard(){
    boardMapper.updateBoard();
  }

}
