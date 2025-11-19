import axios from 'axios';
import React, { useState } from 'react'

const MemberRegForm = () => {
  const [memberData , setMemberData] = useState({
    'memId' : '',
    'memPw' : '',
    'confirmPw' : '',
    'memName' : '',
    'memAge' : ''
  });
  
  const hanbleMemberData = (e) => {
    setMemberData({
      ...memberData,
      [e.target.name] : e.target.value
    });
  }

  const regMember = () => {
    if(memberData.memPw !== memberData.confirmPw ){
      alert('비밀번호를 확인하세요');
      return ;
    }

    axios.post('/api/members', memberData)
    .then(res => {
      alert('등록 성공!')
    })
    .catch(error => console.log(error))
  }

  return (
    <div>
      <h3>회원등록</h3>
      아이디
      <input type="text" 
        name='memId' 
        value={memberData.memId} 
        onChange={e => hanbleMemberData(e)}/> <br />
      비번
      <input type="password" 
        name='memPw' 
        value={memberData.memPw} 
        onChange={e => hanbleMemberData(e)}/> <br />
      비번확인
      <input type="password" 
        name='confirmPw' 
        value={memberData.confirmPw} 
        onChange={e => hanbleMemberData(e)}/> <br />
      이름
      <input type="text" 
        name='memName' 
        value={memberData.memName} 
        onChange={e => hanbleMemberData(e)}/> <br />
      나이
      <input type="text" 
        name='memAge' 
        value={memberData.memAge} 
        onChange={e => hanbleMemberData(e)}/> <br />
      <button type='button'onClick={e => regMember()}>회원가입</button>
    </div>
  )
}

export default MemberRegForm