import axios from 'axios';
import React, { useEffect, useState } from 'react'
import './BoardList.css'

const BoardList = () => {
  
  const [boardData, setBoardData] = useState([]);

  useEffect(() => {
    axios.get('/api/boards')
      .then(res => {
      console.log(res.data);
      setBoardData(res.data);
      })
      .catch(error => console.log(error));
  }, []);


  return (
    <div>
      <h4>게시글 목록 페이지</h4>
      <p>총 5개의 게시글이 조회되었습니다</p>
      <table className='container'>
        <thead>
          <tr>
            <td>No</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
            <td>조회수</td>
          </tr>
        </thead>
        <tbody>
        {
          boardData.map((board, i) => {
            return (
              <tr key={i}>
                <td>{boardData.length - i}</td>
                <td>{board.title}</td>
                <td>{board.writer}</td>
                <td>{board.createDate}</td>
                <td>{board.readCnt}</td>
              </tr>
            )
          })
        }
        </tbody>
      </table>
    </div>
  )
}

export default BoardList