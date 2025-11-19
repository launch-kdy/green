import java.util.Scanner;
  // 3. a, b 두 변수 선언 후 키보드로 입력받은 정수를 각각 저장한다. 그 후 a의 값이 크다면
  //‘a가 큽니다.’를, b의 값이 크면 ‘b가 큽니다’를, 두 변수의 값이 같다면 ‘같습니다.’를 출력해
  //보자.
public class IF_03_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;

    System.out.println("첫번째 수");
    a=sc.nextInt();

    System.out.println("두번째 수");
    b=sc.nextInt();

    //만약에 a가 b보다 크다면
    if(a > b) {
      System.out.println("a 가 큼");

    }

    // 그렇지 않고 b가 a보다 크다면
    else if(a > b) {
      System.out.println("b 가 큼");
    }

    else{
      System.out.println("같음");
    }


    System.out.println("프로그램 종료.");

  }
}
