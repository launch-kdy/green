import React, { useState } from 'react'
import './Form2.css'
import axios from 'axios';

const Form2 = () => {
  const [chickenorder, setChickenOrder] = useState({
    'menu' : '후라이드치킨',
    'cnt' : '1',
    'addr' : '',
    'addradd' : '',
    'please' : ''
  });

  
  const handleChickenOrder = (e) => {
    setChickenOrder({
      ...chickenorder,
      [e.target.name] : e.target.value
    });
  }

  console.log(chickenorder);

  //-------------------------------------------------//
  //스프링 연결하기 위해 = <1> 클릭하면 goOrder 라는 '함수삽입'
  //-------------------------------------------------//
  const goOrder = () => {
  //-------------------------------------------------//
  //스프링 연결하기 위해 = <2> 필수요소 'axios삽입'
  //-------------------------------------------------//
    axios
    //스프링 연결하기 위해 = <3> PostMapping 'URL삽입'
    //<3-1> PostMapping 'URL삽입 + 객체'
    //<3-2> PostMapping 으로 전달되는 매핑은 - 스프링에서 RequestBody'로 받아야 함 [포리] PostMapping + RequestBody
    .post('/api/orders', chickenorder)
    .then(res => alert('주문 성공'))
    .catch(error => console.log(error));
  }

  return (
    <div>
      <h2>치킨!!!</h2>
      <h4><i>치킨 종류와 상관 없이 무조건 만원!</i></h4>
      {/* radio 태그 */}
        <input type="radio" 
          name='menu'
          value='후라이드치킨'
          checked={chickenorder.menu === '후라이드치킨'}
          onChange={(e)=>{handleChickenOrder(e)}}/> 후라이드치킨
        <input type="radio" 
          name='menu'
          value='양념치킨'
          checked={chickenorder.menu === '양념치킨'}
          onChange={(e)=>{handleChickenOrder(e)}}/> 양념치킨
        <input type="radio" 
          name='menu'
          value='간장치킨'
          checked={chickenorder.menu === '간장치킨'}
          onChange={(e)=>{handleChickenOrder(e)}}/> 간장치킨 <br />
        <input type="radio" 
          name='menu'
          value={'고추바사삭'}
          checked={chickenorder.menu === '고추바사삭'}
          onChange={(e)=>{handleChickenOrder(e)}}/> 고추바사삭
        <input type="radio" 
          name='menu'
          value={'뿌링클'}
          checked={chickenorder.menu === '뿌링클'}
          onChange={(e)=>{handleChickenOrder(e)}}/> 뿌링클
        <input type="radio" 
          name='menu'
          value={'매운핫치킨'}
          checked={chickenorder.menu === '매운핫치킨'}
          onChange={(e)=>{handleChickenOrder(e)}}/> 매운핫치킨 <br />
      <i>몇마리 </i>
      {/* number 태그 */}
        <input type="number" 
          name='cnt'
          value={chickenorder.cnt}
          onChange={(e)=>{handleChickenOrder(e)}}/> <br />
      <i>배달주소</i> <br />
      {/* select 태그 */}
        <select name='addr' value={chickenorder.addr} onChange={(e)=>{handleChickenOrder(e)}}>
          <option value="">등을 선택하세요</option>
          <option value="삼산동">삼산동</option>
          <option value="달동">달동</option>
          <option value="신천동">신천동</option>
        </select> <br />
      <i>배달주소 상세</i> <br />
      {/* text 태그 */}
        <input type="text" 
          name='addradd'
          value={chickenorder.addradd}
          onChange={(e)=>{handleChickenOrder(e)}}        
        /> <br />
      <i>요청사항</i> <br />
      {/* textarea 태그 */}
        <textarea cols={50} rows={3}
          name='please'
          value={chickenorder.please}
          onChange={(e)=>{handleChickenOrder(e)}}></textarea> <br />
        <button 
          type='button'
          //--------------------------------------------------------//
          //스프링 연결하기 위해 = <1> 클릭하면 goOrder 라는 '함수삽입()'
          //--------------------------------------------------------//
          onClick={(e) => {goOrder()}}
        >주문하러가기</button>
    </div>
  )
}

export default Form2