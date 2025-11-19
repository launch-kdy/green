package list;

import java.util.HashSet;
import java.util.TreeSet;

public class Set_1 {
  public static void main(String[] args) {
    //set = 다수의 문자열을 자장할 통 + 순서 X 중복데이터 저장 X
    TreeSet<String> set = new TreeSet<>();
    set.add("java");
    set.add("python");
    set.add("c++");
    set.add("c++"); // '중복데이터 c++'은  오류는 안 나지만 그냥 무시해버림

    System.out.println(set.size()); // '중복데이터 c++'은  오류는 안 나지만 그냥 무시해버림

    for(String e : set){            // 순번개념이 없어, 지마음대로 나옴
      System.out.println(e);
    }

  }
}
