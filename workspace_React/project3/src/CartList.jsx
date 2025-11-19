
import React from 'react'
import './CartList.css'
//장바구니 목록
const CartList = () => {
  const CartList = [
    {
      categoty : '상의',
      itemName : '셔츠',
      itemPrice : 10000,
      cartCnt : 2
    },
    {
      categoty : '하의',
      itemName : '청바지',
      itemPrice : 15000,
      cartCnt : 1
    }, 
    {
      categoty : '신발',
      itemName : '로퍼',
      itemPrice : 20000,
      cartCnt : 2
    }, 
    {
      categoty : '상의',
      itemName : '맨투맨',
      itemPrice : 30000,
      cartCnt : 3
    }, 
    {
      categoty : '하의',
      itemName : '슬랙스',
      itemPrice : 15000,
      cartCnt : 1
    }];

  return (
    <div className='CartList_container'>
      <h1>CartList</h1>

      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>카테고리</td>
            <td>상품명</td>
            <td>가격</td>
            <td>수량</td>
            <td>총가격</td>
          </tr>
        </thead>
        <tbody>
        {
          CartList.map((e, i)=>{
            return (
              <tr key={i}>
                <td>{i + 1}</td>
                <td>{e.categoty}</td>
                <td>{e.itemName}</td>
                <td>{e.itemPrice}</td>
                <td>{e.cartCnt}</td>
                <td>{e.itemPrice * e.cartCnt}</td>
              </tr>
            )
          })
        }
        </tbody>
      </table>

    </div>
  )
}

export default CartList