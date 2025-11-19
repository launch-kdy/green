//(9) 1,5,7을 초기값으로 저장하고 있는 배열을 만들고,
//배열의 모든 요소의 합을 출력해보아라.
package 실습;
import 이론.ForEach;
public class 배열1_9 {
  public static void main(String[] args) {

    // (시작) 정수 00개 <저장후 배열 생성>문
    int[] arr = {1, 5, 7};

    // (모든 수의 합) 배열에 들어있는 모든수의 합을 저장하기 위해 변수 생성
    int sum = 0;

//    //for each
//    for(int e : arr){
//      sum = sum + e;
//    }

    for (int i = 0 ; i < arr.length ; i++){
      sum = sum +arr[i];
    }

    System.out.println(sum);


  }
}
