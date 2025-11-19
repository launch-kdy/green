import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Route, Routes } from 'react-router-dom'
import ItemList from './ItemList'
import ItemDetail from './ItemDetail'
import RegForm from './RegForm'
import UpdateForm from './UpdateForm'



function App() {

  return (
    <div className='container'>
      {/* Routes 로 페이지 만들기 */}
      <Routes>
        {/* 상품 목록 페이지 localhiost:5173 (기본값) [ / ] */}
        <Route path='/' element={ <ItemList /> }></Route>
        {/* 상품 (상세)정보 페이지 */}
        <Route path='/detail/:itemNum' element={ <ItemDetail /> }></Route>
        {/* 상품 (등록) 페이지 */}
        <Route path='/reg' element={ <RegForm /> }></Route>
        {/* 상품 (수정) 페이지 */}
        <Route path='/update/:itemNum' element={ <UpdateForm /> }></Route>
        {/* 존재하지 않는 페이지 (전체) [ * ] */}
        <Route path='*' element={ <div> 존재하지 않는 페이지 입니다. </div>}/>
      </Routes>
    </div>
  )
}

export default App
