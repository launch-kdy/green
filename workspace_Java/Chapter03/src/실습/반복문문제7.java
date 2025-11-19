//7. 1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력해
//보세요.
package 실습;
public class 반복문문제7 {
  public static void main(String[] args) {
      int i = 1;
      int cnt = 0;

      while (i < 101){// ( i 야, 너 5의 배수니 ? )
        if(i % 5 == 0){
          System.out.println(i + " "); //(5의 배수 i들아 잠깐 출력 좀 할게)
          cnt++;
        }
        i++;
      }
    System.out.println();
    System.out.println("5의 배수의 갯수 : " + cnt);


  }
}
