public class Member1_Test {
  public static void main(String[] args) {

    // * 실행 클래스 생성 후
    // 이름을 ‘자바’,
    // 아이디는 ‘java’
    // 비밀번호는 ‘123’으로 변경
    // 출력메소드를 사용하여 결과를 확인

  Member1 m1 = new Member1();
  m1.setName("자바");
  m1.setId("java");
  m1.setPw("123");
  m1.displayInfo();


  Member1 m2 = new Member1("자바", "java", "123");
  m2.displayInfo();



  }
}
