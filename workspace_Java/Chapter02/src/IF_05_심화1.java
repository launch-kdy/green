import java.util.Scanner;

//1. Scanner를 이용하여 정수를 3개 입력받고 이 세 개의 수로 삼각형을 만들 수 있는지를
//판별하라. 삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 한다.
public class IF_05_심화1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("1번째 변의 길이");
    int a = sc.nextInt();
    System.out.println("2번째 변의 길이");
    int b = sc.nextInt();
    System.out.println("2번째 변의 길이");
    int c = sc.nextInt();

    //삼각형이 가능하다면...
    if(a + b > c && a + c > b && b + c > a){
      System.out.println("삼각형 가능");
    }
    else{
      System.out.println("삼각형 불가능");
    }

  }
}
