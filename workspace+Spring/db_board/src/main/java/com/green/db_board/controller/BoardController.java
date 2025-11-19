package com.green.db_board.controller;

import com.green.db_board.dto.BoardDTO;
import com.green.db_board.mapper.BoardMapper;
import com.green.db_board.service.BoardService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  public BoardController(BoardService boardService) {
    this.boardService = boardService;
  }

  //자유게시판 API
  @GetMapping("")
  public List<BoardDTO> getList(){
    return boardService.getBoardList();
  }

  // 게시글 작성 페이지 (등록은 int or )
  // 리액트 (정보입력) -> 역으로 스프링으로 = " @RequestBody BoardDTO boardDTO " 고정
  @PostMapping("")
  public void insertBoard(@RequestBody BoardDTO boardDTO){
    //리액트에서 전달받은 데이터 확인용
    System.out.println(boardDTO);
    //쿼리실행용
    boardService.insertBoard(boardDTO);
  }

  // 게시글 상세정보 조회 API
  @GetMapping("/{boardNum}")
  public BoardDTO getBoardDetail(@PathVariable("boardNum") int boardNum){
    return boardService.getBoard(boardNum);
  }

  // 게시글 상세정보 페이지 API (삭제)
  @DeleteMapping("/{boardNum}")
  public int deleteBoard(@PathVariable("boardNum") int boardNum){
    return boardService.deleteBoard(boardNum);
  }

  //조회수(READ_CNT)1증가 API
  @PutMapping("/read-cnt/{boardNum}")
  public void updateReadCnt(@PathVariable("boardNum") int boardNum){
    boardService.updateReadCnt(boardNum);
  }

  // 게시글 수정 페이지 - (리액트에서 수정한 제목/내용 들고오기)
  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO){

    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }


}
