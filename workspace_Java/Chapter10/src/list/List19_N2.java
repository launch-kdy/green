/*
2. 정수를 저장할 수 있는 리스트를 만들고 5개의 정수를 scanner를 통해 입력받아 리스트에 저장한다. 리스
트에 저장된 모든 데이터의 합을 출력하여라.
*/

package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List19_N2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> l1 = new ArrayList<>();

    //scanner 사용해서 입력받은 데이터를 list에 지정
    for(int i = 0; i < 5 ; i++){
      System.out.println("정수를 입력하세요 : ");
      int num = sc.nextInt();
      l1.add(num);
    }

    //list에 저장된 모든 데이터를 출력
    for(int a : l1){
      System.out.println(a);
    }

    //list에 저장된 모든 데이터의 합을 출력
    int sum = 0;
    for(int a : l1){
      sum = sum + a;
    }
    System.out.println(sum);


  }
}
