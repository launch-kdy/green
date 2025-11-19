// 회원 조회 프로그램을 만들어보자.//

//( ** 연습 정보보관소 ** )

// 회원의 정보는
// * 아이디 * 비밀번호 * 닉네임
// * 연령 * 구독플랜 * 거주국가

public class Review {

  // 1. 자료형 생성
  private String id;
  private String password;
  private String nickname;
  private int age;
  private String subscribe;
  private String country;

  public Review(String id, String password, String nickname, int age, String subscribe, String country){
    this.id = id;
    this.password = password;
    this.nickname = nickname;
    this.age = age;
    this.subscribe = subscribe;
    this.country = country;
  }

  // 2. setter 값 입력
  public void setId(String id){this.id = id;}
  public void setPassword(String password){this.password = password;}
  public void setNickname(String nickname){this.nickname = nickname;}
  public void setAge(int age){this.age = age;}
  public void setSubscribe(String subscribe){this.subscribe = subscribe;}
  public void setCountry(String country){this.country = country;}


  // 3. getter 값 입력
  public String getId(){return id;}
  public String getPassword(){return password;}
  public String getNickname(){return nickname;}
  public int getAge(){return age;}
  public String getSubscribe(){return subscribe;}
  public String getCountry(){return country;}

  // 4. 출력생성
  public void display(){
    System.out.println("ID : " + id);
    System.out.println("비밀번호 : " + password);
    System.out.println("닉네임 : " + nickname);
    System.out.println("연령 : " + age);
    System.out.println("구독플랜 : " + subscribe);
    System.out.println("거주국가 : " + country);
  }
}
