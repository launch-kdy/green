package stu;

import java.util.Scanner;

public class StudentManager {
  private Scanner sc;
  private Student[] students;

  private int cnt; // (* 등록된 학생수)

  public StudentManager(){
    sc = new Scanner(System.in);
    students = new Student[3];
    cnt = 0;
  }

  //학생등록
  public void regStudent(){
    //학생이 3명 등록되었다면 학생 등록 실행 x
    if(cnt >= 3){
      System.out.println("더 이상 학생을 등록할 수 없습니다");
    }
    else{
      System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");

      //<1.입력받은 정보로 학생을 생성>
      Student student = createStudent(); //(tel은 String 이기 때문에 4번째에 적기)

      //<2.생성한 학생을 배열에 저장>
      //<2-1> students[0 에서 cnt로 교체] = student;
      //<2-2> 두줄짜리를 한줄로 줄이기
      //students[cnt] = student;
      //cnt++;
      students[cnt++] = student;
      }
    }


  //학생정보변경(연락처)
  public void changeTelInfo() {
    System.out.println("학생의 연락처를 변경합니다.");
    System.out.println("변경 학생 : ");
    String name = sc.next();

    boolean isNotFound = true;
    for(int i = 0; i < cnt; i++){
      if(students[i].getName().equals(name)){
        System.out.println("연락처 : ");
        String tel =sc.next();
        students[i].setTel(tel);
        System.out.println("변경 완료");

        //찾았다
        isNotFound = !isNotFound;
        //이제 그만찾아
        break;
      }
    }

    if(isNotFound){
      System.out.println("이름이 일치하는 학생이 없습니다.");
    }

  }

  //학생정보출력
  public void printStudent(){
    System.out.print("정보를 열람할 학생 : ");
    String name = sc.next();

    //일치하는 학생이 있으면 정보 출력, 없으면 '일치하는 학생없음' 출력
    boolean isNotFound = true;
    for(int i = 0 ; i < cnt ; i ++){
      if(students[i].getName().equals(name)){
        //정보 출력
        students[i].display();
        isNotFound = false;
        break;
      }
    }

    if(isNotFound){
      System.out.println("못찾았어");
    }
  }

  //모든학생정보출력
  public void printStudentAll(){
    System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는" + cnt + "명입니다.");
    for(int i = 0 ; i < cnt ; i++){
      students[i].display();
    }
  }

  //키보드로 입력받은 정보를 가진 학생 객체를 생성후 리턴하는 메서드
  public Student createStudent(){
    System.out.println("이름 : ");
    String name = sc.next();
    System.out.println("나이 : ");
    int age = sc.nextInt();
    System.out.println("연락처 : ");
    String tel = sc.next();
    System.out.println("학점 : ");
    String grade = sc.next();

    //<1.입력받은 정보로 학생을 생성>
    Student student = new Student(name, age, grade, tel); //(tel은 String 이기 때문에 4번째에 적기)

    return student;
  }

}
