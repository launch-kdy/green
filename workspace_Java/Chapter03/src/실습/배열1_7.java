//(7) 정수를 10개 저장할 수 있는 배열을 생성하고
//모든 요소에 3을 넣어라. 그리고 3이 잘 들
//어갔는지 출력하여 확인해보아라.
package 실습;
public class 배열1_7 {
  public static void main(String[] args) {

    // (시작) 정수 00개 <저장후 배열 생성>문
    int[] arr = new int[10];

    // (특정값 저장) 배열의 (모든 요소에 특정값)을 저장
    // < for 문 작성 + arr 값 지정 >
    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = 3;
    }

    // (마무리) 배열의 '모든 all' <요소값 출력>문 //
    for(int i = 0 ; i < arr.length ; i++){
      System.out.print(arr[i] + " "); //
    }


  }
}
