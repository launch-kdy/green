//5. 반복문을 사용하여 1 ~ 10까지의 합을 구하세요.
package 실습;
public class 반복문문제_5_for {
  public static void main(String[] args) {

    int sum = 0;//합을 누적시키기 위해서 변수를 빼놓는다
    for (int i = 1 ; i < 11 ; i++){
      sum = sum + i;
    }
    System.out.println(sum);

  }
}
