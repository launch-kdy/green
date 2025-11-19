/*
4. 리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
그 후 저장된 데이터 중 짝수의 개수와 모든 짝수를 출력하는 프로그램을 만드세요.
(Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴)
*/
package list;

import java.util.ArrayList;
import java.util.List;

public class List19_N4 {
  public static void main(String[] args) {
    //정수를 저장 할 수 있는 리스트 생성
    List<Integer> list = new ArrayList<>();

    //1~100까지 랜덤한 정수를 -> ' 10번 ' 리스트에 저장
    for(int i = 0; i < 10 ; i++){
      // 1.0 <= x < 101.0 실수
      int num = (int)(Math.random() * 100 + 1);
      list.add(num);
    }

    //리스트에 10개의 랜덤 정수가 잘 들어갔는지 출력으로 확인
    for(int a : list){
      System.out.print(a + " ");
    }

    System.out.println();
    //짝수의 갯수와 모든 짝수를 출력
    int cnt = 0;
    for(int i = 0; i < list.size() ; i++){
      if(list.get(i) % 2 == 0){
        cnt++;
        System.out.print(list.get(i) + " "); //하나 출력할 때마다 1줄 개행
      }
    }
    System.out.println();
    System.out.println("짝수의 개수 : " + cnt);

  }
}
