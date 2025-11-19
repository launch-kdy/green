import java.util.Scanner;

public class 리턴없는문제_메서드1_12 {
  public static void main(String[] args) {
    test10(5);
    test11(3,5);
    test12(5);
  }

  //10번
  public static void test10(int num){
    System.out.println(num % 2 == 0 ? "짝수" : "홀수");
  }
  //11번
  public static void test11(int a, int b){
    if(a % 2 == 0 && b % 2 == 0){
      System.out.println("둘 다 짝수");
    }
    else if(a % 2 != 0 && b % 2 != 0){
      System.out.println("둘 다 홀수");
    }
    else
      System.out.println("한 수만 짝수");
  }
  //12번
  public static void test12(int a){
    for (int i = 0; i <= a; i++)
      System.out.println(i);
  }

}
