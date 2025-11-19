import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Header from './Header'
import Footer from './Footer'
import Side from './Side'

//props는 자료형이 객체다
// . 찍기 싫으면 구조분해할당을 써라
function App() {
  const [cnt, setCnt] = useState(0);
  console.log(7);

  return (
    <>
      <Header title='java' age='20'/>
      <Footer cnt={cnt} setCnt={setCnt}/>
      <button type='button' onClick={()=>{
        setCnt(cnt + 1);
      }}>버튼</button>

      <Side 
        name='kim'
        age='20'
        addr='울산시'
        />      

    </>
  )
}

export default App
