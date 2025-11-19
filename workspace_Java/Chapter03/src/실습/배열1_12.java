// 12.(난이도 상) 간단한 성적처리 시스템을 만들어보자. 국어, 영어, 수학점수를 입력받아 각
//과목에 대한 점수 및 총점, 평균을 출력하는 프로그램을 만들어보자. 반드시 배열을 사용하도
//록 한다.
package 실습;
import java.util.Scanner;
public class 배열1_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //필요한 변수: 0 :국어점수, 1 :영어점수, 2 :수학점수, 3 :총점
    int[] scores = new int[4];
    String[] subjects = {"국어", "영어", "수학"};

    //평균
    double avg;

    //----- 점수 입력 -----//
    //for 문 무한루프 - for(;;){ }
    //while 문 무한루프 - while(true){ }

    for(int i = 0 ; i < scores.length - 1 ; i++){
      while(true){
        System.out.println(subjects[i] + "점수 : ");
        scores[i] = sc.nextInt();

        if(scores[i] >= 0 && scores[0] <= 100){
          break;
        }
      }
    }

    //총점 및 평균 계산
    for(int i = 0 ; i < scores.length - 1 ; i++){
      scores[scores.length - 1] = scores[scores.length - 1] + scores[i];
    }

    //평균
    avg = scores[scores.length - 1] / (double)subjects.length;

    //각 과목의 점수, 총점, 평균 출력
    for(int i = 0 ; i < subjects.length ; i++){
      System.out.println(subjects[i] + "점수 - " + scores[i]);
    }

    System.out.println("총점 - " + scores[scores.length - 1]);
    System.out.println("평균 - " + avg);


  }
}