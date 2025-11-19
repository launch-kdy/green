public class 리턴있는문제_메서드2_4 {
  public static void main(String[] args) {
    //int sum = test1(10, 20);
    //System.out.println(sum);

    //Scanner sc =new Scanner(System.in);
    //System.out.println("정수 두개 : ");
    //int a = sc.nextInt();
    //int b = sc.nextInt();
    //int result = test2(a, b);
    //System.out.println(result);

    //int result = test3(10, 5);
    //System.out.println(result);

    //문자열은 + 가 아니라 (쉼표)로 연결해야한다
    String result = test4("퉁퉁퉁퉁퉁퉁퉁퉁", "사후르");
    System.out.println(result);

  }
  //1번
  public static int test1(int a, int b){
    return a + b;
  }
  //2번
  public static int test2(int a, int b){
    return a * b;
  }
  //3번
  public static int test3(int a, int b){
    return Math.max(a, b);
  }
  //4번
  public static String test4(String a, String b){
    return a + b;
  }

}
