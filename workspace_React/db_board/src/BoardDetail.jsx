import React, { useEffect, useState } from 'react'
import styles from './BoardDetail.module.css'
import axios from 'axios';
import { useNavigate, useParams } from 'react-router-dom';

const BoardDetail = () => {

  //-----------------------------------------------------------//
  // 원하는 페이지로 이동하는 함수 "(버튼 -> 글작성 창) 가고 싶으니까"
  const nav = useNavigate();
  //-----------------------------------------------------------//


  //-----------------------------------------------------------//
  //목록화면에서 클릭한 게시글의 글 번호를 받아와야하는데..
  // " useParams() 훅을 사용하면 URL Parameter로 전달되는 데이터를 받을 수 있음 
  // " useParams() 는 데이터를 객체타입으로 리턴 
  const {boardNum} = useParams();
  console.log(boardNum);
  //-----------------------------------------------------------//

  
  //-----------------------------------------------------------//
  //컴포넌트가 마운트되면 조회수를 1증가 시킨다 <- [첨부] 상세정보 조회 (함수화 : getboardDetail() )
  useEffect(() => {
    axios.put(`/api/boards/read-cnt/${boardNum}`)
    .then(res => {getboardDetail()})
    .catch(error => console(error));
  }, []);


  //-----------------------------------------------------------//
  //조회한 상세정보를 저장할 state 변수 만들기
  const [board, setBoard] = useState({});
  //-----------------------------------------------------------//

  //-----------------------------------------------------------//
  //상세정보 조회 ( 함수화 getboardDetail() )
  const getboardDetail = () => {
    axios.get(`/api/boards/${boardNum}`)
    .then(res => {
      console.log(res.data);
      setBoard(res.data);
    })
    .catch(error => console(error));
  }


  //-----------------------------------------------------------//
  //버튼을 누르면 삭제되는 기능 = 함수
  const deleteBoard = () => {

    //confirm에서 < 확인 클릭시 (리턴 true) /아니요 클릭시 (리턴 false)
    const result = confirm("어어.. 이거 못 되돌리는데 정말 삭제할까요 ?");


    //그러면 확인 클릭시 (리턴 true) 에만 삭제 진행
    if(result){
      axios.delete(`/api/boards/${board.boardNum}`)
      .then(res => {
      alert("게시물이 성공적으로 삭제되었습니다.");
      nav(`/`)
      })
      .catch(error => console.log(error));
    }

  }
  //-----------------------------------------------------------//

  return (
    <div>
      <div className={styles.title_div}>
        <h2>게시글 상세 정보 페이지</h2>
      </div>
      <div className={styles.table_div}>
        <table className={styles.detail_table}>
          <tbody>
            <tr>
              <td>작성일</td>
              <td>{board.createDate}</td>
              <td>작성자</td>
              <td>{board.writer}</td>
              <td>조회수</td>
              <td>{board.readCnt}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={5}>{board.title}</td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={5}>{board.content}</td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className={styles.btn_div}>
        {/* (목록가기) 버튼 */}
        <button type='button' 
          onClick={e => {nav(`/`)}}>목록가기</button>

        {/* (수정) 버튼 */}
        <button type='button' 
          onClick={e => {nav(`/update/${board.boardNum}`)}}>수정</button>

        {/* (삭제) 버튼 */}
        <button type='button' 
          onClick={e => deleteBoard()}>삭제</button>
      </div>
    </div>
  )
}

export default BoardDetail