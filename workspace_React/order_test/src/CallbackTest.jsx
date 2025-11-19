import React from 'react'

const CallbackTest = () => {
  
  const test = (a, b) => {
    alert(a+b);
  }

  const ccc = function(){
    alert(11);
  }

  abc();

  return (
    <div>
      {/* 함수의 참조값을 onclick에 저장 */}
      <button type='button' onClick={() => test(10, 20)}>버튼1</button>
      <button type='button' onClick={test}>버튼2</button>
      {/* test()함수의 실행 수 리턴값이 ocClick에 저장 */}
      {/* <button type='button' onClick={test()}>버튼2</button> */}
    </div>
  )
}

export default CallbackTest