import React from 'react'

  //props를 괄호 안에 넣자 (모르니까 암기)
const OrderDetail = (props) => {

  //<1> 리턴안에 테이블을 만들어준다. (개꿀)
  return (
    <div className='detail-div'>
      <table>
        <tbody>
          <tr>
            <td>상품번호</td>
            <td>{props.OrderDetail.Ordernum}</td>
            <td>상품명</td>
            <td>{props.OrderDetail.name}</td>
          </tr>
          <tr>
            <td>가격</td>
            <td>{props.OrderDetail.price}</td>
            <td>수량</td>
            <td>{props.OrderDetail.cnt}</td>
          </tr>
          <tr>
            <td>주문자ID</td>
            <td>{props.OrderDetail.buyer}</td>
            <td>구매금액</td>
            <td>{props.OrderDetail.buyPrice}</td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}

export default OrderDetail