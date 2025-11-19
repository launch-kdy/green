package 이론;

import java.util.Scanner;

public class 무한루프_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    while (true) {
      System.out.println("0 ~ 100점 사이의 값을 입력하시오.");
      int score = sc.nextInt();

      if(score  >= 0 && score <= 100){
      }
      break;
    }


  }
}
