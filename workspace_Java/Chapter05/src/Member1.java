public class Member1 {
  // * 기본 생성자 생성
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  // 앞에 private 잘 붙여라 private 무조건 붙여라 private 잘 좀 붙여라 private 제발 붙여라
  private String name;
  private String id;
  private String pw;

  // 매개변수가 없는 기본 생성자 v1
  public Member1(){
    this.name = null;
    this.id = null;
    this.pw = null;
  }

  //모든 필드 데이터를 변경할 수 있는 생성자 v2
  public Member1(String name, String id, String pw) {
    this.name = name;
    this.id = id;
    this.pw = pw;
  }

  //setter
  public void setName(String name){
    this.name = name;
  }
  public void setId(String id){
    this.id = id;
  }
  public void setPw(String pw){
    this.pw = pw;
  }

  //getter
  public String getName(String name){
    return name;
  }
  public String getId(String id) {
    return id;
  }
  public String getPw(String pw) {
    return pw;
  }

  //모든 필드의 값을 출력하는 displayInfo() 메소드 생성
  public void displayInfo(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("패스워드 : " + pw);
  }


}
