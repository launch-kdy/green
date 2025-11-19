// [준비물 1. 정보 보관소 Stu 파일] //


public class Stu {
  // 학생 1명 ( * 기본정보를 저장)하는 - <자료형> //
//-------------------------------------------
  private int stuNum; //(학번)
  private String name; //(이름)
  private int korScore; //(국어점수)
  private int engScore; //(영어점수)
//-------------------------------------------


  // ( * 모든변수의 값을 변경)할 수 있는 - <생성자> //
  //---------------------------------------------
  public Stu(int stuNum, String name, int korScore, int engScore) {
    this.stuNum = stuNum; //(this.@@ = @@)
    this.name = name; //( '' )
    this.korScore = korScore; //( '' )
    this.engScore = engScore; //( '')
  }
  //---------------------------------------------


  // ( * getter 게터 ) - 생성 //
  //---------------------------
  public int getStuNum() {
    return stuNum;
  }
  public String getName() {
    return name;
  }
  public int getKorScore() {
    return korScore;
  }
  public int getEngScore() {
    return engScore;
  }
  //---------------------------


  // ( * setter 세터) - 생성 //
  //--------------------------
  public void setStuNum(int stuNum) {
    this.stuNum = stuNum;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setKorScore(int korScore) {
    this.korScore = korScore;
  }
  public void setEngScore(int engScore) {
    this.engScore = engScore;
  }
  //--------------------------------------



  // ( * 모든 변수의 값 출력 메소드) display() - 생성 //
  //-----------------------------------------------
  public void display(){
    System.out.println("학번 : " + stuNum);
    System.out.println("이름 : " + name);
    System.out.println("국어점수 : " + korScore);
    System.out.println("영어점수 : " + engScore);
  }
  //-----------------------------------------------
}