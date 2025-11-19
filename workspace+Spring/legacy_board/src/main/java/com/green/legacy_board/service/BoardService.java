package com.green.legacy_board.service;

import com.green.legacy_board.dto.BoardDTO;
import com.green.legacy_board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
  private final BoardMapper boardMapper;

  public List<BoardDTO> getBoardList(){
    return boardMapper.getList();
  }

  public void boardWrite(BoardDTO boardDTO) { boardMapper.write(boardDTO);
  }

  //실습
  public BoardDTO getDetail(int boardNum) { return boardMapper.getDetail(boardNum); }

  //게시글 삭제
  public void delete(int boardNum) {
    boardMapper.delete(boardNum);
  }


  //게시글 수정
  public void update(BoardDTO boardDTO){
    boardMapper.update(boardDTO);
  }

}
