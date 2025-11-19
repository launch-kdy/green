import axios from 'axios';
import React, { useState } from 'react'

const InputTest3 = () => {
  // <2번> 이름 : 국어점수 : 영어점수 : 주소 : input 태그에 입력한 정보를 저장할 state 변수
  const [studentInfo, setStudentInfo ] = useState({
    'name' : '',
    'korScore' : 0, // 몰랐던 사실) 숫자는 초기 값 0
    'engScore' : 0, // 몰랐던 사실) 숫자는 초기 값 0
    'addr' : ''
  });

  //<마지막> 테스트해보자
  console.log(studentInfo)

  //모르겠음) 일단 화살표 함수를 만들어보자 -> 그안에 axios도 넣어보자
  //해설) '등록 버튼 클릭 시 실행 함수를 만드는 것이다.'
  const regStudent = () => {
    //모르겠음) ('/api/students/, (모든데이터가 들어있는 객체=여기서는 studentInfo)) 
    axios.post('/api/students', studentInfo)
    .then(res => {}) //왜 res 데이터가 안 들어가는 가 ? - <없으면 굳이 안 넣어도 된다.> 강박 갖지 말자
    .catch(error => console.log(error));
  }

  return (
    //inout 인풋태그 가지고 놀 때는, 이제부터 [value 태그를 들고오자]
    //onChange={e => {}} onChange (e 의 값이)값이 바뀌면
    // 여담으로 'e 는 event의 앞 글자' 였다. 쫄 거 없다.
    // e.target.value => e.(이벤트가)target(발생한 태그의).value(값)
    <div>
      이름 : <input value={studentInfo.name} type="text" onChange={e => {
        setStudentInfo({
          ...studentInfo, //원래 데이터 그대로 들고오고
          'name' : e.target.value //name의 value 값을 들고 오겠다
        });
      }} /> <br />
      국어점수 : <input value={studentInfo.korScore} type="text" onChange={e => {
        setStudentInfo({
          ...studentInfo,
          'korScore' : e.target.value
        });
      }} /> <br />
      영어점수 : <input value={studentInfo.engScore} type="text" onChange={e => {
        setStudentInfo({
          ...studentInfo,
          'engScore' : e.target.value
        });        
      }} /> <br />
      주소 : <input value={studentInfo.addr} type="text" onChange={e => {
        setStudentInfo({
          ...studentInfo,
          'addr' : e.target.value
        });        
      }} /> <br />
      <button type='button' onClick={(e) => {
        regStudent(); //등록버튼을 누르면 regStudent가 실행된다
        }}>등록</button>
    </div>
  )
}

export default InputTest3