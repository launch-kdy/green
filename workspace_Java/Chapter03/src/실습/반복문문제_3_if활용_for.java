//3. 출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력해 보세요.
package 실습;
public class 반복문문제_3_if활용_for {
  public static void main(String[] args) {

    //2 3 4 5 6 7 8 9 10
    for(int i = 2; i < 11; i++){
      if(i % 2 == 0){
        System.out.println(i);
      }
    }


  }
}
