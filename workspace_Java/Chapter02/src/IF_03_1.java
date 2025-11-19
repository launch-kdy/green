import java.util.Scanner;
  //1. 정수를 담을 수 있는 변수 두 개를 선언하고, 각각의 변수에 임의의 정수를 초기화하여라.
  //그리고 두 수의 합이 50보다 클 경우에는 ‘두 수의 합이 50보다 큽니다.’를 출력하고, 두
  //수의 합이 50 이하일 경우에는 ‘두 수의 합이 50이하 입니다.’를 출력해보세요.
public class IF_03_1 {
  public static void main(String[] args) {
    //정수를 저장할 두 변수 a, b 선언
    int a, b;

    //두 변수 a,b에 임의의 정수 지정
    a = 1;
    b = 2;

    //두 수의 합이 50보다 클 경우에는
    if( a + b > 50 ){
      System.out.println("두 수의 합이 50보다 큽니다.");
    }
    //두 수의 합이 50이하인 경우에는
    else if( a + b <= 50 ){
      System.out.println("두 수의 합이 50이하 입니다.");
    }

    System.out.println("프로그램 종료");

  }
}
