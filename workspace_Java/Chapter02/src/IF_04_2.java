import java.util.Scanner;

public class IF_04_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("성별 입력 : ");
    String gender = sc.next();

    switch (gender){
      //문자열나오면 무조건 " " 쌍따옴표 감싸라 안 그러면 인식 안 된다.
      case "남" :
        System.out.println("남자입니다");
        break;
      case "여" :
      System.out.println("여자입니다");
        break;
      default :
        System.out.println("다시 입력하세요");
    }

  }
}
