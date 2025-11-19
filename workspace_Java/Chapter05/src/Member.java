public class Member {

  //회원정보로는 이름, 아이디, 비밀번호, 나이 데이터를 가지는 클래스 생성
  String name;
  String id;
  String pw;
  //나이의 경우 연산이 필요하면 int, 굳이 필요없으면 String
  int age;

  //회원의 모든 정보를 변경하는 기능을 가진 메소드 생성
  public void setMemberInfo(String name1, String id1, String pw1, int age1){
    name = name1;
    id = id1;
    pw = pw1;
    age = age1;
  }

  //회원의 모든 정보를 출력하는 메소드
  public void printMemberInfo(){
    System.out.println(" 이름 " + name);
    System.out.println(" 아이디 " + id);
    System.out.println(" 비밀번호 " + pw);
    System.out.println(" 나이 " + age);

  }

}
