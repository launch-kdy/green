package com.green.db_board.service;

import com.green.db_board.dto.BoardDTO;
import com.green.db_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BoardService {
  //객체선언
  private BoardMapper boardMapper;
  //생성자 생성
  @Autowired
  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  //자유게시판
  public List<BoardDTO> getBoardList(){
    return boardMapper.getBoardList();
  }

  // 게시글 작성 페이지 (등록은 int or )
  public int insertBoard(BoardDTO boardDTO){
    return boardMapper.insertBoard(boardDTO);
  }

  // 게시글 상세 조회
  public BoardDTO getBoard(int boardNum){
    return boardMapper.getBoard(boardNum);
  }

  // 게시글 상세정보 페이지 (삭제)
  public int deleteBoard(int boardNum){
    return boardMapper.deleteBoard(boardNum);
  }

  //조회수(READ_CNT)1증가
  public void updateReadCnt(int boardNum) { boardMapper.updateReadCnt(boardNum); }

  //게시글 수정 페이지
  public void updateBoard(BoardDTO boardDTO) { boardMapper.updateBoard(boardDTO); }

}
