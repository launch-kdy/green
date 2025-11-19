package com.green.basic_board2.service;

import com.green.basic_board2.dto.BoardDTO;
import com.green.basic_board2.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
  //3.1 객체를 선언
  private BoardMapper boardMapper;

  //3.2 생성자 생성 @Autowired (생성자가 하나 밖에 없으면 생략가능)
  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  //3. 게시글 등록 메서드
  public void insertBoard(BoardDTO boardDTO){
    System.out.println("게시글 등록을 시작해볼까요!");
    boardMapper.insertBoard(boardDTO);
    System.out.println("오~ 추카추카 등록완료");
  }

  // 게시글 수정 메서드
  public int updateBoard(BoardDTO boardDTO){
    System.out.println("게시글 수정해 게시글 수정해");
    //update 쿼리 실행 결과 영향울 받은 행의 갯수
    int result = boardMapper.updateBoard(boardDTO);
    System.out.println("옙~ 수정완료 했습니다^^");
    return result;
  }

  // 실습 1
  public void updateBoard2(BoardDTO boardDTO){
    System.out.println("실습 1 - 게시글 정보 수정해");
    boardMapper.updateBoard2(boardDTO);
    System.out.println("넵~ 수정완료 했습니다^^");
  }

  // 실습 2
  public int deleteBoard(int boardNum){
    System.out.println("실습 2 - 게시물 정보 삭제해");
    int result = boardMapper.deleteBoard(boardNum);
    System.out.println("옙~ 삭제완료 했습니다^^");
    return result;
  }

  // 실습 BoardList
  public List<BoardDTO> getBoardList(){
    return boardMapper.getBoardList();
  }

  // 실습 BoardDetail
  public BoardDTO getBoardDetail(int boardNum){
    return boardMapper.getBoardDetail(boardNum);
  }

  // 실습 BoardList2 - 제목검색
  public List<BoardDTO> searchTitle(String title){
    return boardMapper.searchTitle(title);
  }

}
