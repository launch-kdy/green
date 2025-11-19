import React, { useEffect, useState } from 'react'

// < 1. 먼저 실행 >
//useState 변수로 하면 화면에 바뀌는 값이 표시 (리렌더링)
// [cnt는 변수 - (점수를 기억하는 상자) ] [setCnt 변경함수 - (점수를 바꾸는 버튼)]
const UseEffectTest2 = () => {
  const [cnt, setCnt] = useState(0);

  // < 3. 꼴지로 실행 (그림 실행 후) >
  // 순서 : useState -> return(그림) -> 그림이 실행되면 비로소 useEffect가 나타남
  // useEffect의 두번째 의존성 배열에, 빈 배열을 전달하면 mount 시점에만 실행
  // 바뀌면 점수가 바꼈다 ! 라고 표시해주는 버튼
  useEffect(() => {
    console.log('useEffect 실행');
  }, []);

  //Q. 그럼 이건 언제 실행될까
  console.log(1);

  // < 2. 두번째로 실행 (그림) >
  return (
    <>
      <div>UseEffectTest2</div>
      <button type='button' onClick={() => {
        setCnt(cnt + 1);
      }}>리렌더링</button>
    </>
  )
}

export default UseEffectTest2