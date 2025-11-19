//8. 키보드로 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하세요.
package 실습;

import java.util.Scanner;

public class 반복문문제8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 입력 : ");
    int num = sc.nextInt(); //num이 5라고 가정...

    int cnt = 0; //짝수의 갯수

    for(int i = 1 ; i < num + 1 ; i++){
      if(i % 2 ==0){
        cnt++;
      }
    }
    System.out.println("1과 " + num + "사이의 짝수의 갯수는 " + cnt + "개 입니다.");

  }
}
