//3. 출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력해 보세요.
package 실습;
public class 반복문문제3_if활용 {
  public static void main(String[] args) {
    // 2 3 4 5 6 7 8 9 10

    int i = 2;

    while (i < 11){
      // (조건문) 'i가 짝수일때 출력한다.'
      if(i % 2 == 0){
        System.out.println(i);
      }
      i++;
    }


  }
}
