public class Acc_Test {
  public static void main(String[] args) {
    //초기화
    // - 모든 다른 기능보다 먼저 실행되야함
    // - 초기화는 최초 1회만 실행되어야 한다.
    // - "메서드를 만들어서" 초기화 하는 것은, 적절하지 않을 수도 있다.
    // - -> 따라서 생성자 문법을 활용하여준다

    //생성자 호출
    // -> 클래스명 객체명 = new 생성자호출();
    Account acc1 = new Account();
    acc1.printAcc();

    Account acc2 = new Account(1000);
    acc2.printAcc();

    Account acc3 = new Account("1111", 5000, "Kim");
    acc3.printAcc();

    //계좌정보 초기화
    //acc.initAcc("1111",1000,"kim");
    //acc.printAcc();

  }
}
