import React, { useEffect, useState } from 'react'
import style from './UpdateForm.module.css'
import axios from 'axios'
import { useNavigate, useParams } from 'react-router-dom'

const UpdateForm = () => {

  //버튼 클릭시 & 수정후 페이지 뒤로가기
  const nav = useNavigate();

  //URL로 전달되는 글번호
  const {boardNum} = useParams();
  //console.log(boardNum);

  // 조회한 정보를 저장할 state 변수
  const [board, setBoard] = useState({});

  // 입력한 제목과 내용을 저장할 state 변수
  const [inputData, setInputData] = useState({
    'title' : '',
    'content' : ''
  });

  //제목과 내용을 입력할 때마다 실행하는 함수
  const handleInputData = (e) => {
    setInputData({
      ...inputData,
      [e. target.name] : e.target.value
    });
  }

  //console.log(inputData);


  // board 가 같이 바뀔 때만 실행 ! (심지어 마운트해도 실행 안 됨)
  // 의존성 배열에 board를 넣는다면, board값 바껴서, 리렌더링 될 때도 실행
  useEffect(() => {
    //if(board가 마운트시점이 아니면)
    if(board.title !== undefined){
      setInputData({
      'title' : board.title,
      'content' : board.content       
      });
    }
  }, [board]);

  // 마운트되면 수정하려는 게시글 정보를 먼저 '조회' 해야 함
  useEffect(() => {
    axios.get(`/api/boards/${boardNum}`)
    .then(res => {
      //console.log(res.data);
      setBoard(res.data);
    })
    .catch(error => console.log(error));
  }, []);

  //수정버튼 클릭시 실행함수
  const updateBoard = () => {
    axios.put(`/api/boards/${boardNum}`, inputData)
    .then(res => {
      alert('수정이 성공적으로 완료되었습니다');
      nav(`/detail/${boardNum}`);
    })
    .catch(e => console.log(e))
  }

  return (
    <div>
      <div>
        <h2>게시글 수정 페이지</h2>
        작성자 : {board.writer} <br />
        작성일 : {board.createDate} <br />
        제목 : <input type='text' 
                value={inputData.title} 
                name='title'
                onChange={e => handleInputData(e)}
                /> <br />
        내용 : <textarea 
                value={inputData.content}
                name='content'
                onChange={e => handleInputData(e)}
                > </textarea> <br />
        <button type='button' 
                onClick={e => nav(-1)}>뒤로가기</button>
        <button type='button'onClick={e => updateBoard()}>수정</button>
      </div>
    </div>
  )
}

export default UpdateForm