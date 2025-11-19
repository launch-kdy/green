public class 리턴없는문제_메서드1_3 {
  public static void main(String[] args) {
    Hello("안녕하세요");
    tellNum(5);
    String("A");
  }
  //1번
  public static void Hello(String hello){
    System.out.println("인사는" + hello);
  }
  //2번
  public static void tellNum(int num){
    System.out.println(num);
  }
  //3번
  public static void String(String Name){
    System.out.println("a");
    System.out.println("b");
  }

}
