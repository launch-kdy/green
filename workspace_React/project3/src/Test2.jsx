import React, { useState } from 'react'

const Test2 = () => {
  const [lable, setLable] = useState('ON');
  const [btn, setBtn] = useState('OFF');

  return (
    <div>
    <h1>{lable}</h1>
    <button type='button' onClick={()=>{
      // state 변경함수가 여러개 실행되면,
      // 리렌더링은 마지막에 1번만 실행
      setLable( lable === 'ON' ? 'OFF' : 'ON');
      setBtn( btn === 'ON' ? 'OFF' : 'ON');
    }}>{btn}</button>
    </div>
  )
}

export default Test2