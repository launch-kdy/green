import axios from 'axios';
import React, { useEffect, useState } from 'react'

const MemberList = () => {

  //조회된 회원목록을 저장할 state 변수
  const [memberList, setMemberList] = useState([]);

  // useEffect () => {} < 함수 + '의존성 배열 = 빈배열' >
  useEffect(() => {
    //먼저 적은 axuios 겟 덴 캐치 그대로 긁어와서 useEffect 안에 넣어 줌.
    axios.get('/api/members')
      .then(res => {
      console.log(res.data);
      setMemberList(res.data);
    })
    .catch(error => console.log(error));
  }, []);

  //spring에서 회원 목록 데이터 가져오기
  // (useEffect 안에 들어있음)

  return (
    <div>
      <h3> 실습 1 - 조회된 모든 회원의 아이디, 이름, 나이</h3>
      <table>
        <thead>
          <tr>
            <td>아이디</td>
            <td>이름</td>
            <td>나이</td>
          </tr>
        </thead>
        <tbody>
          {/* 조회되는 수 만큼 (갯수) map 함수 + return */}
          {
            memberList.map((member, i) => {
              return (
                <tr key={i}>
                  <td>{member.memId}</td>
                  <td>{member.memName}</td>
                  <td>{member.memAge}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default MemberList