import React, { useEffect } from 'react'

const UseEffectTest = () => {
  console.log(0);

  //useEffect 안에 있는 코드는 ' 마지막에 실행 (후 순위) -> 언제 ? html그림 다 그린 후 '
  //useEffect 의 두번째 매개변수를 사용하면 -> mount(최초에=새로고침)실행됨
  //useEffect 의 두번째 매개변수를 사용하지 않으면 -> mount(최초에=새로고침), update(리렌더링 될때마다) 실행됨
  //새로고침은 update가 아니라 mount로 취급되기에 주의하도록하자 
  useEffect(() => {
    console.log(1);
  });

  console.log(2);


  return (
    <div>UseEffectTest</div>
  )
}

export default UseEffectTest