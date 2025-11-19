package com.green.restApi_test.controller;

import com.green.restApi_test.dto.BookDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
  // 1) 모든 도서정보를 조회하는 기능을 제공하는 REST API
  @GetMapping("/books")
  public String getBookAll(){
    System.out.println("모든 도서정보를 조회합니다");
    return "모든 도서정보를 조회성공";
  }
  // 2) 하나의 도서정보를 조회하는 기능을 제공하는 REST API
  @GetMapping("/books/{bookNum}")
  public String getBook(@PathVariable("bookNum") int booknum){
    System.out.println("하나의 도서정보를 조회합니다");
    System.out.println("bookNum = " + booknum);
    return "111";
  }
  // 3) 하나의 도서정보를 등록하는 기능을 제공하는 REST API (도서등록시도서명, 저자, 도서내용, 가격정보가필요)
  @PostMapping("/books")
  public String insertBook(@RequestBody BookDTO bookDTO){
    System.out.println("하나의 도서정보를 등록합니다");
    System.out.println(bookDTO);
    return "222";
  }
  // 4) 하나의 도서정보를 삭제하는 기능을 제공하는 REST API
  @DeleteMapping("/books/{bookNum}")
  public String deleteBook(@PathVariable("BookNum") int bookNum){
    System.out.println("하나의 도서정보를 삭제합니다");
    System.out.println("bookNum = " + bookNum);
    return "333";
  }

  // 5) 하나의 도서정보에서 도서명과 저자,도서가격을 수정하는 기능을 제공하는 REST API
  @PutMapping("/book/{bookNum}")
  public String updateBook(@PathVariable("bookNum") int bookNum, @RequestBody BookDTO bookDTO){
    System.out.println("하나의 도서정보에서 도서명과 저자,도서가격을 수정합니다");
    System.out.println();
    System.out.println();
    return "수정완료";
  }

  @GetMapping("/bookList")
  public List<BookDTO> geBookList(){
    List<BookDTO> bookList = new ArrayList<>();
    bookList.add(new BookDTO(1, "자바 기초", "김개발", "과연 자바에 대한 기초를 이해 할 수 있을까요.", 20000));
    bookList.add(new BookDTO(2, "웹 페이지 제작하기", "윤개발", "과연 웹 페이지 제작을 할 수 있을까요.", 15000));
    bookList.add(new BookDTO(3, "리액트 따라하기", "박개발", "과연 리액트가 그렇게 간단 할까요.", 30000));
    bookList.add(new BookDTO(4, "동남아 여행", "김여행", "여행시 호신술을 배울 수 있습니다.", 15000));
    bookList.add(new BookDTO(5, "한식 레시피", "이요리", "둥글레차에 대한 기초도 배울 수 있습니다.", 20000));
    return bookList;
  }


}

