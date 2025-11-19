public class 리턴없는문제_메서드1_6 {
  public static void main(String[] args) {
    plusTwo(2, 3);
    test5(2, 3, 5);
    test6(8,3);
  }
  //4번
  public static void plusTwo(int num1, int num2){
    System.out.println(num1 + num2);
  }
  //5번
  public static void test5(int a, int b, int c){
    System.out.println(a * b * c);
  }
  //6번
  public static void test6(int a, int b){
    System.out.println("몫 : " + a / b);
    System.out.println("나머지 : " + a % b);
  }

}
