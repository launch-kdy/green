import java.util.Scanner;

public class IF_3 {
  public static void main(String[] args) {
    //키보드로 정수 두개를 입력받아,
    //두 정수의 합이 10 이상이면, "합이 10 이상입니다"를 출력
    Scanner sc = new Scanner(System.in);
    int x;
    System.out.println("정수 x입력");
    x = sc.nextInt();

    int y;
    System.out.println("정수 y입력");
    y = sc.nextInt();

    if(x + y >= 10){
      System.out.println("합이 10 이상입니다");

    }
    System.out.println("프로그램종료");
  }
}
