import React from 'react'

//const {name, age, adddr} = props
const Side = ({name, age, adddr}) => {
  // const name = props.name;
  // const age = props.age;
  // const addr = props.addr;

  // 실무에서는 const { , , } = props; 로 단축
  //const {name, age, addr} = props;



  // 매개변수에서 (구조분해 할당)
  // const arr1 = [1,5];
  // const f1 = ([a, b]) => {
  //   return a + b
  // }
  // f1(arr1);

  // [] 배열에서 (구조분해 할당)
  //const arr = [2, 4, 6];
  //const [a, b, c] = arr;

  // {} 객체에서 (구조분해 할당)
  // const phone = {
  //   modelName : 's10',
  //   price : 3000,
  //   color : 'white'
  // };
  // const {modelName, price, color} = phone;

  return (
    <div>Side, {name}</div>
  )
}

export default Side