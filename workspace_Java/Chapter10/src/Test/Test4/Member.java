package Test.Test4;

  // Member 클래스 요구사항 (2) : 매개변수로 전달된 데이터로 모든 맴버변수의 값을 변경하는 기능
  // Member 클래스 요구사항 (3) : void showInfo() : 모든 맴버변수의 값을 출력하는 기능
  // Member 클래스 요구사항 (2) : boolean isLogin(String id, String pw) : 로그인이 가능할 경우에만 true를 리턴
public class Member {
  // Member 클래스 요구사항 (1) : Member 클래스는 회원의 아이디, 패스워드, 이름, 나이 데이터를 갖는다.
  private String id;
  private String pw;
  private String name;
  private int age;

  //매개변수로 전달된 데이터로 모든 멤버변수의 값을 변경하는 기능
    public void setInfo(String id, String pw, String name, int age){
      this.id = id;
      this.pw = pw;
      this.name = name;
      this.age = age;
    }

    public void showInfo(){
      System.out.println("id: " + id);
      System.out.println("pw: " + pw);
      System.out.println("name: " + name);
      System.out.println("age: " + age);
    }

    //로그인 : 내가 가진 id,pw을 입력한 id,pw와 비교
    //로그인이 가능할 경우에만 true를 리턴
    //id에는 java pw에는 1234가 들어오면 리턴 true
    public boolean isLogin(String id, String pw) {
    //이 클래스에 들어온 아이디와 pw가 = 매개변수로 들어온 아이디가 같은지
      if (this.id.equals(id) && this.pw.equals(pw)){
        return true;
      }
      else {
        return false;
      }
    }
  }
