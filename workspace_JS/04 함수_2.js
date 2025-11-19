//함수 3번 연습 (완벽하게 이해 완료함 - 배열의 배열의 배열의 배열값)
//const array1 = [1, [1, 2], [1, [5, 6], 3]];
//console.log(array1[1][1]);
//console.log(array1[2][1][0])

//함수'button1' 만들기
function button1(){
  alert(1);
}

//함수 1번 정답 : 'test1' 만들기
//function test1(num1, num2){
//  if((num1 + num2) % 2 === 0){
//    alert(1);
//  }
//  else{
//    alert(2);
//  }
//}

//함수 1번 정답 : 'test1' 만들기 (삼항연산자 버전)
  function test1(num1, num2){
    alert( (num1 + num2) % 2 === 0 ? 1 : 2) ;
  }


//함수 2번 정답 : 'test2' 만들기
  function test2(arr1, arr2){

    //arr1 배열의 합
    let sum1 = 0;
    for(let i = 0; i < arr1.length ; i++){
      sum1 = sum1 + arr1[i];
    }
    
    //arr2 배열의 합
    let sum2 = 0;
    for(let i = 0; i < arr2.length ; i++){
      sum2 = sum2 + arr2[i];
    }

    //function 제일끝에 (arr1 배열의 합) - (arr2 배열의 합)
    alert(sum1 - sum2);
  }

  test2([1,2,3],[1,1,1]);


//함수 3번 정답 : 'test3' 만들기
  function test3(){
    alert();
  }