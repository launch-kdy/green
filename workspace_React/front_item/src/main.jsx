import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import { BrowserRouter } from 'react-router-dom'

createRoot(document.getElementById('root')).render(
    
  // 1. BorwserRouter 태그로 감싸주기
  <BrowserRouter>
    <App />
  </BrowserRouter>
  
)
