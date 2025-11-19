import axios from 'axios';
import React, { useEffect, useState } from 'react'
import styles from './BoardList.module.css';
import { useNavigate } from 'react-router-dom';

const BoardList = () => {

  // 원하는 페이지로 이동하는 함수 "(버튼 -> 글작성 창) 가고 싶으니까"
  const nav = useNavigate();
  
  //검색한 데이터를 저장할 state 변수
  const [BoardList, setBoardList] = useState([]);

  //컴포넌트가 마운트되면 게시글 목록을 받아온다
  //마운트 될 때만 서버에서 데이터 받아오기
  useEffect(() => {    
    axios.get('/api/boards')
    .then(res => {
      console.log(res.data);
      setBoardList(res.data);
    })
    .catch(error => console.log(error));
  }, []);

  return (
    // < css에 이름 만들 때 ('-' 하이픈 금지) + className={style.(클래스네임)} >
    <div className={styles.container}>
      <div className={styles.title_div}>
        <h2>자유게시판</h2>
      </div>
      <div className={styles.search_div}>
        {/* 제목 / 작성자 (선택) */}
        <select>
          <option value="1">제목</option>
          <option value="1">작성자</option>
        </select>
        {/* 입력란 */}
        <input type='text' />
        {/* 버튼 */}
        <button type='button'>검색</button>
      </div>
      <div className={styles.list_div}>
        <table className={styles.list_table}>
          <colgroup>
            <col width={0}/>
            <col width={0}/>
            <col width={0}/>
            <col width={0}/>
            <col width={0}/>
          </colgroup>
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
            BoardList.length === 0
            ?
            <tr>
              <td colSpan={5}>조회된 데이터가 없습니다.</td>
            </tr>
            :
            BoardList.map((board, i) => {
              return (
                <tr key={i}>
                  <td>{BoardList.length - i}</td>
                  <td>
                    <span 
                      className={styles.clickable}
                      onClick={e => {
                      // <원하는 페이지로 워프>
                      nav(`/detail/${board.boardNum}`);
                    }}>{board.title}</span>
                  </td>
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
      <div className={styles.btn_div}>
        <button type='button' onClick={e => {nav(`/reg`)}}>글쓰기</button>
      </div>
    </div>
  )
}

export default BoardList