import java.util.Scanner;
//9. 정수형 변수를 두 개 선언하고, scanner로 값을 입력받는다. 입력받은 수의 크기를 비교하
//여 큰수부터 나열하여 출력하여라.(굵은 기울기체는 사용자가 입력하는 부분이다)-출력예시
//첫번째 수 : 10
//두번째 수 : 20
// 20 > 10
public class IF_03_9_another {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //일단 a, b 순서대로 첫번째 두번째
    System.out.print("첫번째 수 : ");
    int a = sc.nextInt();
    System.out.print("두번째 수 : ");
    int b = sc.nextInt();

    //min : 작은 값을 저장할 변수
    //max : 큰 값을 저장할 변수
    int min, max;

    //a가 b보다 클 경우
    if (a > b) {
      max = a;
      min = b;
    }
    //b가 a보다 클 경우
    else {
      max = b;
      min = a;
    }
    System.out.println(max + " > " + min);
  }
}
