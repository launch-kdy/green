import React from 'react'

  //props를 괄호 안에 넣자 (모르니까 암기)
const OrderList = (props) => {
  //console.log(props)를 적자 (모르니까 암기)
  console.log(props);
  return (
    //<1> 큰 div 태그를 감싸고, (오류방지)
    // 리턴안에 테이블을 만들어준다. (개꿀)
    <div>
      <table className='container'>
        <thead>
          <tr>
            <td>No</td>
            <td>상품명</td>
            <td>상품가격</td>
            <td>수량</td>
            <td>총구매가격</td>
          </tr>
        </thead>
        <tbody>
        {//자바스크립트 쓸거니까 크게 중괄호{}묶어주고 보호해주기

        //props를 괄호 안에 넣자 (모르니까 암기)
        props.orderList.map((e, i) => {
          //그림그리기위해서 리턴생성
          return(
            <tr key={i}>
              <td>{e.orderNum}</td>
              <td>
              <span className='title' onClick={() => {
              //내가 클릭한 제목을 가진 게시글 정보를
              //BoardDetail.jsx에 전달하겠습니다.
              props.setOrderDetail(e);
              props.setIsShow(true);
              }}>{e.name}</span>
              </td>
              <td>{e.cnt}</td>
              <td>{e.buyPrice}</td>
            </tr>
          )
        }) 

        }
        </tbody>

      </table>
    </div>
  )
}

export default OrderList