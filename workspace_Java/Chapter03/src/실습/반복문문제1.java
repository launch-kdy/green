//1. System.out.print(“*”);을 사용하여 별을 다섯 개 출력해보자. 단 출력문은 한번만 사용해
//야 한다.
package 실습;
public class 반복문문제1 {
  public static void main(String[] args) {
      int i = 0; // i -> index(목차,순서)

      while( i < 5 ){
        System.out.println('*');
        i++;
      }
      //----------------------------------------------------------------------//

      for(int f = 0; f < 5; f++){
        System.out.println('*');
      }

  }
}
