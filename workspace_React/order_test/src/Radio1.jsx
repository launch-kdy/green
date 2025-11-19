import React, { useState } from 'react'

const Radio1 = () => {
  // radio 에서 선택한 값을 저장할 state 변수
  const [beautiful, setBeautiful] = useState('B');
  console.log(beautiful);

  // radio의 개념 : 무조건 '1개' 선택
  // radio의 개념 : 선택한 태그의 'value' 값이 저장된다.
  // radio 값을 사용할 state 변수의 초기값은 최초로 선택할 태그의 value 값으로 사용
  // name='' 속성이 같으면 하나만 선택됨 (둘다 선택되는 것을 막는 장치)/ name='' 속성이 다르면 둘다 선택할수있음 
  return (
    <div>
      <p>"에스파는 나야 둘이 될 수 없어"</p>
      <input type="radio" name='beautiful' 
              value={'A'} checked={beautiful === 'A'} 
                        //checked = { '파란글씨' === '이거'} 랑 같으면, 초기 선택 값을 '이거'로 주겠다. */
              onChange={(e) => {
                setBeautiful(e.target.value);
              }}/> 윈터 <br />

      <input type="radio" name='beautiful'
              value={'B'} checked={beautiful === 'B'}
              onChange={(e) => {
                setBeautiful(e.target.value);
              }}/> 카리나 <br />
      <input type="radio" name='beautiful'
              value={'C'} checked={beautiful === 'C'}
              onChange={(e) => {
                setBeautiful(e.target.value);
              }}/> 지젤 <br />
      <input type="radio" name='beautiful'
              value={'D'} checked={beautiful === 'D'}
              onChange={(e) => {
                setBeautiful(e.target.value);
              }}/> 닝닝 <br />
    </div>
  )
}

export default Radio1