function hello(){         // 정의
  console.log('hello~');
}

// 매개변수로 받은 두 정수의 합을 출력
function printSum(a, b){
  console.log(a + b);
}

// 매개변수로 받은 두 정수의 곱을 리턴
function getMulti(a, b){
  return a * b;
}

// 1부터 매개변수로 받은 정수까지의 수 중
// 3의 배수의 갯수를 리턴하는 함수를 선언
function getCnt(num){
  let cnt = 0;
  for(let i = 1 ; i < num + 1 ; i++){
    if(i % 3 === 0){
      cnt++;
    }
  }
  return cnt;
}

// 매개변수로 정수만 들어있는 배열이 전달되면
// 해당배열에서 짝수만을 갖는 새로운 배열을 리턴하는 함수
function getEvenArray(arr){
  //빈껍데기 배열 생성 - > 짝수를 찾기 -> 그대로 넣기
  const resultArr = [];

  for(let i = 0 ; i < arr.length ; i++){
    if(arr[i] % 2 === 0){
      resultArr.push(arr[i]);
    }
  }
  return resultArr;
}
const arr = [1,2,3,4,5];
const a = getEvenArray(arr);
console.log(a);

console.log('자바스크립트 실행');

hello(); // 호출
printSum(10, 20);
const result = getMulti(3, 2);
console.log(result);

console.log('자바스크립트 끝~');