package com.green.legacy_board.controller;

import com.green.legacy_board.dto.BoardDTO;
import com.green.legacy_board.dto.MemberDTO;
import com.green.legacy_board.service.BoardService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {
  private final BoardService boardService;

  //매개변수에 model 인터페이스 객체를 생성하면 html로 이동 시 필요데이터를 가져갈 수 있음
  @GetMapping("")
  public String getBoardList(Model model){
    //게시글 목록조회
    List<BoardDTO> boardList = boardService.getBoardList();

    //목록 데이터를 html로 가져오기
    model.addAttribute("boardList", boardList);

    //보여질 html 파일명을 리턴
    return "board-list";
  }

  @GetMapping("/detail")
  public String getBoardDetail(){
    //보여질 html 파일명을 리턴
    return "board-detail";
  }

  @GetMapping("/writeForm")
  public String goWriteForm(){
    return "writeForm";
  }
  //게시글 등록
  @PostMapping("/write")
  public String write(@ModelAttribute BoardDTO boardDTO, HttpSession session){
    //세션에 저장된 데이터 가져오기
    //세션에 가져온 데이터는 Object 타입이기 때문에 형변환 후 사용
    Object loginData = session.getAttribute("loginInfo");
    MemberDTO loginInfo = (MemberDTO)loginData;

    //로그인 정보에서 id를 추출하고 추출한 id는 loginDTO
    boardDTO.setWriter(loginInfo.getId());

    //게시글 등록 쿼리 실행
    boardService.boardWrite(boardDTO);
    //게시글 목록 페이지로 이동
    return "redirect:/boards";
  }

  //게시글 상세보기 페이지
  @GetMapping("/detail/{boardNum}")
  // 매개변수에 , Model model 추가함
  public String detail(@PathVariable("boardNum") int boardNum, Model model){
      System.out.println("전달받은 글번호 : " + boardNum);

      //(실습)게시글 상세페이지(board-direct.html)
      model.addAttribute("boardInfo", boardService.getDetail(boardNum));

      return "board-detail";
    }

  //게시글 삭제
  @GetMapping("/delete/{boardNum}")
  //게시글 삭제 쿼리 실행
  public String delete(@PathVariable("boardNum") int boardNum){
    boardService.delete(boardNum);

    //게시글 목록 페이지로 이동
    return "redirect:/boards";
  }

  //게시글 수정
  @GetMapping("/update/{boardNum}")
  public String goUpdate(@PathVariable("boardNum") int boardNum, Model model){
    //게시글의 상세정보조회
    model.addAttribute("boardDetail", boardService.getDetail(boardNum));

    return "board-update";
  }

  //글수정
  @PostMapping("/update")
  public String update(@ModelAttribute BoardDTO boardDTO){
    System.out.println(boardDTO);

    boardService.update(boardDTO);

    //상세페이지로 이동
    return "redirect:/boards/detail/" + boardDTO.getBoardNum();
  }

}
