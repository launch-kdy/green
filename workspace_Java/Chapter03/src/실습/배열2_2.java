//2. 초기값을 5,4,3,2,1로 갖는 배열 arr을 만들자. 그리고 길이가 5인 새로운 정수형 배열
//newArr을 만든 후 arr이 가진 값을 newArr로 복사하여 보자. 복사 결과는 출력을 통해 확
//인한다.
package 실습;

import 이론.ForEach;

public class 배열2_2 {
  public static void main(String[] args) {

    // (시작) 정수 00개 <저장후 배열 생성>문
    int[] arr = {5, 4, 3, 2, 1};

    // (시작) 길이가 5인 새로운 정수형 배열 newArr 생성
    int[] newArr = new int[5];

    //시뮬레이션
    //newArr[0] =arr[0];
    //newArr[1] =arr[1];
    //...
    //newArr[4] =arr[4];

    //arr 배열의 값을 newArr에 복사
    for(int i = 0; i < newArr.length; i++){
      newArr[i] = arr[i];
    }

    //newArr 데이터 확인
    // : 좌측 반복 돌린 데이터를 담을 수 있는 변수 / 우측 반복 돌릴 데이터
    for(int e : newArr){
      System.out.println(e);
    }



  }
}
