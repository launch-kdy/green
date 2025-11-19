import axios from 'axios';
import React, { useState } from 'react'

const DeleteForm = () => {
  const [boardNum, setBoardNum] = useState('');

  const deleteBoard = () => {
    axios.delete(`/api/boards/${boardNum}`)
    .then(res => {
      alert(res.data === 1 ? '정상 삭제' : '일치하는 글번호 없음');
    })
    .catch(error => console.log(error));
  }  

  return (
    <div>
      <h2>게시글 삭제</h2>
      글번호
      <input type="text" value={boardNum} onChange={e => {
        setBoardNum(e.target.value);
      }}/> <br />
      <button type='button' onClick={e => deleteBoard()}>삭제</button>
    </div>
  )
}

export default DeleteForm