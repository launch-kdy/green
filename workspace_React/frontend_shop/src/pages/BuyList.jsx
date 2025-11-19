import axios from 'axios';
import React, { useEffect, useState } from 'react'
import Input from '../common/Input';
import Button from '../common/Button';
import dayjs from 'dayjs';
import styles from './BuyList.module.css'
import PageTitle from '../common/PageTitle'
import { useNavigate } from 'react-router-dom';
import BuyListModal from './BuyListModal';

const BuyList = () => {
  
  //(검색 버튼)입력한 검색 조건 데이터를 저장할 state 변수
  const [searchData, setSearchData] = useState({
    'orderNum' : '',
    'memId' : '',
    'fromDate' : '',
    'toDate' : ''
  });

  //검색 데이터를 입력할 때 마다 실행하는 (기능)함수
  const handleSearchData = (e) => {
    setSearchData({
      ...searchData,
      [e.target.name] : e.target.value
    });
  }

  //구매 상세 내역 modal의 보이기 여부를 저장할변슈
  const [isOpen, setIsOpen] = useState(false);

  //조회한 구매 목록 데이터를 저장할 state 변수
  const [buyList, setBuyList] = useState([]);

  //조회한 구매 상세 정보를 저장할 state 변수
  const [detailList, setDetailList] = useState([]);

  //마운트하면 조회한 목록 데이터를 buyList 변수에 저장
  useEffect(() => {
    axios.get('/api/buys/buy-list-admin')
    .then(res => {
      console.log(res.data);
      setBuyList(res.data);
    })
    .catch(error => console.log(error))
  }, [])

  //행 클릭시 구매 상세 조회 함수
  const getDetail = (orderNum) => {
    axios.get(`/api/buys/${orderNum}`)
    .then(res => {
      console.log(res.data);
      setDetailList(res.data);
    })
    .catch(error => console.log(error))
  }

  // 검색 버튼 클릭시 실행 함수
  const dosearch = () => {
    axios.get('/api/buys/buy-list-admin', {params : searchData})
    .then(res => {
      setBuyList(res.data);
    })
    .catch(error => console.log(error))
  }

  return (
    <div className={styles.container}>
      <PageTitle title='구매 이력 조회'/>
      <div className={styles.search_div}>
        <div>
          <p>주문번호</p>
          <Input 
            size='100%'
            name='orderNum'
            value={searchData.orderNum}
            onChange={e => handleSearchData(e) }
          />
        </div>
        <div>
          <p>구매자ID</p>
          <Input 
            size='100%'
            name='memId'
            value={searchData.memId}
            onChange={e => handleSearchData(e) }
          />
        </div>
        <div>
          <p>구매일시</p>
          <div className={styles.buy_date_div}>
            <Input 
              size='100%' 
              type='date'
              name='fromDate'
              value={searchData.fromDate}
              onChange={e => handleSearchData(e) }
            />
            <span>-</span>
            <Input 
              size='100%' 
              type='date'
              name='toDate'
              value={searchData.toDate}
              onChange={e => handleSearchData(e) }
            />
          </div>
        </div>
        <Button 
          title='검 색'
          size='15%'
          onClick={e => dosearch(e)
        }/>
      </div>
      <div>
      <table className={styles.list_table}>
        <colgroup>
          <col width='7%'/>
          <col width='10%'/>
          <col width='30%'/>
          <col width='15%'/>
          <col width='15%'/>
          <col width='*'/>
        </colgroup>
        <thead>
          <tr>
            <td>No</td>
            <td>주문번호</td>
            <td>구매상품</td>
            <td>구매자ID</td>
            <td>결제금액</td>
            <td>구매일시</td>
          </tr>
        </thead>
        <tbody>
        {
          buyList.map((buyInfo, i) => {
            return (
              <tr 
                key={i}
                onClick={e => {
                  //클릭한 행의 상세 내역 조회
                  getDetail(buyInfo.orderNum)
                  // modal 보이게 변경
                  setIsOpen(true);
                }}>
                <td>{buyList.length - i}</td>
                <td>{buyInfo.orderNum}</td>
                <td>{buyInfo.title}</td>
                <td>{buyInfo.memId}</td>
                <td>{buyInfo.price.toLocaleString()}</td>
                <td>{dayjs(buyInfo.buyDate).format('YYYY-MM-DD HH:mm')}</td>
              </tr>
            )
          })
         }
          </tbody>
        </table>
      </div>
      {/* 상세 내용 Modal (아무곳에나 입력해도 상관 없음 ) */}
      <BuyListModal 
        detailList={detailList}
        isOpen={isOpen}
        onClose={() => {setIsOpen(false)}}
      />
    </div>
  )
}

export default BuyList