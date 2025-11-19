public class 리턴있는문제_메서드2_8 {
  public static void main(String[] args) {

    //String result = test5(85);
    //System.out.println(result);

    //String result = test6(10);

    //System.out.println(test7(3.0));

    //double result = test8(5, 10,15);
    //System.out.println(result);


  }
  //5번
  public static String test5(int a){
    if ( a >= 90 ){
      return "A";
    }
    else if ( a >= 70 ){
      return "B";
    }
    else{
      return "C";
    }
  }
  //6번
  public static String test6(int num){

    //문자열 -> 정수 <개ㅇ열받는 응용>
    //int result1 = Integer.parseInt("10"); // -> 정수 10

    //정수 -> 문자열 < 개여ㅑㄼ받는 응용3>
    //String result2 = String.valueOf(10); // -> 문자열 "10"

    //숫자 + 문자열 = 문자열이 오기때문에, <개ㅇ열받는 응용2>
    return num + "";}

  //7번
  public static double test7(double num){
    return num * num;
  }

  //8번
  public static double test8(int a, int b, int c){
    return (a + b + c) / 3.0;}

}
