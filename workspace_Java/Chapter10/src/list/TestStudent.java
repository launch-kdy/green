package list;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
  public static void main(String[] args) {
    //리스트 생성 및 학생 추가
    List<Student> studentList = new ArrayList<>();

    // * 객체를 생성하는 명령어 .add(new Student("", , ))
    studentList.add(new Student("홍길동", 70, 80));
    studentList.add(new Student("이순신", 80, 90));
    studentList.add(new Student("임꺽정", 70, 60));

    // 리스트에 저장된 모든 정보를 출력
    // 우측에는 반복을 돌릴 데이터, 왼쪽에는 저장할 '변수 student 만들기'
    for (Student student : studentList){
      System.out.println(student.toString());
    }
    System.out.println();

    // 총점이 150점 이상인 학생의 모든 정보를 출력
    for (Student student: studentList){
      if(student.getTotalScore() >= 150){
        System.out.println(student.toString());
      }
    }
    System.out.println();

    int sum = 0;
    for (Student student : studentList){
      //student.getTotalScore(); = 학생 한명당 토탈 점수 빼오기
      sum = sum + student.getTotalScore();
    }
    double avg = (double)sum / studentList.size(); // 데이터의 수 = 학생 수 studentList.size();
    System.out.println(avg);
    System.out.println();

    //총점이 1등인 학생의 모든 정보를 출력
    // 가장 큰 정수를 가진 학생이 저장된 index가 필요함
    int maxIndex = 0; // '가정' 0번째 있는 사람이 가장 큽니다
    for (int i = 1; i < studentList.size(); i++){ //int i = 0말고, 1넣은 이유는 어쩌피 max가 0이니까 중복빼기
      if (studentList.get(i).getTotalScore() > studentList.get(maxIndex).getTotalScore()){
        maxIndex = i;
      }
    }
    System.out.println(studentList.get(maxIndex).toString());

  }
}
