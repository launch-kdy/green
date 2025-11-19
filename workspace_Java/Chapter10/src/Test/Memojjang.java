package Test;

public class Memojjang {
  public static void main(String[] args) {

    //(1) if - else if문
    System.out.println("(1) if - else if문 입니다.");
    String weekend = "길다";

      if(weekend == "길다") {
        System.out.println("정답입니다");
      }
      else if(weekend == "짧다"){
        System.out.println("오답입니다.");
      }

    //(2) 그리고 && (and) 또는 || (or)연산자
    System.out.println("(2) 그리고 && (and) 또는 || (or)연산자 입니다.");
    int a = 1;

      if(a == 0 && a == 1){
        System.out.println("테스트1입니다");
      }
      if(a == 0 || a == 1){
        System.out.println("테스트2입니다");
      }

    //(3) for문
    System.out.println("(3) for문 입니다.");
    int num = 0;
      for (int i = 0; i < 5; i++) {
        num++;
        System.out.println(num);
      }
    //(4) Array 배열문
    System.out.println("(4) Array 배열문 입니다.");
    System.out.println("(4-1) 정수형 배열 선언과 초기화 입니다.");
    int[] numbersTest1 = {1, 2, 3, 4, 5};
    System.out.println("(4-2) 정수형 배열 선언입니다.");
    int[] numbersTest2 = new int[5];
    System.out.println("(4-3) 값을 할당합니다.");
    numbersTest2[0] = 1;
    numbersTest2[1] = 2;
    numbersTest2[2] = 3;
    numbersTest2[3] = 4;
    numbersTest2[4] = 5;
    System.out.println("(4-4) 문자열 배열 선언과 초기화 입니다.");
    String[] fromis9 = {"송하영", "박지원", "이채영", "이나경", "백지헌"};
    //System.out.println(" 입니다.");


  }
}
