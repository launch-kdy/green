import { Route, Routes } from 'react-router-dom'
import './App.css'
import Home from './pages/Home'
import CarManage from './pages/CarManage'
import RegCar from './pages/RegCar'
import CarList from './pages/CarList'
import AdminHeader from './layout/AdminHeader'

function App() {

  return (
    <>
      {/* 모든페이지 상단에 헤더 뜨게 */}
      <AdminHeader />

      <Routes>
        {/* (1) 홈 화면 - 1 ~ 4 <banner>[H][C.M][RegC.Info][SearchList]*/}
        <Route path='/' element={<Home />}/>
        {/* (2) 차량 관리 화면 <input>[차량 등록]<table>[등록된 차량 목록]*/}
        <Route path='/car-manage' element={<CarManage />}/>
        {/* (3) 판매정보 등록 화면 - <input>[구매자명/색상/모델/연락처]*/}
        <Route path='/reg-car' element={<RegCar />}/>
        {/* (4) 판매목록 조회 화면 - <table>[구매자 정보/차량정보]*/}
        <Route path='/car-list' element={<CarList />}/>
      </Routes>
    </>
  )
}

export default App
