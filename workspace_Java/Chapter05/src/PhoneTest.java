public class PhoneTest {
  public static void main(String[] args) {
    //클래스명 객체명 = new 클래스명();

    //Phone 클래스에 대한 객체 p1을 생성
    Phone p1 = new Phone();

    //p1 객체의 모델명을 출력해보세요
    //sout(객체명.00)
    System.out.println(p1.modelName);

    //p1 객체의 모델명, 가격. os 정보를 출력해보세요
    //객체명.메소드();
    p1.printPhoneInfo();

    //p1 객체의 가격을 1000원으로 변경해보세요
    //객체명으로 변경 <실무에서 사용 안 함>
    p1.price = 1000;
    //메소드 매개변수로 변경 <실무에서 사용>
    p1.setPrice(1000);


  }
}
