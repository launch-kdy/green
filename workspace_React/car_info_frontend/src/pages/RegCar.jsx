import React, { useEffect, useState } from 'react'
import Input from '../common/Input'
import Select from '../common/Select'
import Button from '../common/Button'
import { useNavigate } from 'react-router-dom'
import axios from 'axios'
import styles from './RegCar.module.css'

const RegCar = () => {

  const navigate = useNavigate()

  // 목록상태
  const [models, setModels] = useState([]);
  const [form, setForm] = useState({
    cusName: '',
    color: '',
    modelNum: '',
    cusPhone: ''
  });

  // 에러
  const [error, setError] = useState('');

  // 페이지 로드 시 모델 목록 가져오기
  useEffect(() => {
    axios.get('/api/cars') // 백엔드에서 차량 목록 반환
      .then(res => setModels(res.data))
      .catch(error => console.log(error));
  }, []);

  const handleChange = (e) => {
    setForm({
      ...form, 
      [e.target.name] : e.target.value 
    });
  };

  // 휴대전화 번호 (형식)
  const validatePhone = (phone) => {
    const regex = /^010-\d{4}-\d{4}$/;
    return regex.test(phone);
  };

  const handleSubmit = () => {
    // 필수 입력 체크
    if (!form.cusName || !form.color || !form.modelNum) {
      alert('연락처를 제외한 모든 정보는 필수입력입니다.');
      return;
    }

    // 유효성 검사
    if (form.cusPhone && !validatePhone(form.cusPhone)) {
      setError('* 전화번호는 "000-0000-0000" 형식이어야 합니다.');
      return;
    } else {
      setError('');
    }

    // 판매 정보 등록 요청
    axios.post('/api/sales', form)
      .then(res => {
        alert('판매 정보 등록 완료');
        navigate('/car-list'); // 판매 목록 페이지로 이동
      })
      .catch(error => console.log(error));
  };

  return (
    //판매정보등록
    <div className={styles.container}>
      {/* 선택 및 입력 */}
      <div className={styles.glassCard}>
        <p>구매자명</p>
        <Input 
          name="cusName"
          value={form.cusName}
          onChange={handleChange}
        />
        <p>색상</p>
        <Select
          name="color" 
          value={form.color} 
          onChange={handleChange}
        >
          <option value="">선택</option>
          <option value="화이트">화이트</option>
          <option value="블랙">블랙</option>
          <option value="레드">레드</option>
        </Select>
        <span>모델</span>
        <Select
          name="modelNum" 
          value={form.modelNum} 
          onChange={handleChange}
        >
          <option value="">선택</option>
          {models.map(model => (
            <option key={model.modelNum} value={model.modelNum}>
              {model.modelName}
            </option>
          ))}
        </Select>
        <p>연락처</p>
        <Input 
          name="cusPhone"
          value={form.cusPhone}
          onChange={handleChange}
          placeholder="000-0000-0000"
        />
        {error && <div style={{ color: 'red', marginTop: '4px' }}>{error}</div>}
        {/* 등록버튼 */}
        <div className={styles.btn_div}>
          <Button 
            title='등 록'
            onClick={handleSubmit}
            color='custom'
          />
        </div>
      </div>
    </div>
  )
}

export default RegCar