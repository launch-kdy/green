import axios from 'axios';
import React, { useState } from 'react'

const BoardDetail = () => {

  const [boardNum, setBoardNum] = useState('');
  
  //상세 조회 데이터를 저장할 state 변수
  const [board, setBoard] = useState({});

  //표의 표시 여부를 저장하는 state 변수
  const [isShow, setIsShow] = useState(true);

  const regBoard = () => {
    //표를 보이게 변경
    setIsShow(true);

    axios.get(`/api/boards/${boardNum}`)
    .then(res => {
      console.log(res.data)

      //조회를 하고나서 없는 번호라면 (res.data가 빈 문자라면..)
      if(res.data === ''){
        alert('없는 번호 입니다');
        setIsShow(false)
      }

      setBoard(res.data)
    })
    .catch(error => console.log(error));
  }

  return (
    <div>
      <h4>게시글 상세 정보 조회 페이지</h4>
      <div>
        <span>조회할 게시글 번호를 입력하세요</span>
        <input type='text' onChange={(e) => {setBoardNum(e.target.value)}}/>
        <button type='button' onClick={e => regBoard()}>조회</button>
      </div>
      {
        isShow &&
        <table border='1'>
        <tbody>
          <tr>
            <td>글번호</td>
            <td>{board.boardNum}</td>
            <td>조회수</td>
            <td>{board.readCnt}</td>
          </tr>
          <tr>
            <td>작성자</td>
            <td>{board.writer}</td>
            <td>작성일자</td>
            <td>{board.createDate}</td>
          </tr>
          <tr>
            <td>제목</td>
            <td colSpan={3}>{board.title}</td>
          </tr>
          <tr>
            <td>내용</td>
            <td colSpan={3}>{board.content}</td>
          </tr>
        </tbody>
      </table>
      }
    </div>
  )
}

export default BoardDetail