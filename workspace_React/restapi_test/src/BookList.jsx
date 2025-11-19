import React from 'react'
import './BookList.css'

  //props를 괄호 안에 넣자
const BookList = (props) => {
  //실행시켜보자
  console.log(props);
  return (
    //<1> 큰 div 태그를 감싸고, (오류방지)
    // 리턴안에 테이블을 만들어준다.
    <div>
      <h5>도서목록</h5>
      <table className='container'>
        <thead>
          <tr>
            <td>No</td>
            <td>도서번호</td>
            <td>도서명</td>
            <td>저자</td>
            <td>도서가격</td>
          </tr>
        </thead>
        <tbody>
          {//자바 스크립트 쓸거니까 크게 중괄호 {} 묶어주고 보호해주기

          //props를 괄호 안에 넣자
            props.bookList.map((e, i)=>{
              //그림그리기위해서 리턴생성
              return(
              <tr 
                key={i}
                onClick={() => {
                  props.setSelectedBook(e);
                  props.setIsShow(true);
                }}
              >
                <td>{props.bookList.length - i}</td>
                <td>{e.bookNum}</td>
                <td>{e.title}</td>
                <td>{e.writer}</td>
                <td>{e.price}</td>
              </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default BookList