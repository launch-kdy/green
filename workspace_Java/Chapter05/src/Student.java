//멤버변수 '각각'의 값을 변경하는 메서드 -> settetr '쎄터' 라고 부름 정식명칭
//settetr '쎄터'는 메서드명이 정해져 있음. (set + 대문자 변수명)으로 메서드명 정해져있음!

//멤버변수 '각각'의 값을 리턴하는 메서드 -> gettetr '게터' 라고 부름 정식명칭
//gettetr '게터'도 메서드명이 정해져 있음. (get + 대문자 변수명)으로 메서드명 정해져있음!

public class Student {
  String name;
  int age;
  String addr;
  String stuNum;
  String tel;

  //모든 멤버변수의 값을 변경하는 메서드
  public void setStudent(String name, int age, String addr, String stuNum, String tel){
    this.name = name;
    this.age = age;
    this.addr = addr;
    this.stuNum = stuNum;
    this.tel = tel;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String getStuNum() {
    return stuNum;
  }

  public void setStuNum(String stuNum) {
    this.stuNum = stuNum;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }
}
