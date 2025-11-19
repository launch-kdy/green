import java.util.Scanner;
 // 5. 정수형 변수 하나를 선언하고 0 ~ 100까지의(0,100 포함) 숫자 중 임의의 값을 키보드로
 //입력받아 초기화하자. 그 후 변수의 값이 90보다 크고 100보다 작거나 같으면 ‘학점은 A입니
 //다.’를 출력하고, 80보다 크고 90보다 작거나 같으면 ‘학점은 B입니다.’를 출력하고, 80점 이
 //하라면 ‘학점은 C입니다.’를 출력해보자.
public class IF_03_5 {
  public static void main(String[] args) {
    //키보드 나오면 Scanner
    Scanner sc = new Scanner(System.in);

    System.out.println("0~100 슛자 입력 : ");
    int score = sc.nextInt();

    //학점(A, B, C) 데이터를 저장하는 변수
    String grade = "";

    //90보다 크고 100보다 작거나 같은 경우
    if( score > 90 && score <= 100 ){
      grade = "A";
    }
    //80보다 크고 90보다 작거나 같은 경우
    else if( score > 80 ){
      grade = "B";
    }
    //나머지 경우
    else{
      grade = "C";
    }
    System.out.println("학점은 " + grade + "입니다.");
  }
}
