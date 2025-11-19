import java.util.Scanner;
//4. 키보드로 정수 하나를 입력받아, 그 값이 3의 배수이면 ‘3의 배수입니다’를 출력해보자.
public class IF_03_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수를 입력하시오.");
    int num =sc.nextInt();

    //num이 3의 배수라면...
    if( num % 3 == 0 ){
    System.out.println("3의 배수입니다.");
    }

    System.out.println("프로그램을 종료합니다.");
  }
}
