package com.green.basic_board2.controller;

import com.green.basic_board2.dto.BoardDTO;
import com.green.basic_board2.mapper.BoardMapper;
import com.green.basic_board2.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  //게시글 등록 API
  @PostMapping("/boards")
  public void negBoard(@RequestBody BoardDTO boardDTO){
    System.out.println("열려라 !! 게시글 등록 API 호출 !!!");
    System.out.println(boardDTO);
    boardService.insertBoard(boardDTO);
  }


  // 실습 1
  @PutMapping("/boards/{boardNum}")
  public void updateBoard2(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO) {
    System.out.println("하이 siri 게시글 수정 API 호출!!!");
    System.out.println(boardDTO);
    boardDTO.setBoardNum(boardNum);
    //boardService.updateBoard2(boardDTO);
  }

  // 실습 2
  @DeleteMapping ("/boards/{boardNum}")
  public int deleteBoard(@PathVariable("boardNum") int boardNum){
    int result = boardService.deleteBoard(boardNum);
    return result; //삭제된 행의 갯수
  }

  // 실습 BoardList
  @GetMapping("")
  public List<BoardDTO> getBoard(){
    List<BoardDTO> boardList = boardService.getBoardList();
    return boardList;
  }

  // 실습 BoardDetail
  @GetMapping("/{boardNum}")
  public BoardDTO getBoardDetail(@PathVariable("boardNum") int boardNum){
    return boardService.getBoardDetail(boardNum);
  }

  // 실습 BoardList2 - 제목검색
  @GetMapping("/search/{title}")
  public List<BoardDTO> searchTitle(@PathVariable("title") String title){
    return boardService.searchTitle(title);
  }

}