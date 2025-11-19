public class Man {
  // 모든 멤버변수의 이름, 나이, 주소를 선언
  String name;
  int age;
  String address;

  public void setMan(String name1, int age1, String address1){
    name = name1;
    age = age1;
    address = address1;
  }

  //변경
  public void setName(String name1){
    name = name1;
  }
  public void setAge(int age1){
    age = age1;
  }
  public void setAddress(String address1){
    address = address1;
  }

  //리턴
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getAddress(){
    return address;
  }

  // 멤버변수의 모든 정보를 출력하는 메소드
  public void printMan(){
    System.out.println(" 이름을 입력하세요 : " + name);
    System.out.println(" 나이을 입력하세요 : " + age);
    System.out.println(" 주소를 입력하세요 : " + address);
  }
}
