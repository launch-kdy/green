package com.green.db_board.mapper;

import com.green.db_board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

  // 자유게시판
  public List<BoardDTO> getBoardList();

  // 게시글 작성 페이지 ( "등록 / 삭제 / 업데이트" 는 int or void) '외우고~'
  public int insertBoard(BoardDTO boardDTO);

  // 게시글 상세조회
  public BoardDTO getBoard(int boardNum);

  // 게시글 상세정보 페이지 (삭제)
  public int deleteBoard(int boardNum);

  //조회수(READ_CNT)1증가 - "빈값이 있으므로 매개변수로 채우기"
  public void updateReadCnt(int boardNum);

  //게시글 수정 페이지
  public void updateBoard(BoardDTO boardDTO);

}
