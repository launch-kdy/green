package list;

import java.util.ArrayList;
import java.util.List;

public class List_3 {
  public static void main(String[] args) {
    //Fruit f = new Fruit("오렌지", "제주도", 1000);
    //System.out.println(f.toString());
    //System.out.println(f); //객체명을 출력해도 알아서 나옴

    //Fruit 객체를 다수 저장 할 수 있는 '리스트' 를 생성
    List<Fruit> fruitList = new ArrayList<>();

    //<객체 생성 & 리스트에 객체 지정
    //Fruit f1 = new Fruit("바나나", "베트남", 1000);

    fruitList.add(new Fruit("바나나", "베트남", 1000));
    fruitList.add(new Fruit("사과", "한국", 2000));
    fruitList.add(new Fruit("사과", "한국", 3000));
    fruitList.add(new Fruit("망고", "태국", 4000));
    fruitList.add(new Fruit("파인애플", "베트남", 1000));

    //[문제 1] fruit.list에 저장된 모든 과일의 이름 원산지 가격을 출력하는 (코드를 생성)
    for (int i = 0; i < fruitList.size() ; i++){
      System.out.println(fruitList.get(i));
    }

    //[문제 2] fruit.list에 저장된 모든 과일의 이름 원산지 가격을 출력하는 (for-each코드를 생성)
    for(Fruit a : fruitList){
      System.out.println(a.toString());
    }


  }
}
