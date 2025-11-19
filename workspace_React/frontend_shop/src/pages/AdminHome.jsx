import React from 'react'
import styles from './AdminHome.module.css'

const AdminHome = () => {
  return (
    <div className={styles.container}>
      {/* 상단 그래프 요소 div */}
      <div className={styles.first_row}>
        {/* 오늘 매출 */}
        <div>a</div>
        {/* 전체 매출 */}
        <div>b</div>
        {/* 오늘의 방문자 수 */}
        <div>c</div>
        {/* 이번달 방문자 수 */}
        <div>d</div>
      </div>
      {/* 하단 그래프 요소 (최근 10일간 매출 차트 - 꺾은선) div */}
      <div className={styles.second_row}>
        e
      </div>
    </div>
  )
}

export default AdminHome