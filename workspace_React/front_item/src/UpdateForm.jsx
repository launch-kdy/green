import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const UpdateForm = () => {
  const nav = useNavigate();

  //상세보기에서 전달된 itemNum
  const {itemNum} = useParams();

  //(조회된 기존 데이터) 를 저장할 state 변수
  const [itemInfo, setItemInfo] = useState({});

  //(입력한 정보) 를 저장할 state 변수
  const [inputItem, setInputItem] = useState({
    'itemCategory' : '',
    'itemName' : '',
    'itemPrice' : '',
    'itemStatus' : '',
    'itemIntro' : ''
  });

  //입력한 값이 변경될 때마다 실행할 함수
  const handleInputItem = (e) => {
    setInputItem({
      ...inputItem,
      [e.target.name] : e.target.value
   });
  }

  //마운트 시 수정할 상품의 상세정보를 조회해서 itemInfo에 저장
  useEffect(() => {
    axios.get(`/api/backItems/${itemNum}`)
    .then(res => {
      setItemInfo(res.data)
      setInputItem(res.data)
    })
    .catch(error => console.log(error));
  },[]);

  //수정 버튼 클릭시
  const updateItem = () => {
    axios.put(`/api/backItems/${itemNum}`,inputItem)
    .then(res => {
      alert('수정 완료');
      nav(`/detail/${inputItem.itemNum}`);
    })
    .catch(error => console.log(error))
  }

  return (
    <div>
      <div>
        <p>상품카테고리</p>
        <select 
          value={inputItem.itemCategory}
          name='itemCategory'
          onChange={e => handleInputItem(e)}
        >
          <option value="">선택</option>
          <option value="상의">상의</option>
          <option value="하의">하의</option>
          <option value="악세사리">악세사리</option>
        </select>
      </div>
      <div>
        <p>상품명</p>
        <input 
          type="text" 
          value={inputItem.itemName}
          name='itemName'
          onChange={e => handleInputItem(e)}
        />
      </div>
      <div>
      <div>
        <p>상품가격</p>
        <input 
          type="text" 
          value={inputItem.itemPrice}
          name='itemPrice'
          onChange={e => handleInputItem(e)}
        />
      </div>
      </div>
      <div>
        <p>상품상태</p>
        <input type="radio" 
        name='itemStatus' 
        value='준비중'
        checked={inputItem.itemStatus === '준비중'}
        onChange={e => handleInputItem(e)}/>준비중

        <input type="radio" 
        name='itemStatus' 
        value='판매중'
        checked={inputItem.itemStatus === '판매중'}
        onChange={e => handleInputItem(e)}/>판매중

        <input type="radio" 
        name='itemStatus' 
        value='매진'
        checked={inputItem.itemStatus === '매진'}
        onChange={e => handleInputItem(e)}/>매진
        <div>
          <p>상품소개</p>
          <textarea
            // value에 삼항연산자를 활용하여 null 의 경우 막을 수 있음 
            value={inputItem.itemIntro === null? '' : inputItem.itemIntro}
            name='itemIntro'
            onChange={e => handleInputItem(e)}
          ></textarea>
        </div>
        <div>
          <button type='button' onClick={e => updateItem(e)}>수정</button>
        </div>
      </div>

    </div>
  )
}

export default UpdateForm