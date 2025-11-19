import axios from 'axios';
import React, { useState } from 'react'

const UpdateForm = () => {

  const [boardData, setBoardData] = useState({
    'boardNum' : '',
    'title' : '',
    'content' : ''
  })

  const handleBoardData = (e) => {
    setBoardData({
      ...boardData,
      [e.target.name] : e.target.value}
    );
  }

  const updateBoard = () => {
    axios.put('/api/boards/7', boardData)
    .then(res => alert('변경 성공 !'))
    .catch(error => console.log(error));
  }

  return (
    <div>
      <h2>게시글 정보 수정</h2>
      글번호
      <input type="text" name='boardNum' value={boardData.boardNum} onChange={e => handleBoardData(e)}/> <br />
      제목
      <input type="text" name='title' value={boardData.title} onChange={e => handleBoardData(e)}/> <br />
      내용
      <textarea cols={25} rows={5}  name='content' value={boardData.content} onChange={e => handleBoardData(e)}></textarea> <br />
      <button type='button' onClick={e => updateBoard()}>수정</button>
    </div>
  )
}

export default UpdateForm