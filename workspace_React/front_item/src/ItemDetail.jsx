import React, { useEffect, useState } from 'react'
import styles from './ItemDetail.module.css' 
import { useNavigate, useParams } from 'react-router-dom';
import axios from 'axios';
import dayjs from 'dayjs';


// (상세) 페이지 입니다.
const ItemDetail = () => {

  //조회한 상세정보를 저장할 useState 변수
  const [detailData , setDetailData] = useState({});

  //백틱에 들어가는 itemNum
  const {itemNum} = useParams();

  //컴포넌트가 마운트돠면 spring에서 상세정보룰 조회한다.
  useEffect(() => {
    axios.get(`/api/backItems/${itemNum}`)
    .then(res => {
      console.log(res.data);
      setDetailData(res.data);
    })
    .catch(error => console.log(error))
  }, []);

  //원하는 페이지로 이동할거잖아 -> nav
  const nav = useNavigate();

  //삭제 버튼 클릭시 실행함수
  const removeItem = () => {
   const result = confirm('정말로 삭제 할까요 ?')

   if(result){
    axios.delete(`/api/backItems/${itemNum}`)
    .then(res => {
      alert('삭제 성공!');
      nav('/');
    })
    .catch(e => console.log(e));
   }

  }

  return (
    <div className={styles.container}>
      <table className={styles.ItemDetail_table}>
        {/* 상품 디테일 */}
        <tbody>
          <tr>
            <td>상품번호</td>
            <td>{detailData.itemNum}</td>
            <td>카테고리</td>
            <td>{detailData.itemCategory}</td>
          </tr>
          <tr>
            <td>상품명</td>
            <td>{detailData.itemName}</td>
            <td>가격</td>
            <td>{'￦' + detailData.itemPrice}</td>
          </tr>
          <tr>
            <td>상태</td>
            <td>{detailData.itemStatus}</td>
            <td>등록일</td>
            <td>{dayjs(detailData.regData).format('YYYY-MM-DD (HH:mm:ss)')}</td>
          </tr>
          <tr>
            <td>상품소개</td>
            <td colSpan={3}>{detailData.itemIntro}</td>
          </tr>
        </tbody>
      </table>
      {/* 버튼 (속성) */}
      <div className={styles.btn_div}>
        <button type='button' onClick={e => nav(`/`)}>목록가기</button>
        <button type='button' onClick={e => nav(`/update/${itemNum}`)}>수정</button>
        <button type='button' onClick={removeItem}>삭제</button>
      </div>
    </div>
  )
}

export default ItemDetail