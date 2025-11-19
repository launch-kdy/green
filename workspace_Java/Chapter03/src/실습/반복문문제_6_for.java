//6. 1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요.
package 실습;
public class 반복문문제_6_for {
  public static void main(String[] args) {
    //1 2 3 4 5... 99 100

    int cnt = 0; //3의 배수의 갯수
    for (int i = 1; i < 101; i++){
      if(i % 3 == 0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
