public class MyStudent implements StudentUtil{
  //매개변수로 전달되는 학생의 총점을 리턴
  @Override
  public int getTotalScore(Student student) {
    int sum = student.getKorScore() + student.getEngScore() + student.getMathScore();
    return sum;
  }

  //메개변수로 전달된 두명의 학생중
  //총점이 높은 학생을 리턴
  @Override
  public Student getHighScoreStudent(Student stu1, Student stu2) {
    int sum1 = getTotalScore(stu1);
    int sum2 = getTotalScore(stu2);
    return sum1 > sum2 ? stu1 : stu2;
  }

  @Override
  public String getGradeByStudentName(Student[] students, String name) {
    double avg = 0.0; //찾은 학생의 평균을 저장할 평균
    String grade = "학생 없음"; //학생의 등급을 결정
    for(Student e : students){
      if(e.getName().equals(name)){
        avg = getTotalScore(e) / 3.0;
        grade = getGradeByAvg(avg);

      }
    }

    return grade;
  }

  //평균으로 등급 결정 후 리턴
  public String getGradeByAvg(double avg){
    String grade = "";
    if(avg >= 90){
      grade = "A";
    }
    else if(avg >= 80){
      grade = "B";
    }
    else if(avg >= 70){
      grade = "C";
    }
    else{
      grade = "D";
    }
    return grade;
  }

}
