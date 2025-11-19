import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

//<1> OrderInfo import 해준 거
import OrderInfo from './OrderInfo'
import OrderDetail from './OrderDetail'
import OrderList from './OrderList'

function App() {

  return (
    <>
      <OrderInfo />
      <OrderDetail />
      <OrderList />
    </>
  )
}

export default App
