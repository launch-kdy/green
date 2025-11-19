import axios from 'axios'
import React from 'react'

const Axios_1 = () => {
  //axios - spring(스프링)과, '데이터 통신'을 위해 사용하는 문법
  //.then ( 통신성공 ) .catch ( 통신실패 )

  //axios.post().then().catch();
  //axios.put().then().catch();
  //axios.delete().then().catch();

  axios.get('/api/getNum') //데이터 조회 시 사용

  .then((res) => {
    //error 매개변수는 성공에 대한 모든 정보를 가지고 있음
      console.log("통신성공");
      console.log(res);
      console.log(res.data);
    })
    //error 매개변수는 오류에 대한 모든 정보를 가지고 있음
    .catch((error) => {
      console.log("통신실패");
      console.log(error);
    });


  return (
    <div>Axios_1</div>
  )
}

export default Axios_1