//(8) 정수를 10개 저장할 수 있는 배열을 생성하고,
//각 요소에 1 ~ 10까지 차례대로 넣어보라.
//그리고 값이 잘 들어갔는지 확인해보라.
package 실습;
public class 배열1_8 {
  public static void main(String[] args) {

    // (시작) 정수 00개 <저장후 배열 생성>문
    int[] arr = new int[10];

    //배열의 각 요소에 1~10까지 데이터를 (저장)
    // < for 문 작성 + arr 값 지정 >
    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = i + 1;
    }

    // 저장한 거 (출력)
    for (int i = 0 ; i < arr.length ; i++)
      System.out.println(arr[i]);


  }
}
