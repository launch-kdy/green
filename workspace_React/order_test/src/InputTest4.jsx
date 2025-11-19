import React, { useState } from 'react'

//찐 마지막 설명
const InputTest4 = () => {
  const man = {
    name : 'kim',
    age : 20
  }

  const v = 'age';
  man.v; //해석하면 v라는 키에 대한 value 값을 가져오겠습니다. (불가)
  man[v]; //man['age']


  console.log(man.name);
  console.log(man['name']); //두번째 문법
  
  console.log(man.age);
  console.log(man['age']); //두번째 문법




  //input 태그에 입력한 모든 내용을 저장하기 위한 state 변수
  const[inputData, setInputData] = useState({
    //key값 & 초기값(Value) 만들기
    'name' : '',
    'age' : '',
    'addr' : ''
  });

  console.log(inputData);

  //input 태그에 값을 입력할 때마다 실행시키는 함수
  const handleInputData = (e) => {
    setInputData({
      ...inputData,
      //대괄호로 감싸는 이유
      [e.target.name] : e.target.value
    });
  }


  return (
    //onChane 는 입력한 값을 저장시켜주겠다 = 정보가 바뀐 값
    //e. (이벤트) : 이벤트 객체
    //e. target : 이벤트가 발생한 태그 
    //inputData state 변경
    <div>
      이름 
      <input 
        name='name' type='text' 
        value={inputData.name}
        onChange={e=>handleInputData(e)}
      /> <br />

      나이 <input name='age' type='text' value={inputData.age} onChange={(e)=>{
        handleInputData(e)
      }}/> <br />
      주소 <input name='addr' type='text' value={inputData.addr} onChange={(e)=>{
        handleInputData(e)
      }}/> <br />
    </div>
  )
}

export default InputTest4