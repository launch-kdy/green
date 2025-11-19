//(10) 정수를 5개 저장할 수 있는 배열을 만들고,
// scanner를 통해 입력받은 값을 하나씩 배열
//의 요소에 저장해보자. 만약 키보드로 1 2 3 4 5를 입력했다면
// 배열의 요소에 각각 1 2 3 4 5 가 저장되어야 한다.
// 출력을 통해 결과를 확인해 보아라.
package 실습;
import java.util.Scanner;
public class 배열1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];

    //배열의 크기만큼 키보드로 입력한 값을 각 요소에 저장한다.
    for(int i = 0 ; i < arr.length ; i++){
      //배열의 각 요소 = 키보드로 입력한 값
      System.out.println(i + "번째 요소의 값 : ");
      arr[i] = sc.nextInt();
    }

//    //배열에 저장된 모든 값 출력
//    for(int e : arr){
//      System.out.println(e);
//    }


  }
}
