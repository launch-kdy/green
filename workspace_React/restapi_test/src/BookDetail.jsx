import React from 'react'
import './BookDetail.css'

const BookDetail = (props) => {
  //<1> 리턴안에 테이블을 만들어준다
  return (
    <div>
    <h5>도서상세정보</h5>
    <div className='detail-div'>
      <table className='detail-table'>
        <tbody>
          <tr>
            <td>도서번호</td>
            <td>{props.selectedBook.bookNum}</td>
            <td>도서명</td>
            <td>{props.selectedBook.title}</td>
          </tr>
          <tr>
            <td>저자</td>
            <td>{props.selectedBook.writer}</td>
            <td>가격</td>
            <td>{props.selectedBook.price}</td>
          </tr>
          <tr>
            <td>도서소개</td>
            <td colSpan={3}>{props.selectedBook.intro}</td>
          </tr>
        </tbody>
      </table>
    </div>
    </div>
  )
}

export default BookDetail