import React, { useEffect, useState } from 'react';
import axios from 'axios';
import dayjs from 'dayjs';
import styles from './CarList.module.css'

const CarList = () => {
  
  const [sales, setSales] = useState([]);

  useEffect(() => {
    axios.get('/api/sales')
      .then(res => setSales(res.data))
      .catch(err => console.log(err));
  }, []);

  return (
    <div className={styles.container}>
      <div className={styles.glassCard}>
        {/* 선택 및 입력 */}
        <div>
          <table className={styles.car_list_table}>
            <colgroup>
              <col width='10%'/>
              <col width='15%'/>
              <col width='22%'/>
              <col width='18%'/>
              <col width='10%'/>
              <col width='15%'/>
              <col width='10%'/>
            </colgroup>
            <thead>
              <tr>
                <td rowSpan={2}>No</td>
                <td colSpan={4}>구매자 정보</td>
                <td colSpan={2}>차량정보</td>
              </tr>
              <tr>
                <td>구매자명</td>
                <td>연락처</td>
                <td>구매일</td>
                <td>색상</td>
                <td>모델명</td>
                <td>가격</td>
              </tr>
            </thead>
            <tbody>
            {
              sales.map((e, i) => {
                return(
                  <tr key={i}>
                    <td>{sales.length -i}</td>
                    <td>{e.cusName}</td>
                    <td>{e.cusPhone || '-'}</td>
                    <td>{dayjs(e.sellDate).format('YYYY-MM-DD HH:mm')}</td>
                    <td>{e.color}</td>
                    <td>{e.carDTO.modelName}</td>
                    <td>{e.carDTO.modelPrice.toLocaleString()}</td>
                  </tr>
                )
              })
            }
            </tbody>
          </table>
        </div>
      </div>
    </div>
  )
}

export default CarList