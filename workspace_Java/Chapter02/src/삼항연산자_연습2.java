import java.util.Scanner;
//정수형 변수를 두 개 선언하고, scanner로 값을 입력받는다.
//입력받은 수의 크기를비교하여 큰수부터 나열하여 출력하여라.
public class 삼항연산자_연습2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("첫번 째 수 : ");
    int a = sc.nextInt();
    System.out.println("두번 째 수 : ");
    int b = sc.nextInt();

    int max = a > b ? a : b;
    int min = a > b ? b : a;

  }
}
