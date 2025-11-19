import React from 'react'
import { useNavigate } from 'react-router-dom'

const Home = () => {
  {/* < useNavigate(); > 내가 원하는 시점에서 페이지 이동을 하고 싶을 때 */}
  {/* < useNavigate(); > 함수를 하나 리턴한다 */}
  const nav = useNavigate();

  return (
    <div>
    <p>메인페이지</p>
    <button type='button' onClick={e => {nav('/join')}}>회원가입 하러가기</button>

    <div onClick={e => {nav('/Login')}}>로그인 하러가기</div>

    </div>
  )
}

export default Home