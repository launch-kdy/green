package list;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
  public static void main(String[] args) {

    //memberList (리스트)생성
    List<Member> memberList = new ArrayList<>();

    //Member 클래스에 대한 (객체)생성
    Member m1 = new Member();// < 1번째 방법 >
    m1.setId("hong");
    m1.setName("홍");
    m1.setPw("1234");
    m1.setAge(20);

    Member m2 = new Member("Kim", "1234", "김", 30); // < 2번째 방법 >
    Member m3 = new Member("Lee", "1111", "이", 40); //

    //Member 객체를 (저장)
    memberList.add(m1);
    memberList.add(m2);
    memberList.add(m3);

    //6번
    //저장된 객체의 정보를 출력
    for (int i = 0; i < memberList.size() ; i++) {
      System.out.println(memberList.get(i).toString());//"toString"메소드는 자신이 가진 해당 경로값을 리턴
    }
    System.out.println(); //한줄개행

    //7번
    //회원의 나이 합 출력
    int ageSum = 0; //합 구할 때는 변수 sum = 0 부터 생성
    for (int i = 0; i < memberList.size() ; i++) {
      ageSum = ageSum + memberList.get(i).getAge(); //sum = sum + 1 활용
    }
    System.out.println("나이의 합 : " + ageSum);
    System.out.println();

    //8번
    //List에 저장된 회원 중 id가 java인 회원을 지우는 코드를 작성
    // = id가 java인 회원이 저장된 index를 구해야 함
    int index = 0;
    for (int i = 0; i < memberList.size(); i++) {
      //id가 java인 회원 발견
      if(memberList.get(i).getId().equals("java")){
        //회원의 인덱스는 i 이다. 그러므로 위에 int index = 0;을 적어주기
        index = i;
      }
    }
    //반복문을 벗어난 후, 삭제까지 해주기
    memberList.remove(index);

  }
}
