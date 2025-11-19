//11. 키보드로 두 정수를 입력받아 입력받은 두 정수 사이의 모든 정수의 합을 출력하여라.
package 실습;

import java.util.Scanner;

public class 반복문문제11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1 < 2 3 4 > 5
    System.out.println("첫번째 수 : ");
    int num1 = sc.nextInt();
    System.out.println("두번째 수 : ");
    int num2 = sc.nextInt();

    //입력받은 두 수에서 큰 수와 작은 수를 구분
    //삼항연산자 (참/거짓) 판단
    int max = num1 > num2 ? num1 : num2; //큰 거라고 박제
    int min = num1 > num2 ? num2 : num1; //작은 거라고 박제

    //모든 합을 저장 할 변수
    int sum = 0;

    //min : 1, max : 5
    int i = min + 1; //제일 작은 수 + 1 -> 사이 수 니까, 1최소값 < [2 = 1+(1최소값)] 3 4 > 5
    while (i < max){
      sum = sum + i;
      i++;
    }
    System.out.println(sum);


  }
}
