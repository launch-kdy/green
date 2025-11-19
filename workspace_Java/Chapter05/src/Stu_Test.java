// [실행물 3. 학생 열람소 Stu_Test 파일]

public class Stu_Test {
  public static void main(String[] args) {

    // * [준비물 1.정보 보관소 Stu 파일] 실행시킨다.>
    Stu_Manager stu_Manager = new Stu_Manager();

    // * [준비물 2.학생 관리소 Stu_Manager 파일] 1번째 학생을 등록시킨다.>
    stu_Manager.regStudent();
    // * [준비물 2.학생 관리소 Stu_Manager 파일] 2번째 학생을 등록시킨다.>
    stu_Manager.regStudent();

    // * [실행물 3.학생 열람소 Stu_Manager 파일] 모든 학생을 열람한다.>
    stu_Manager.printStudentInfoAll();

  }
}