public class 리턴있는문제_메서드2_10 {
  public static void main(String[] args){

    //10번
    //비교연산자의 실행결과는 (true / false) 로 나온다
    //System.out.println( 10 > 3 ); // "10 > 3"
    //boolean result = test10("a");
    //System.out.println(result);


  }

  //9번
  //한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드를 선
  //언하고 사용해보세요.
  //public static int oddSum(int num){

  //  int sum = 0;

  //  for(int i = 1; i <= num; i++){
  //    if(i % 2 == 1){
  //      sum = sum + i;
  //    }
  //  }
  //  return sum;
  //}


  //10번
  //* 문자열.length() -> 문자열의 길이를 리턴.
  public static boolean test10(String str){
    //return str.length() % 2 == 0 ? true : false;
    return str.length() % 2 == 0; // ( 2 == 0 의 결과인 ture / false 가 ) -> ( return 값으로 이동 됨 )
  }
}
