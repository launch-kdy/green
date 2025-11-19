// (5) 정수를 5개 저장 할 수 있는 배열을 생성하고,
// 배열의 2번째, 4번째 요소의 값을 출력해보아라.
package 실습;
public class 배열1_5_특정요소출력 {
  public static void main(String[] args) {

    // (시작) 정수 00개 <저장후 배열 생성>문
    int[] arr = new int[5];


    // (마무리) 배열의 2번째 <요소값 출력>문 //
    // "무조건 0부터 시작하는 건 아니라고 함. 즉 1 부터 시작한 케이스"
    System.out.println(arr[2]);

    // (마무리) 배열의 4번째 <요소값 출력>문 //
    System.out.println(arr[4]);


  }
}
