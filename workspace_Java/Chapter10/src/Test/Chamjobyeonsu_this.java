package Test;

public class Chamjobyeonsu_this {

  // 인스턴트 변수
  long a, b;

  // 생성자
  Chamjobyeonsu_this(int a, int b) {
    this.a = a; //this 생략 불가능
    this.b = b;
  }

  // 인스턴스 메서드
  long add() {
    return a + b;
  }

  // static 메서드
  static long add(long a, long b){
    return  a+b;
  }

}
