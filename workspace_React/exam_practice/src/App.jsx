import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import BoardList from './BoardList'
import axios from 'axios';
import BoardDetail from './BoardDetail'

function App() {
  //게시글 목록을 저장할 state 정수
  const [boardList, setBoardList] = useState([]);

  //선택한 게시글 정보를 저장할 state 정수
  const [selectedBoard, setSelectedBoard] = useState({});

  //BoardDetail 컴포넌트가 보일지말지 결정할 state 변수
  const [isShow, setIsShow] = useState(false);

  useEffect(() => {
    axios.get('/api/boardList')
    .then((res) => {
      console.log(res.data);
      //조회한 데이터 넣기
      setBoardList(res.data);
    })
    .catch((error)=>{
      console.log(error);
    });
  },[]);

  //props 를 써보자
  return (
    <>
      <BoardList 
        boardList={boardList} 
        setSelectedBoard={setSelectedBoard}
        setIsShow={setIsShow}
      />
      
      {
        isShow         
        ?         
        <BoardDetail 
          selectedBoard={selectedBoard}
        />
        :
        null
      }
      
    </>
  )
}

export default App
