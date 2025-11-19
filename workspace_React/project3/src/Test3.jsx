import React, { useState } from 'react'
import './Test3.css'

const Test3 = () => {
  const [btn3, setBtn3] = useState ('광고닫기');
  const [div3, setDiv3] = useState (true);
  
  return (
    <div className='test3_container'>
    <button type='button' onClick={()=>{
      setBtn3( btn3 === '광고닫기' ? '광고보기' : '광고닫기' );
      setDiv3(!div3);
    }}>{btn3}</button>
    {
      div3 ? <div>오늘 구매하시면 30% SALE!</div> : null
    }

    </div>
  )
}

export default Test3