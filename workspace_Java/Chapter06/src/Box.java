public class Box {
  String a;
  private String b;
}

//private 접근제한자로 선언한 변수도 상속한다.
//단, 상속을 받아도 직접 접근은 불가능하다 (금고 사용 못함)

//접근제한자
//private < protected < default < public
//protected = private + 상속받은 자식 클래스의 직접 접근도 가능 (금고 사용 가능함)
class SubBox extends Box{
  public void test(){
    a = "aa";
    System.out.println(a);
    // b = "bb"; [ X ]
    // System.out.println(b); [ X ]
  }
}