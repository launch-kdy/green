import React from 'react'
import { NavLink } from 'react-router-dom'
import styles from './AdminHeader.module.css'

const AdminHeader = () => {
  return (

    // 상단 배너 [ 홈 \ 차량관리 \ 판매정보등록 \ 판매목록조회 ] 
    <div className={styles.container}>
      <div className={styles.menuCategory}>
        <ul>
          {/* (1) [홈] - (바로가기)] */}
          <li className={styles.menu_home}>
            <NavLink
              to={'/'}
            >
              홈
            </NavLink>
          </li>
          {/* (2) [차량관리] - (바로가기)] */}
          <li className={styles.menu_carManage}>
            <NavLink
              to={'/car-manage'}
            >
              차량관리
            </NavLink>
          </li>
          {/* (3) [판매정보등록] - (바로가기)] */}
          <li className={styles.menu_regCar}>
            <NavLink
              to={'/reg-car'}
            >
              판매정보등록
            </NavLink>
          </li>
          {/* (4) [판매목록조회] - (바로가기)] */}
          <li className={styles.menu_carList}>
            <NavLink
              to={'/car-list'}
            >
              판매목록조회
            </NavLink>
          </li>
        </ul>
      </div>
    </div>
  )
}

export default AdminHeader