import java.security.PrivateKey;

//자바는 다중상속을 자원하지 않습니다.
//우리가 상속받는다면 누구한테 받는다 -> 부모님

public class Quiz_7 {

  class A {
    private int n;

    public int getN() {
      return n;
    }

    public void setN(int i) {
      n = i;
    }
  }

  class B extends A {
    public String s;
    public int m;
    private char c;

    public void setC(char ch) {
      c = ch;
    }

    public char getC() {
      return c;
    }
  }

  class C extends B {
    public double d;
  }

}
