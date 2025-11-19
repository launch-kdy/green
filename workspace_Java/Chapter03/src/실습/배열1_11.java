//(11) 1, 2, 3, 4, 5, 6 ,7 ,8 로
//초기화된 배열을 만들고,
//배열의 요소 중 짝수의 개수를
//구하는 프로그램을 만들어라.
package 실습;
public class 배열1_11 {
  public static void main(String[] args) {

    // (시작) 정수 00개 <저장후 배열 생성>문
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

//    for문
//    int cnt = 0;
//    for(int i = 0 ; i < arr.length ; i++){
//      if(arr[i] % 2 == 0){
//        cnt++;
//      }
//    }
//    System.out.println(cnt);

    //for-each문
    int foreachCnt = 0;
    for(int e : arr){
      if(e % 2 == 0){
        foreachCnt++;
      }
    }
    System.out.println(foreachCnt);


  }
}
