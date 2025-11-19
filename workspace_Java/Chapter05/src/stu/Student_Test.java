package stu;

import java.util.Scanner;

public class Student_Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //무한루프의 실행 여부룰 저장하고 있는 변수
    boolean isRunning = true;
    StudentManager manager = new StudentManager();

    System.out.println("학생관리 프로그램을 실행합니다.");

    //무한루프
    while(isRunning){
      System.out.print(" 1)학생등록  2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력  5)프로그램 종료 : ");
      int menu = sc.nextInt();

      //조건이 범위가 아니라, 1 2 3 4 5 라는 값으로 딱 정해져있기 때문에 if보다는 switch 활용
      switch (menu){
        case 1 :
          manager.regStudent();
          break;
        case 2 :
          manager.changeTelInfo();
          break;
        case 3 :
          manager.printStudent();
          break;
        case 4 :
          manager.printStudentAll();
          break;
        case 5 :
          System.out.println("프로그램을 종료합니다.");
          isRunning = false;
          break;
        //default (1~5 말고 잘 못 입력했을 때)
        default :
          System.out.println("1 ~ 5 슷자 중에서 입력해라.");
      }

    }

  }
}
