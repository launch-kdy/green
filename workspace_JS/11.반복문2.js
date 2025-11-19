const arr1 = [1, 3, 5];

//일반 반복문
for (let i = 0; i < arr1.length ; i++){
  console.log(arr1[i]);
}

//한줄개행
console.log('\n');

//for of 반복문
for(const e of arr1){
  console.log(e);
}

console.log('\n');

//forEach() - 함수
//(배열에 있는 수만큼 함수를 반복한다)
//'첫번째 매개변수' : 배열에 저장된 각각의 데이터
//'두번째 매개변수' : 반복문의 index
arr1.forEach((e, i)=>{
  console.log(`e = ${e}, i = ${i}`);
});

//map() - 함수
//(배열에 있는 수만큼 함수를 반복한다)
//'코드 마지막에 리턴문을 넣을 수 있다.
const result = arr1.map((e, i)=>{
  console.log(`e = ${e}, i = ${i}`);
  return e + 1;
});
console.log(result);

console.log('\n');
console.log('\n');

const stuList = [
  {
    name : 'kim',
    korScore : 80,
    engScore : 50
  }, 
  {
    name : 'lee',
    korScore : 90,
    engScore : 100
  }, 
  {
    name : 'park',
    korScore : 70,
    engScore : 90
  }
];

stuList.forEach((e, i) => {
  //console.log(e);
  console.log(stuList[i])
});
