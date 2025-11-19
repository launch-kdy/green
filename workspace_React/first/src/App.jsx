import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

//react의 html코드는 App 함수 안의 return문에 작성한다.
//html코드는 무조건 하나의 최상위 태그를 지녀야 한다.
//객체는 html로 표현 할 수 없다! + 객체는 통째로 못쓰고 [ ex) {객체.name} or {객체.age} ]

//함수 vs 컴포넌트
//이름이 소문자로 되어 있으면 함수!
//이름이 대문자로 시작되면 컴포넌트!

function App() {
  const name = "hi";
  const arr = [1, 2, 3];
  const person = {
    name : 'kim',
    age : 20
  };

  //header 함수 / 'H'eader 컴포넌트
  function Header(){
    return(
      <div>
        이곳은 'header' 영역입니다.
      </div>
    )
  }

  return (
    <>
      <Header></Header>
      <div>{name}</div>
      <div>hello</div>
      <div>{arr[0]}</div>
      <div>{person.name}</div>
      <div>
        이곳은 '푸터' 영역입니다
      </div>
    </>
  )
}

export default App
