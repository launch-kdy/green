import React, { useState } from 'react'
import styles from './RegForm.module.css'
import { useNavigate } from 'react-router-dom'
import axios from 'axios';

const RegForm = () => {

  const nav = useNavigate();

  // 입력된 모든 정보갖는 state 변수
  const [boardData, setBoardData] = useState ({
    'title' : '',
    'writer' : '',
    'content' : ''
  });
  
  const handleBaordData = (e) => {
    setBoardData({
      ...boardData,
      [e.target.name] : e.target.value
    });
  }
  
  //글등록 버튼 클릭시 실행함수
  const regBoard = () => {
    if(boardData.title === '' || boardData.writer === ''){
      alert('제목과 작성자는 필수입력입니다');
      return ;
    }

    axios.post('/api/boards', boardData)
      .then(res => {
        alert('게시글 등록이 되었습니다. \n 게시글 목록페이지로 이동합니다.');
        nav('/');
        //게시글 목록으로 이동
      })
      .catch(error => console.log(error));

  }

  return (
    <div className={styles.container}>
      <div className={styles.header_div}>
        <h1>게시글 작성 페이지</h1>
      </div>
      <div className={styles.content_div}>
        <table className={styles.table_div}>
          <tbody>
            <tr>
              <td>제목</td>
              <td>
                <input 
                  type='text' 
                  name='title'
                  value={boardData.title}
                  onChange={e => handleBaordData(e)}
                  />
              </td>
            </tr>
            <tr>
              <td>작성자</td>
              <td>
                <input
                  type='text' 
                  name='writer'
                  value={boardData.writer}
                  onChange={e => handleBaordData(e)}
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td>
                <textarea 
                  name='content'
                  value={boardData.content}
                  onChange={e => handleBaordData(e)}                
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className={styles.btn_div}>
        <button type='button' 
          onClick={regBoard}>글등록</button>
      </div>
    </div>
  )
}

export default RegForm