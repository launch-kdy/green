import React, { useEffect, useState } from 'react'
import axios from 'axios';
import Select from '../common/Select'
import Input from '../common/Input'
import Button from '../common/Button'
import styles from './CarManage.module.css'

const CarManage = () => {

  //차량 리스트 정보 담을 useState 함수
  const [detailList, setDetailList] = useState([]);

  //등록 폼 데이터
  const [form, setForm] = useState({
    madeCompany: '',
    modelName: '',
    modelPrice: ''
  });

  // 차량 목록 가져오기 함수
  const fetchCarList = () => {
    axios.get('/api/cars')
      .then(res => {
        setDetailList(res.data);
      })
      .catch(error => console.log(error));
  };

  // 처음 마운트 시 차량 목록 조회
  useEffect(()=>{
    fetchCarList();
  }, [])

  // 차량 등록 (입력 값 변경 함수)
  const handleChange = (e) => {
    setForm({
      ...form,
      [e.target.name] : e.target.value
    });
  };

  //등록 버튼 클릭
  const handleRegister = () => {
    const { madeCompany, modelName, modelPrice } = form;
    if ( !madeCompany || !modelName || !modelPrice) {
      alert('모든 항목의 값을 입력해주세요.');
      return;
    }

  axios.post('/api/cars', form)
    .then(()=>{
      setForm({
        madeCompany : '',
        modelName : '',
        modelPrice : ''
      });
      fetchCarList();
    })
    .catch(error => console.log(error));
  }

  return (
    // 차량관리화면 //
    <div className={styles.container}>
      <div className={styles.glassCard}>
        <p>차량등록</p>
        {/* 선택 및 입력 */}
        <div className={styles.reg_div}>
          <span>제조사</span>
          <Select 
            name='madeCompany'
            value={form.madeCompany}
            onChange={handleChange}
          >
            <option value="">-- 선택 --</option>
            <option value="현대">현대</option>
            <option value="기아">기아</option>               
          </Select>
          <span>모델명</span>
          <Input 
            name='modelName'
            value={form.modelName}
            onChange={handleChange}
          />
          <span>차량가격</span>
          <Input 
            name='modelPrice'
            value={form.modelPrice}
            onChange={handleChange}              
          />
          {/* 등록 버튼 */}
          <div className={styles.btn_div}>
            <Button 
              title='등 록'
              color='custom_other'
              onClick={handleRegister}
            />
          </div>
        </div>
      </div>
      {/* 등록된 차량 목룍 표 */}
      <div className={styles.glassCard}>
        <p>등록된 차량 목록</p>
        <table className={styles.car_list_table}>
          <colgroup>
            <col width='25%'/>
            <col width='25%'/>
            <col width='25%'/>
            <col width='25%'/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>모델번호</td>
              <td>모델명</td>
              <td>제조사</td>
            </tr>
          </thead>
          <tbody>
          {
            detailList.map((e, i) => {
              return(
                <tr key={i}>
                  <td>{detailList.length -i}</td>
                  <td>{e.modelNum}</td>
                  <td>{e.modelName}</td>
                  <td>{e.madeCompany}</td>
                </tr>
              )
            })
          }
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default CarManage