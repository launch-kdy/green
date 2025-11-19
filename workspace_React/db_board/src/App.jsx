import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import BoardList from './BoardList'
import { Route, Routes } from 'react-router-dom'
import RegForm from './RegForm'
import BoardDetail from './BoardDetail'
import UpdateForm from './UpdateForm'

function App() {

  return (
    <div className='container'>
      <Routes>
        {/* 게시글 목록 페이지 localhost:5173 */}
        <Route path='/' element={ <BoardList /> } />
        {/* 게시글 등록 페이지 */}
        <Route path='/reg' element={ <RegForm /> } />
        {/* 게시글 상세 페이지 (주의 - useParams) :boardNum (주의- useParams) */}
        <Route path='/detail/:boardNum' element={ <BoardDetail /> } />
        {/* 게시글 수정 페이지 */}
        <Route path='/update/:boardNum' element={ <UpdateForm /> } />
        {/* 없는 페이지 */}
        <Route path='*' element={ <div>없는 페이지입니다</div> } />
      </Routes>      
    </div>
  )
}

export default App
