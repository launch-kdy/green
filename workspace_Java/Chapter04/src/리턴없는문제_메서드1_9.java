import java.util.Scanner;

public class 리턴없는문제_메서드1_9 {
  public static void main(String[] args) {

    test7("안녕", "하세요");

    Scanner sc = new Scanner(System.in);
    System.out.println("정수입력");
    int a = sc.nextInt();
    test8(a);

    //Scanner sc = new Scanner(System.in);
    System.out.println("정수두개입력");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    test9(num1, num2);
  }

  //7번
  public static void test7(String str1, String str2){
    System.out.println(str1 + str2);
  }

  // 8. 키보드로 입력받은 정수를 매수변수로 받아,
  // 해당 정수를 출력하는 메소드를 선언, 호출해보세요
  public static void test8(int num){
    System.out.println(num);
  }

  //9번
  public static void test9(int a, int b){
    System.out.println(a + b);
  }

}
