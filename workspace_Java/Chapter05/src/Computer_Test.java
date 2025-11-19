public class Computer_Test {
  public static void main(String[] args) {
    //객체명
    Computer c1 = new Computer("삼성", 1000);
    c1.display();

    //이건 선언만 하는 것 *위와 같은 객체생성이 아님
    Computer c2 = c1;
    //참조자료형은 선언하면 무조건 null 가짐
    c2.display();

    c2.price = 2000;
    System.out.println(c2.price);
    System.out.println(c1.price);

    //클래스는 자료형이다
    int[] arr = {1, 2, 3};

    Computer[] array = new Computer[3];

    }

    public Computer test(Computer c){
      c.display();
      return c;
    }


}
