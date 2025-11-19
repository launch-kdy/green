public class 삼항연산자 {
  public static void main(String[] args) {
    //삼항연산자 : 항이 3개 있는 연산자, if - else 와 같은 기능
    //문법 : 참 또는 거짓을 판별할 수 있는 조건 ( ? ) - 참일때 값 ( : ) - 거짓일때 값;

    int num = 3;
    String result = "";

    if(num > 1){
      result = "참";
    }

    else{
      result = "거짓";
    }

    System.out.println(result);

    /// ///////////////////////////////////////////////////////////////////
    int a = 3;

    //소괄호 안의 내용을 출력하고 한 줄 개행한다.
    //안의 소괄호 안의 내용이 연산 가능하면 연산 결과를 출력한다.
    System.out.println(a > 1 ? "참" : "거짓");


  }
}
