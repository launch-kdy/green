import java.util.Scanner;

// 3. 간단한 계산기 프로그램 IF문을 활용하여 만들어 보자. 계산을 위해 두 정수가 필요하고,
//연산자(+, -, *, /)를 입력받을 문자열 변수도 필요해 보인다. 만약 두 수를 각각 1, 2로 입력
//받고 연산자로 +를 입력받았다면 출력결과는 ‘1 + 2 = 3’처럼 되어야한다. 그리고 연산자를
//잘못 입력하였다면 ‘연산자를 잘못 입력하였습니다.라고 출력되어야한다.
public class IF_04_3_계산기만들기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2; // 연산에 사용될 임의의 정수 두개가 저장될 (변수)
    String oper; // (+, -, *, /) 등의 연산자가 저장될 (변수)

    System.out.println("첫번째 수 : ");
    // 키보드로 정수를 적어서, num1(변수)에 저장
    num1 = sc.nextInt();

    System.out.println("두번째 수 : ");
    // 키보드로 정수를 적어서, num2(변수)에 저장 --- < 정수는 nextInt 그대로 >
    num2 = sc.nextInt();

    System.out.println("연산자 : ");
    // 키보드로 정수를 적어서, oper(변수)에 저장 --- < 연산자는 next 에 저장 >
    oper = sc.next();

    // 입력받은 (+, -, *, /) 연산자에 따라 연산을 진행
    // (+) 인 경우 [예시] 3 + 5 = 8
    if( oper.equals("+") ){
      System.out.println(num1 + oper + num2 + "=" + (num1 + num2)); //--- < 미리만든 연산자 oper 써먹기 >
    }
    // (-) 인 경우
    else if( oper.equals("-") ){
      System.out.println(num1 + oper + num2 + "=" + (num1 - num2));
    }
    // (*) 인 경우
    else if( oper.equals("*") ){
      System.out.println(num1 + oper + num2 + "=" + (num1 * num2));
    }
    // (/) 인 경우
    else if( oper.equals("/") ){
      System.out.println(num1 + oper + num2 + "=" + (num1 / (double)num2)); //--- < 실수 계산으로 고치기 위해서, (double) 넣어서 정수를 실수로 강제로 바꾸기 >
    }
    // ( ) 연산자를 잘못 입력한 경우
    else{
      System.out.println("연산자를 잘못 입력하였습니다.");
    }



  }
}
