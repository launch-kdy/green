import java.util.Scanner;
  //2. 키보드로 정수를 하나 입력받아, 입력받은 값이 짝수이면 ‘짝수입니다.’, 홀수이면 ‘홀수입
  //니다.’를 출력해보자.
public class IF_03_2 {
  public static void main(String[] args) {
    //scanner 생성
    Scanner sc = new Scanner(System.in);

    //키보드로 입력받은 정수를 저장할 변수를 선언
    int num;

    //키보드로 정수를 입력받아, 그 값을 변수 num에 저장
    num = sc.nextInt();

    if( num % 2 == 0 ){
      System.out.println("even=짝수입니다.");
    }
    // 홀수이면...
    else if( num % 2 == 1 ){
      System.out.println("odd=홀수입니다.");
    }
    // 0이라면...
    else{
      System.out.println("0입니다.");
    }

    System.out.println("프로그램 종료");

  }
}
