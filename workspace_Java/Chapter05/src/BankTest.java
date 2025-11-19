public class BankTest {
  public static void main(String[] args) {
    Bank b1 = new Bank("kim");
    Bank b2 = new Bank("lee");
    Bank b3 = new Bank("hong");
    Bank b4 = new Bank("park");
    Bank b5 = new Bank("choi");

    System.out.println(b1.ir);
    System.out.println(b2.ir);

    Bank.ir = 8.0;
  }
}
