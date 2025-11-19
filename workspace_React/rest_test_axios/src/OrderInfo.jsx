import React, { useEffect, useState } from 'react'
//<2> OrderList import 해준 거
import OrderList from './OrderList'
//<3> OrderDetail import 해준 거
import OrderDetail from './OrderDetail'
import axios from 'axios'

const OrderInfo = () => {
  //<5> 함수 작성해서 본격적으로 기능 삽입하기 - < useState로 반복 시키기 >
  //<5-1> '주문 목록'을 (저장)할 state 정수
  const [orderList, setOrderList] = useState([]);

  //<5-2> '선택한 주문정보'를 (저장)할 state 정수 - < useState로 반복 시키기 >
  const [orderDetail, setOrderDetail] = useState ([]);

  //<4> useEffect 화살표함수 엑시오스 겟덴캐치,무한반복 막는 빈배열[] 을 만들어준다.
  useEffect(() => {
    //인텔리제이에 있는 @GetMapping 주소
    axios.get('/api/orderList')
    .then((res) => {
      console.log(res.data);
      //조회한 데이터 넣기
      setOrderList(res.data)
    })
    .catch((error) => {
      console.log("에러가 발생하였습니다.");
    });
  },[]);


  //props를 써야하는 곳
  return (
    <>
      <OrderList 
        orderList={orderList}
        setOrderDetail={setOrderDetail}
        setIsShow={setIsShow}
      />

      {//자바스크립트 쓸거니까 크게 중괄호{}묶어주고 보호해주기
        isShow
        ?
        <OrderDetail
          orderDetail={setOrderDetail}
        />
        :
        null
      }
    </>
  )
}

export default OrderInfo