package Test.Test4;

public class MemberTest1 {
  public static void main(String[] args) {
    //멤버클래스의 객체 생성
    Member member = new Member();
    //내가 가진 아이디
    member.setInfo ("java", "1234", "kim", 20);
    member.showInfo();

    boolean result = member.isLogin("java", "1234");
    if(result){
      System.out.println("로그인 가능");
    }
    else {
      System.out.println("로그인 불가");
    }
  }
}
