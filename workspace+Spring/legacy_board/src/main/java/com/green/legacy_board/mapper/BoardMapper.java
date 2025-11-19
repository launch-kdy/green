package com.green.legacy_board.mapper;

import com.green.legacy_board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

  public List<BoardDTO> getList();
  public void write(BoardDTO boardDTO);

  //실습
  public BoardDTO getDetail(int boardNum);

  //게시글 삭제
  public void delete(int boardNum);

  //게시글 수정
  public void update(BoardDTO boardDTO);

}
