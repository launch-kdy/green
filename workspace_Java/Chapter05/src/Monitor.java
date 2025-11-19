
//모니터 설계도
//데이터(변수로 표현) : inch, 색상, 가격, 브랜드
//기능(메서드로 표현) : 전원 on, off ...

//클래스의 구성요소 - 멤버변수=필드, 메서드의 정의, 생성자
//클래스안에서 선언한 변수를 멤버변수, 필드라고 부른다.
//변수의 종류 : 멤버변수, 지역변수, 매개변수
//지역변수 : 반드시 초기화 해야 사용가능 ! (메서드안에서 선언)
//멤버변수 : 초기화 하지 않으면 기본값으로 초기화가 자동진행 (클래스안에서 선언)
// *(int 0 / double 0.0 / string null)

  // <멤버변수의 예>
  public class Monitor {
    String brand;
    int price;
    String color;
    double inch;

  // <메서드의 정의>
  //전원 on 기능
  public void powerOn(){
    System.out.println("모니터 전원 켬");
  }

  //전원 off 기능
  public void powerOff(){
    System.out.println("모니터 전원 끔");
  }

}
