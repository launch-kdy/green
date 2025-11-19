import React, { useState } from 'react'

const Form1 = () => {
  const [forminfo, setFormInfo] = useState({
    id : '',
    pw : '',
    hobby : '',
    gender : 'man',
    intro : ''
  });

  console.log(forminfo);

  const handleFormInfo = (e) => {
    setFormInfo({
      ...forminfo,
      [e.target.name] : e.target.value
    });
  }

  return (
    <div>
      아이디
      <input type='text' 
        name='id' 
        value={forminfo.id} 
        onChange={(e)=>{handleFormInfo(e)}}/><hr />
      비번
      <input type='password'
        name='pw'
        value={forminfo.pw}
        onChange={(e)=>{handleFormInfo(e)}}/><hr />

      취미
      {/* selelct option은 'select에' (name/value/onChange) 넣어야함  */}
      <select name='' value={forminfo.hobby} onChange={(e) => {handleFormInfo(e)}}>
        <option value="">선택하세요</option>
        <option value="1">운동</option>
        <option value="2">게임</option>
        <option value="3">코딩</option>
      </select> <hr></hr>

      성별
      <input type="radio" 
        name='gender' 
        value={'man'} 
        checked={forminfo.gender === 'man'}
        onChange={(e)=>{
          handleFormInfo(e)}}/> 남
      <input type="radio" 
        name='gender' 
        value={'woman'}
        checked={forminfo.gender === 'woman'} 
        onChange={(e)=>{
          handleFormInfo(e)}}/> 여<hr />
      인사말
      <textarea cols={50} rows={5} 
        name='intro' 
        value={forminfo.intro} 
        onChange={(e) => {handleFormInfo(e)}}></textarea>
    </div>
  )
}

export default Form1