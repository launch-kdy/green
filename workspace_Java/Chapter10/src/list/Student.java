package list;

public class Student {
  private String name;
  private int korScore;
  private int engScore;
  private int totalScore;

  public Student(String name, int korScore, int engScore) {
    this.name = name;
    this.korScore = korScore;
    this.engScore = engScore;
    this.totalScore = korScore + engScore;
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
  public void setTotalScore(int totalScore) {
    this.totalScore = totalScore;
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
  public int getTotalScore() {
    return totalScore;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", korScore=" + korScore +
            ", engScore=" + engScore +
            ", totalScore=" + totalScore +
            '}';
  }

}
