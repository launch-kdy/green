/*
3. 이름을 저장하는 리스트를 만들고 리스트에 적당히 데이터를 저장한다. 그 후 저장된 이름 중 ‘홍길동’이라는
이름이 있다면 ‘해당 이름이 존재합니다.’라는 문구를 출력하는 프로그램을 만들어라.
*/
package list;

import java.util.ArrayList;
import java.util.List;

public class List19_N3 {
  public static void main(String[] args) {

    //이름을 저장하는 리스트 만들기
    List<String> list = new ArrayList<>();
    //적당히 데이터를 저장
    list.add("김자바");
    list.add("김파이썬");
    list.add("홍길동");
    list.add("김씨플플");

    //저장된 이름 중 "홍길동 이름이 있다면"
    for(int i = 0; i < list.size(); i++) {
      if (list.get(i).equals("홍길동")) {
        //"해당 이름이 존재합니다."라고 출력
        System.out.println("해당 이름이 존재합니다.");
      }
    }


  }
}
