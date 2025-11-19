public class 리턴없는문제_메서드1_15{
  public static void main(String[] args){
    test13(9, 2);
    test14(2, 19);
    test15("퉁퉁퉁퉁퉁퉁사후르", 3);
  }

  //13번
  public static void test13(int a, int b){
    int max = a > b ? a : b;
    int min = a > b ? b : a;

    for (int i = min + 1; i < max; i++){
      System.out.println(i);
    }
  }
  //14번
  public static void test14(int num1, int num2){
    int max = Math.max(num1, num2);
    int min = Math.min(num1, num2);
    // cnt를 여기 만들어 주기
    int cnt = 0;

    // 작은 수 + 1
    for (int i = min + 1; i < max; i++){
      if (i % 5 == 0) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
  //15번
  public static void test15(String a, int b){
    for (int i = 0; i < b; i++ ){
      System.out.println(a);
    }
  }
}
