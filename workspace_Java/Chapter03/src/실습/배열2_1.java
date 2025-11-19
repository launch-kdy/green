//(1) scanner로 정수 하나를 입력받아,
//입력받은 정수만큼의 길이를 갖는 배열을 생성하고 배
//열에 각 요소에 1 ~ 입력 받은 정수로 값을 저장한다.
//예를 들어 5를 입력했으면 길이가 5인 배열을 만들고
// 각 요소에 1,2,3,4,5가들어가야 한다.
// 그 후 배열에 들어간 수의 평균을 출력해보자.
package 실습;
import java.util.Scanner;
public class 배열2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("배열의 길이를 입력하세요 : ");

    int length = sc.nextInt();

    // (시작) 정수 00개 <저장후 배열 생성>문
    int[] arr = new int[length];

    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = i + 1;
    }

    //(모든 수의 합) 배열에 들어있는 모든수의 합을 저장하기 위해 변수 생성
    int sum = 0;
    for(int i = 0 ; i < arr.length ; i++){
      sum = sum + arr[i];
    }

    // (평균계산하기)
    double avg = (double)sum / arr.length;

    // (마무리 출력)
    System.out.println(avg);


  }
}
