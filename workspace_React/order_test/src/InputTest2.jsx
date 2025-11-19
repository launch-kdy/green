import axios from 'axios'
import React, { useState } from 'react'

const InputTest2 = () => {
  //input 태그에 입력한 내용을 저장할 state 변수
  const [orderInfo, setOrderInfo] = useState({
    'name' : '',
    'price' : '',
    'cnt' : ''
  });

  console.log(orderInfo);

  //함수 소문자로 시작
  const regOrder = () => {
    //스프링 @리퀘스트에서 받는다 orders [경로]
    axios.post('/api/orders', orderInfo)
    .then(res => {})
    .catch(error => console.log(error));
  }


  return (
    <div>
      상품명 : <input value={orderInfo.name} type="text" onChange={e => {
        setOrderInfo({
          ...orderInfo,
          'name' : a.target.value
        });
      }}/> <br />
      상품가격 : <input value={orderInfo.price} type="text" onChange={e => {
        setOrderInfo({
          ...orderInfo,
          'price' : a.target.value
        });
      }}/> <br />
      수량 : <input value={orderInfo.cnt} type="text" onChange={e => {
        setOrderInfo({
          ...orderInfo,
          'cnt' : a.target.value
        });
      }}/> <br />
      <button type='button' onClick={e => regOrder()}>등록</button> 
    </div>
  )
}

export default InputTest2