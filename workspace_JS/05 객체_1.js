// 객체 : 배열과 같이 다수의 데이터를 저장할 수 있는 자료형
// 객체에 저장된 데이터는 순번이 존재하지 않음
// 객체의 데이터는 key값으로 관리된다.


// const student = []; // 빈 배열
const student1 = {}; // 빈 객체
const student2 = {name : '홍길동', age : 20}; // 빈 객체 {key라벨지 : 'value'콜라, k : v};

// 홍길동이라는 문자열 데이터에 접근하고 싶어.

// -> key가 name인 데이터에 접근하겠습니다.
//student2.name; // 객체.key -> (출력)값은 '홍길동
console.log(student2.name);
console.log(student2.age);

//객체의 데이터 수정하고 싶어.
student2.name = '이순신';
console.log(student2);

//객체의 (새로운)데이터 추가하고 싶어.
student2.addr = '울산시';
console.log(student2);

//폰 객체의 모델명을 's20'으로 변경하세요.
const phone = {
  modelName : 's10', 
  price : 1000,
  color : 'white'
};
//-------------정답-------------
phone.modelName = 's20';
//------------------------------

// 배열안에 객체
const students = [
  {
   name : 'kim',
   korScore : 80, 
   engScore : 70 
  }, 
  {
   name : 'lee',
   korScore : 100, 
   engScore : 100 
  }, 
  {
   name : 'park',
   korScore : 90, 
   engScore : 80 
  }
];

//1. students 배열에 저장된 학생 중 1번째 학생의 모든 정보 출력
console.log(students[0]);

//2. students 배열에 저장된 학생 중 2번째 학생의 국어 점수 출력
console.log(students[2].korScore);


//3. students 배열에 저장된 모든 학생의 이름을 출력
for(let i = 0 ; i < students.length ; i++){
  console.log(students[i].name);
}
//4. students 배열에 저장된 학생 중 이름이 'park'인 학생의
//   국어점수와 영어점수를 출력
for(let i = 0 ; i < students.length ; i++){
  if(students[i].name === 'park'){
    console.log(`국어점수 : ${students[i].korScore}`);
    console.log(`국어점수 : ${students[i].engScore}`);
  }
}

//5. students 배열에 저장된 학생들의 국어점수의 합을 출력
function e(students){
  let sum1 = 0;
  for(let i = 0 ; i < students.length ; i++){
    sum1 = sum1 + students[i].korScore;
  }
  console.log(sum1);
}
e(students);

//6. students 배열에 저장된 학생들의 수학점수를 요소로 받는 배열을 생성
//   하고, 해당 배열을 출력


//7. 국어와 영어점수의 총합이 가장 높은 학생의 이름을 출력


//8. 모든 학생에 총점 데이터를 추가해보세요. 총점의 key는 totalScore로
//   지정하고, 총점의 value는 국어와 영어점수의 합으로 지정한다.

