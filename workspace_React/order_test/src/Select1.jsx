import React, { useState } from 'react'




// select 의 데이터를 가져온 다는 것 = 선택한 요소의 value="" 값을 가져온다 (찐 데이터)
// 여담으로 value="" 는 보통 pk값을 자주 쓰긴 함
// value="" 는 option 태그안에 들어감()
// value="" 는 select 태그안에 들어감 select tag와 동일한 value 값을 지닌 option이 최초 화면에 나타남 들어감
// select에서 선택한 데이터를 저장하기 위해 만든 state 변수의 초기값은
// 화면에 먼저 표현하고자하는 option 태그의 value 값으로 지정한다.
const Select1 = () => {

  //select 태그에서 선택한 값을 저장할 state 변수
  const [snacks, setSnacks] = useState('');
  // (파란:snacks = 'value="롯데"')
  // 즉 useState('맨처음에 뭐 먼저 띄어줄까')
  console.log(snacks);

  return (
    <div>
      {/* select 와 option 만들기 */}
      <select value={snacks} onChange={(e)=>{
        setSnacks(e.target.value);
        //내가 선택한 태그의 value 에 넣겠다 : 똑같이 set000(e.target.value);
      }}>
        {/* onChange 화살표함수, 이벤트 속성 넣어서, select 값 바뀔때마다 실행 되는 기능을 구현 */}

        {/* 최종적으로 select value={} 안에는 const에서 만든 파란 글자가 들어감 (동일한 값) */}
        <option value="">과자선택</option>
        <option value="농심">새우깡</option>
        <option value="롯데">빼빼로</option>
        <option value="해태">맛동산</option>
      </select>
    </div>
  )
}

export default Select1