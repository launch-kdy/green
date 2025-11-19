import React, { useState } from 'react'

const Select2 = () => {
  //입력한 모든 데이터를 저장할 state 변수
  const [contents, SetContents] = useState({
    name : '',
    old : '',
    grade : '1'
  });
  console.log(contents);

  //(함수) input 및 select가 변경될때마다 실행하는
  const handleContents = (e) => {
    SetContents({
      ...contents,
      [e.target.name] : e.target.value
    });
  }

  return (
    <div>
      이름
      <input name='name' type="text" value={contents.name} 
        onChange={(e) => {handleContents(e)}}/><br />
      나이
      <input name='old' type="text" value={contents.old}
        onChange={(e) => {handleContents(e)}}/><br />
      학년
      <select name='grade' value={contents.grade} 
              onChange={(e) => {handleContents(e)}}>
        <option value="1">1학년</option>
        <option value="2">2학년</option>
        <option value="3">3학년</option>
        <option  value="4">4학년</option>
      </select>
    </div>
  )
}

export default Select2