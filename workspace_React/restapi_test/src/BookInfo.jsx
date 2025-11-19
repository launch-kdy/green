import React, { useEffect, useState } from 'react'
import BookList from './BookList'
import BookDetail from './BookDetail'
import axios from 'axios';

const BookInfo = () => {
  // 도서 목록을 저장할 state 정수
  const [bookList, setBookList] = useState([]);

  //'선택한 주문정보'를 저장할 state 정수
  const [selectedBook, setSelectedBook] = useState({});

  //BookList 컴포넌트가 보일지말지 결정할 state 변수
  const [isShow, setIsShow] = useState(false);

  //<4> useEffect 화살표 함수 엑시오스 겟덴캐치, 무한반복 막는 빈배열 [] 을 만들어준다.
  useEffect(()=>{
    //인텔리제이에 있는 @GetMapping 주소
    axios.get('/api/bookList')
    .then((res) => {
      console.log(res.data);
      //조회한 데이터 넣기
      setBookList(res.data)
    })
    .catch((error) => {
      console.log("에러가 발생하였습니다");
    });
  },[]);

  return (
    <>
      <BookList 
        bookList={bookList}
        setSelectedBook={setSelectedBook}
        setIsShow={setIsShow}
      />
      {//자바스크립트 쓸거니까 크게 중괄호{}묶어주고 보호해주기
        isShow
        ?
        <BookDetail 
          selectedBook={selectedBook}
        />
        :
        null
      }
    </>
  )
}

export default BookInfo