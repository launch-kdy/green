/*
1. 문자열을 저장하는 리스트를 만들고 3개의 데이터를 넣어보자. 그 후 리스트에 저장된 3개의 데이터를 출력
해보라.
*/

package list;

import java.util.ArrayList;
import java.util.List;

public class List19_N1 {
  public static void main(String[] args) {
    List<String> l1 = new ArrayList<>();
    List<String> l2 = new ArrayList<>();
    List<String> l3 = new ArrayList<>();

    l1.add("abc");
    l2.add("bcd");
    l3.add("cde");

    String a = l1.get(0);
    System.out.println(a);

    String b = l2.get(1);
    System.out.println(b);

    String c = l3.get(2);
    System.out.println(c);
  }



}
