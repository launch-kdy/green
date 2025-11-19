public class Member_Test {
  public static void main(String[] args) {
    //등록한 회원의 정보를 확인하기 위해 모든 정보를 출력하는 메소드

    Member m1 = new Member();
    Member m2 = new Member();

    m1.setMemberInfo("홍길동", "hong", "1234", 20);
    m2.setMemberInfo("유관순", "aaa", "1234", 20);

    m1.printMemberInfo();
    System.out.println();
    m2.printMemberInfo();

  }
}
