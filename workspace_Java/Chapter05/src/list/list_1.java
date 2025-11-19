package list;

import java.util.ArrayList;
import java.util.List;

public class list_1 {
  public static void main(String[] args) {
    //List : 순번이 존재하고, 중복 데이터를 저장할 수 있는 통
    //List에는 기본 자료형 사용 못 함
    //기본자료형 대신 Wrapper 클래스를 사용한다
    //Wrapper 클래스 : '기본 자료형' -> '클래스 형태' 로 변환시킨것.

    // * [int] * Integer
    // * [char] * Character
    //double -> Double
    //float -> Float
    //long -> Long
    //short -> Short
    //boolean -> Boolean
    //byte -> Byte


    //List 생성, '문자열'을 여러개 저장할 수 있는 통, 크기는 저장된 데이터만큼을 알아서 변경
    List<String> list = new ArrayList<>();

    //list에 데이터를 저장하는 메서드
    list.add("java");
    list.add("c++");
    list.add("python");

    //list에 데이터를 빼는 메서드 - 얘는 순번 접근
    list.get(0);


    //List 생성, '정수 - Integer'를 여러개 저장할 수 있는 List 통
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);

    //List 생성, '실수 - Dounle'를 여러개 저장할 수 있는 List 통
    List<Double> list2 = new ArrayList<>();
    list2.add(0.1);
    list2.add(0.2);
    list2.add(0.3);
  }

}
