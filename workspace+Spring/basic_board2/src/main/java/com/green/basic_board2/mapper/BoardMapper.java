package com.green.basic_board2.mapper;

import com.green.basic_board2.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


// 메서드의 리턴타입
// insert update delete의 리턴타입 : ( 정석 - int ) OR void
// insert update delete 쿼리의 실행 결과는 쿼리의 영향을 받는 행의 갯수
@Mapper // 와드 같은 거 (실행 시킬것임을 미리 알림)
public interface BoardMapper {
  // .xml 에서 만든 쿼리를 실행시키는 메서드 생성
  // (이번에는 게시글 등록 쿼리 실행 추상메서드 - 연습 -)
  // (오타나면 골때리니까 .xml에 있는 ID 긁어 와라.)
  public void insertBoard(BoardDTO boardDTO);
  //쿼리의 '빈 값'은 = <메서드의 매개변수로 전달함>
  //매개변수는 하나의 데이터만 전달 <빈값이 여러개라도>
  // <편하게 BoardDTO boardDTO 긁어오면 한방에 해결됨>

    // 게시글 수정 쿼리를 실행하는 추상메서드
    public int updateBoard(BoardDTO boardDTO);

    //실습 1
    public void updateBoard2(BoardDTO boardDTO);

    //실습 2
    // delete는 지워지는 그행의 갯수를 묻는 것이므로
    // 매개변수는 적절히 ex) int boardNum or String title
    public int deleteBoard(int boardNum);

    //실습 BoardList
    public List<BoardDTO> getBoardList();

    //실습 BoardDetail
    public BoardDTO getBoardDetail(int boardNum);

    //실습 BoardList2 - 제목검색
    public List<BoardDTO> searchTitle(String title);
}
