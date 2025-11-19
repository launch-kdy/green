import React, { useState } from 'react'

//구매정보 데이터를 입력받은 input 태그를 만들고
//해당 인풋태그를 입력한 정보를 buyInfo 변수에 저장시켜보세요
//입력받는 구매정보로는 상품명, 수량, 가격, 구매자명이 있다.

//이때, 수량의 초기값은 1 가격의 초기값은 0으로 지정
//수량 input 태그의 type은 number로 지정

const InputTest5 = () => {
  const [buyInfo, setBuyInfo] = useState({
    'name' : '',
    'cnt' : 1,
    'price' : 0,
    'buyer' : ''
  });

  //input 태그에 값을 입력할 때마다 실행시키는 함수생성
  const handleBuyInfo = (e) => {
    setBuyInfo({
      ...buyInfo,
      [e.target.name] : e.target.value
    });
  }

  return (
    <div>
      상품명 
      <input
       name='' type="text" 
       value={buyInfo.name}
       onChange={e=>handleBuyInfo()} 
      /><br />
      수량 
      <input
       name='' type="number" 
       value={buyInfo.cnt}
       onChange={e=>handleBuyInfo()} 
      /><br />
      가격 
      <input
       name='' type="text" 
       value={buyInfo.price}
       onChange={e=>handleBuyInfo()} 
      /><br />
      구매자명 
      <input
       name='' type="text" 
       value={buyInfo.buyer}
       onChange={e=>handleBuyInfo()} 
      /><br />
    </div>
  )
}

export default InputTest5