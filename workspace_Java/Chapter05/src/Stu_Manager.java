// [준비물 2. 학생 관리소 Stu_Manager 파일]
// 학생 ('등록' / '목록 조회' / '학생 1명 정보' 조회)하는 - 기능 //
import java.util.Scanner;


public class Stu_Manager {
  // 멤버변수 ( * 학생 관리소 제작) //
//-------------------------------
  private Stu[] students; //(학생 저장 칸 - 배열 준비 -)
  private int cnt; //(전체 학생 수 - 숫자 저장 -)
  private Scanner sc; //(키보드 입력 - 준비 - )
//-------------------------------


  // 생성자 ( * 학생 관리소 초기화) //
  //------------------------------
  public Stu_Manager(){
    students = new Stu[5]; //(학생 배열 생성)
    cnt = 0; //(학생 수 0으로 초기화)
    sc = new Scanner(System.in); //(키보드 입력 - 받기 - )
  }
  //------------------------------



  // 등록란 생성 ( * 학생 등록 및 입력 기능) //
  //--------------------------------------
  public void regStudent(){
    System.out.println("-- 학생 등록을 시작합니다 --");

    // ( * 학생 1명 정보 - 키보드로 입력) //
    System.out.println("학번 : ");
    int stuNum = sc.nextInt();
    System.out.println("이름 : ");
    String name = sc.next();
    System.out.println("국어점수 : ");
    int korScore = sc.nextInt();
    System.out.println("영어점수 : ");
    int engScore = sc.nextInt();

    // ( * 학생 1명 객체 - 생성) //
    Stu student = new Stu(stuNum, name, korScore, engScore);
    // ( * 학생 1명 객체 - 배열에 저장) //
    students[cnt] = student;
    cnt++;
  }
  //--------------------------------------



  // ( * 모든 학생 정보 - 출력 기능) //
  public void printStudentInfoAll(){
    System.out.println("-- 모든 학생의 정보는 다음과 같습니다 --");
    for(int i = 0; i < 2; i++){ // ( * 등록된 학생 수 만큼 출력 - 반복 - )
      students[i].display(); // ( * 학생 1명 정보 출력 )
    }
  }
  //-------------------------------


  // ( * 학생 1명 1명의 정보 - 출력 기능) //
  public void printStudentInfo(){
    System.out.println("학생 한명 정보 출력 기능 실행");
  }
  //-------------------------------------
}