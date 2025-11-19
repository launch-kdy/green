public class Man_Test {
  public static void main(String[] args) {
    Man m1 = new Man();
    m1.name = "홍길동";
    m1.setName("이순신");
    m1.setMan("Kim", 30, "울산");
    m1.printMan();

    //나이값만 출력
    System.out.println(m1.age);
    System.out.println( m1.getAge() );

    //m1 객체의 이름이 kim이면 "참" 문자열 출력
    if( m1.getName().equals("kim") ){
      System.out.println("참");
    }

  }
}
