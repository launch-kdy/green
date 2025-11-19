public class Student {
  private String name;
  private int KorScore;
  private int EngScore;
  private int mathScore;

  public String getName() {
    return name;
  }
  public int getKorScore() {
    return KorScore;
  }
  public int getEngScore() {
    return EngScore;
  }
  public int getMathScore() {
    return mathScore;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setKorScore(int korScore) {
    KorScore = korScore;
  }
  public void setEngScore(int engScore) {
    EngScore = engScore;
  }
  public void setMathScore(int mathScore) {
    this.mathScore = mathScore;
  }
}
