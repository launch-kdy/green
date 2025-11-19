import axios from 'axios'
import React, { useEffect, useState } from 'react'

//자바에서 전달받은 학생의 이름, 국어, 영어 정보를 화면에 표현하시오.
const Axios_3 = () => {
  // (2.) 마지막으로 출력을 할 수 있게 객체를 생성한다
  // status 변수의 초기값은 최종데이터의 자료형과 일치시켜주는 게 좋음
  const [student, setStudent] = useState({});

  // (3.) 마무리로 useEffect + [] 로 깔끔 스무스하게 무한반복 없애기
  useEffect(()=>{
    // (1.) react리엑트에서도 일단 get을 생성해준다. + axios
    axios.get('/api/getStu') // url 경로
    .then((res) => {
      console.log(res.data);
      setStudent(res.data);
    }) // 화살표 함수
    .catch((error) => {
      console.log(error);
    }) // 화살표 함수
  }, []);


  return (
    <>
      <div>이름 : {student.name}</div>
      <div>국어 : {student.korScore}</div>
      <div>영어 : {student.engScore}</div>
    </>
  )
}

export default Axios_3