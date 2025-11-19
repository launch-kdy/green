import React, { useEffect, useState } from 'react'

//useEffect 여러번 실행가능
const UseEffectTest3 = () => {
  const [num1, setNum1] = useState(0);
  const [num2, setNum2] = useState(0);

  console.log(1);

  //mount때 실행됨 (O)
  //의존성 배열이 없다 -> 리렌더링 되어도 실행된다 + 무슨이유든 간에 update가 되기만 하면 실행
  useEffect(() => {
    console.log(2);
  });

  //mount때 실행됨 (O)
  //의존성 배열이 있어서 -> mount(새로고침) 될때만 실행
  useEffect(() => {
    console.log(3);
  }, []);

  //mount때 실행됨 (O), num1값이 바뀌어서 리렌더링 될 때만 실행
  useEffect(() => {
    console.log(4);
  }, [num1]);

  // 퀴즈 언제 실행될까요
  //mount때 실행됨 (O)
  //num2 값이 바뀌어서 리렌더링 될 때만 실행
  useEffect(()=>{
    console.log(5);
  }, [num2]);

  //mount때 실행됨 (O)
  //[num1] or [num2] 둘중에 하나라도 바뀌면 실행된다 !
    useEffect(()=>{
    console.log(7);
  }, [num1, num2]);
  

  console.log(6);

  //결론 : 의존성 배열이 없으면 mount(새로고침), 리렌더링 둘다 OK
  //결론 : 의존성 배열이 있다 mount(새로고침)만
  //결론 : 의존성 배열은 *나 까다로운 놈임, (의존성 배열이 붙어있으면 잠깐 한숨을 쉬고 짱구를 한번 굴려보도록하자.)
  // 친구할 때 욕할 때 "야이, 의존성 배열 같은 인간아 라고 말하면 정말 정말 나쁜 욕이 될 듯하다."
  // 서버에서 데이터를 받아 올 때, 시간이 걸려서 기다리는 거 토 나올 때 어쩌피 기다려야 할 거 걍 (후 순위) 로 넣기위해서 사용한다.

  return (
    <>
      <div>UseEffectTest3</div>
      <button type='button' onClick={() => {
        setNum1(num1 + 1);
      }}>num1 변경</button>

      <button type='button' onClick={() => {
        setNum2(num2 + 1);
      }}>num2 변경</button>

    </>
  )
}

export default UseEffectTest3