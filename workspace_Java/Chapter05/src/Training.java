  //멤버변수랑, getter, setter, 출력은 필요에 따라 만드는 것
  //즉, 꼭 다 필요한 것은 아님.
  //예를 들면 setter는 존재하나, getter가 필요없으면 안 적어도 됨.

public class Training {
  // < 1. 멤버변수 생성 >
  //상품명, 상품코드, 사이즈, 가격
  private String name;
  private String code;
  private int size;
  private int price;

  // < 멤버변수 모든값을 변경 >
  // set (모든값을) 변경하는 메소드

  // [! ! 아주중요 ! !] "메소드명"은 소문자부터 입력해야 인식 됨" [! ! 아주중요 ! !]
  //
  public void setItems(String name, String code, int size, int price){
    this.name = name;
    this.code = code;
    this.size = size;
    this.price = price;
  }

  // < 멤버변수 각각의 값을 변경 >
  // setter (각각의 값을) 변경하는 메소드
  public void setName(String red){
    this.name = red;
  }
  public void setCode(String yellow){
    this.code = yellow;
  }
  public void setSize(int green){
    this.size = green;
  }
  public void setPrice(int blue){
    this.price = blue;
  }

  // <4. 멤버변수 각각의 값을 리턴하는 메소드>
  // getter
  public String GetName(String aa){
    return aa;
  }
  public String getCode(String bb){
    return bb;
  }
  public int getSize(int cc){
    return cc;
  }
  public int getPrice(int dd){
    return dd;
  }

  // <5. 모든 필드의 값을 출력하는 메소드>
  // 이번에는 "displayInfo()" 이름으로 생성한다.
  public void displayInfo(){
    System.out.println("상품명 : " + name);
    System.out.println("상품코드 : " + code);
    System.out.println("사이즈 : " + size);
    System.out.println("가격 : " + price);
  }
}
