import React from 'react'
import './Header.css'
import { Link } from 'react-router-dom'

const Header = () => {
  return (
    <div className='header-container'>
      <div className='profile'>
        <span>
          <Link to={'/Join'}>Join</Link>
        </span>
        <span>
          <Link to={'/login'}>Login</Link>
        </span>
      </div>
      <div className='title'>블 랙 컴 퓨 터 학 원</div>
    </div>
  )
}

export default Header