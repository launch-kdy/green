import axios from 'axios';
import React, { useEffect, useState } from 'react'

const StuFront = () => {

  // 1 학급 목록 정보를 저장할 ustState 변수
  const [stuData, setStuData] = useState([]);

  // ( axios.all <활용> 만약 동시에 조회하고 싶다면 ? )
  // useEffect(() => {
  //   // [] 맨 앞에 객체를 넣고 api들을 넣어준다
  //   axios.all([axios.get('/api/classInfo'), axios.get('/api/
  //   students')])
  //   .then(axios.spread((res1, res2) => {
  //       console.log(res1.data);
  //       console.log(res2.data);
  //       setStuData(res1.data)
  //       setStuList(res2.data)
  //   }))
  //   .catch(error => console.log(error));
  // }, []);


  // 2 조회한 학생 목록 정보를 저장할 ustState 변수
  const [stuList, setStuList] = useState([]);


  // 1 컴포넌트가 마운트되면 stuList에서 상세정보를 조회
  useEffect(() => {
    axios.get('/api/classInfo')
    .then(res => {
      console.log(res.data);
      setStuData(res.data);
    })
    .catch(error => console.log(error))
  }, []);

  // 2 컴포넌트가 마운트되면 stuData에서 상세정보를 조회  
  useEffect(() => {
    axios.get('/api/students')
    .then(res => {
      console.log(res.data);
      setStuList(res.data);
      })  
    .catch(error => console.log(error));
  }, []);


  //select 박스 값이 (00반)을 선택했을 때 학생목록이 다시 조회하는 함수
  // 매개변수는 선택한 classNum 이다 (선택한 반 번호 value)
  const getStuList = (classNum) => {
    axios.get(`/api/students/${classNum}`)
    .then(res => setStuList(res.data))
    .catch(error => console.log(error))
  }

  return (
    <div>
      <select onChange={e => getStuList(e.target.value)}>
        <option value='0'>전체</option>
        {
          stuData.map((e, i) => {
            return (
              <option key={i} value={e.classNum}>{e.className}</option>
            )
          })
        }
      </select >
      <table border={1}>
        <thead>
          <tr>
            <td>No</td>
            <td>학급명</td>
            <td>학생명</td>
            <td>나이</td>
          </tr>
        </thead>
        <tbody>
          {
            stuList.map((stu, i) =>{
              return (
              <tr key={i}>
                <td>{i + 1}</td>
                <td>{stu.classDTO.className}</td>
                <td>{stu.stuName}</td>
                <td>{stu.stuAge}</td>
              </tr>)
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default StuFront