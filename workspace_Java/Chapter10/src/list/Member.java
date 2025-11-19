package list;

import java.util.List;

public class Member {
  private String id;
  private String pw;
  private String name;
  private int age;

  //생성자
  public Member(String id, String pw, String name, int age) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }

  //(추가로) 만든 생성자
  public Member(){

  }

  public void setId(String id) {
    this.id = id;
  }
  public void setPw(String pw) {
    this.pw = pw;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }

  public String getId() {
    return id;
  }
  public String getPw() {
    return pw;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }

  //toString() 메소드를 오버라이딩하여 구현
  // Alt + Insert + toString
  @Override
  public String toString() {
    return "Member{" +
            "id='" + id + '\'' +
            ", pw='" + pw + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
