//-초급-
// 1. 인사 함수 만들기 - (기본함수)
// 이름을 매개변수로 받아서 "안녕하세요, [이름]님!"을 반환하는 함수를 작성하세요.

function f1(name){
  return `안녕하세요, ${name}님!`;
};

// 2. 두 수의 합 계산하기 - (기본함수)
// 두 개의 숫자를 매개변수로 받아서 그 합을 반환하는 함수를 작성하세요.
function f2(num1, num2){
  return num1 + num2;
};

// 3. 짝수 홀수 판별하기 - (함수표현식)
// 숫자를 매개변수로 받아서 짝수면 "짝수", 홀수면 "홀수"를 반환하는 함수를 작성하세요.
const f3 = function(num){
  return num % 2 === 0 ? '짝수' : '홀수';
};

// -중급-
// 4. 배열의 최댓값 찾기 - (함수표현식)
// 숫자 배열을 매개변수로 받아서 -> 가장 큰 값을 반환하는 -> 함수를 작성하세요. (Math.max 사용 금지)
const f4 = function(arr){
  let max = arr[0];
  for(let i = 1 ; i < arr.length ; i++){
    if(max < arr[i]){
      max = arr[i];
    }
  }
  return max;
}

const result4 = f4([1,3,5,2]);
console.log(result4);

// 5. 문자열 뒤집기 - (화살표함수)
// 문자열을 매개변수로 받아서 -> 뒤집은 문자열을 반환하는 -> 함수를 작성하세요.
const f5 = str => {
  let result = ''; //빈문자열 하나 만들기

  for(let i = str.length -1 ; i > -1 ; i--){
    result = result + str[i];
  }
  //result = result + str[3]; -- 'java'
  //result = result + str[2];
  //result = result + str[1];
  //result = result + str[0];
  return result;
}

console.log( f5('java'));


// 6. 팩토리얼 계산하기 - (화살표함수)
// 양의 정수를 매개변수로 받아서 팩토리얼을 계산하는 함수를 작성하세요.
// 5! -> 5*4*3*2*1, 
const test6 = num =>  {
  let result = 1;
  for(let i = num ; i > 0 ; i--){
    result = result * i;
  }
  return result
}


// -고급-
// 7. 배열 중복 제거하기 - (화살표함수)
// 배열을 매개변수로 받아서 중복된 요소를 제거한 새로운 배열을 반환하는 함수를 작성하세요.
const test7 = (arr) =>  { //arr = [3,2,1,3,5]
  const result = []; //빈 배열 생성하기
  for(let i = arr ; i < arr.length ; i++){ //배열의 크기만큼 반복 ! 
    const cnt = 0; //중복데이터 갯수
    for(let j = arr ; j < i ; j++){//'이중for문' 배열의 각 요소의 중복검사를 반복!
      if(arr[i] === arr[j]){
        cnt++
      }
    }

    if(cnt === 0){
      result.push(arr[i]);
    }

  }
}


