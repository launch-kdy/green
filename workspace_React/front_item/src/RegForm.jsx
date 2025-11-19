import React, { useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import styles from './RegForm.module.css'
import axios from 'axios';

const RegForm = () => {
  const nav = useNavigate();

  //입력한 데이터를 저장할 state 변수
  const [itemData, setItemData] = useState({
    'itemCategory' : '',
    'itemName' : '',
    'itemPrice' : '',
    'itemStatus' : '준비중',
    'itemIntro' : ''
  });

  //유효성 검사에 사용할 변수
  const [isNotValid, setIsNotValid] = useState({
    'itemCategory' : false,
    'itemName' : false,
    'itemPrice' : false
  });

  //값변경시 실행함수
  const handleItemData = (e) => {
    setItemData({
      ...itemData,
      [e.target.name] : e.target.value
    });
  }

  //등록 버튼 클릭 시 실행
  const regItem = () => {
    //유효성 함수 호출
    //const result = checkValid();

    if(checkValid()){
      axios.post('/api/backItems', itemData)
      .then(res => {
        alert('등록성공');
        nav('/');
      })
      .catch(error => console.log(error))
    }
  }

  //유효성 검사 함수
  const checkValid = () => {
    const isValid = true;

    //유효성 검사(상품명)
    if(itemData.itemName === ''){
      setIsNotValid({
        ...isNotValid,
        'itemName' : true
      });
      isValid = false;
    }

    //유효성 검사(카테고리)
    if(itemData.itemCategory === ''){
      setIsNotValid({
        ...isNotValid,
        itemCategory : true
      });
      isValid = false;
    }

    //유효성 검사(가격)
    if(itemData.itemPrice === '' || itemData.itemPrice < 0){
      setIsNotValid({
        ...isNotValid,
        itemPrice : true
      });
      isValid = false;
    }
    return isValid;
  }

  // (등록) 페이지 입니다.
  return (
    <div className={styles.container}>
      <div>
        <p>상품카테고리</p>
        <select 
          value={itemData.itemCategory}
          name='itemCategory'
          onChange={e => handleItemData(e)}
        >
          <option value=''>선택</option>
          <option value='상의'>상의</option>
          <option value='하의'>하의</option>
          <option value='악세사리'>악세사리</option>
        </select>
        {
          isNotValid.itemCategory &&
          <p className={styles.not_valid}>
            상품카테고리를 선택하세요
          </p>
        }
      </div>
      <div>
        <p>상품명</p>
        <input 
          type="text" 
          name='itemName'
          value={itemData.itemName}
          onChange={e => handleItemData(e)}
        />
        {
          isNotValid.itemName &&
          <p className={styles.not_valid}>상품명은 필수 입력입니다</p>
        }
      </div>
      <div>
        <p>상품가격</p>
        <input 
          type="text"
          name='itemPrice'
          value={itemData.itemPrice}
          onChange={e => handleItemData(e)}
        />
        {
          isNotValid.itemPrice &&
          <p className={styles.not_valid}>상품가격은 필수입력이며, 음수가 들어올 수 없습니다</p>
        }
      </div>
      <div>
        <p>상품상태</p>
        <input 
          type="radio"
          name='itemStatus' 
          value='준비중'
          checked={itemData.itemStatus === '준비중'}
          onChange={e => handleItemData(e)}
          />준비중
        <input 
          type="radio" 
          name='itemStatus' 
          value='판매중'
          checked={itemData.itemStatus === '판매중'}
          onChange={e => handleItemData(e)}
          />판매중          
        <input 
        type="radio" 
        name='itemStatus'
        value='매진'
        checked={itemData.itemStatus === '매진'}
        onChange={e => handleItemData(e)}
        />매진
      </div>
      <div>
        <p>상품소개</p>
        <textarea 
          name="itemIntro"
          value={itemData.itemIntro}
          onChange={e => handleItemData(e)}
          >
        </textarea>
      </div>
      <div className={styles.btn_div}>
        <button type="button" onClick={regItem}>등록</button>
      </div>
    </div>
  )
}

export default RegForm