import java.util.Scanner;

/*국어, 영어, 수학 점수를 Scanner를 사용하여 입력받는다. (단, 국,영,수 점수는 0 ~ 100
점 사이라고 가정하고, 소수점 점수는 없다.) 아래의 결과와 동일한 결과가 나오도록 프로그램
을 작성하시오. (굵은 기울기체는 사용자가 입력하는 부분이다)
 */
public class 점수입력_문제 {
  public static void main(String[] args) {
    // 키보드 입력을 위한 scanner 생성
    Scanner sc = new Scanner(System.in);

    // 1. 문제를 접근하기 전 - 필요 변수 선언을 생각과 판단.
    // (동일한 자료형은 , 쉼표로 연결가능 - int korScore, engScore, mathScore //
    // 국, 영, 수 점수 저장을 위한 변수
    int korScore, engScore, mathScore; // (국 영 수 점수 저장을 위한 정수)
    int totalScore; // (총점 저장을 위한) 변수
    double avg; // (평균 데이터를 저장할) 변수

    //----- 국 영 수 점수 입력 -----//
    System.out.print("국어 점수 : "); // (println 에서 ln 빼기. 왜냐하면 개행을  안 할거니까)
    korScore = sc.nextInt(); //키보드를 점수를 입력받고, korScore 변수에 저장

    System.out.print("영어 점수 : ");
    engScore = sc.nextInt();

    System.out.print("수학 점수 : ");
    mathScore = sc.nextInt();

    //----- 총점 및 평균 계산 -----//
    totalScore = korScore + engScore + mathScore;
    avg = totalScore / 3.0; // (실수의 값을 얻기 위해서, 하나를 실수형태로 변환)

    //----- 총점 및 평균 출력 -----//
    System.out.println("총점 : " + totalScore);
    System.out.println("평균 : " + avg);

  }
}
