import React, { useEffect, useState } from 'react'
import styles from './ItemList.module.css'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import dayjs from 'dayjs';

// (목록) 페이지 입니다.
const ItemList = () => {

  //원하는 페이지로 이동하는 함수
  const nav = useNavigate();

  //전체 데이터를 저장할 state 변수
  const [itemList, setItemList] = useState([]);

  //상품의 총 가격을 구하여보자
  // + 총 합을 저장할 변수도 저장해보자
  let totalPrice = 0;
  for(const e of itemList){
    totalPrice = totalPrice + e.itemPrice;
  }

  //전체 리스트 조회 
  useEffect(() => {
    axios.get('/api/backItems')
    .then(res => {
      console.log(res.data);
      setItemList(res.data);
    })
    .catch(error => console.log(error))
  },[]);

  return (
    // <목록 전체 - 컨테이너 div>
    <div className={styles.container}>
      {/* <테이블 - 컨테이너 div> */}
      <table className={styles.list_table}>
        {/* 테이블 (요소)*/}
        <colgroup>
          <col width='5%' />
          <col width='12%' />
          <col width='10%' />
          <col width='10%' />
          <col width='10%' />
          <col width='20%' />
        </colgroup>
        <thead>
          <tr>
            <td>No</td>
            <td>카테고리</td>
            <td>상품명</td>
            <td>가격</td>
            <td>상태</td>
            <td>등록일</td>
          </tr>
        </thead>
        <tbody>
        {
          itemList.map((item, i) => {
            return (
              <tr key={i} onClick={e => nav(`/detail/${item.itemNum}`)}>
                <td>{itemList.length - i}</td>
                <td>{item.itemNum}</td>
                <td>{item.itemCategory}</td>
                <td>{item.itemName}</td>
                <td>{'￦' + item.itemPrice.toLocaleString()}</td>
                <td>{item.itemStatus}</td>
                <td>{dayjs(item.regDate).format('YYYY-MM-DD (HH:mm:ss)')}</td>
              </tr>
            )
          })
        }
        </tbody>
        </table>

        <div>
          <span>총 등록 가격</span>
          <p>{'￦' + totalPrice.toLocaleString()}원</p>
        </div>

        {/* 총등록 가격 (요소)*/}
        <div className={styles.btn_div}>
          <button type='button' onClick={e => nav(`/reg`)}>상품등록</button>
        </div>
    </div>
  )
}

export default ItemList