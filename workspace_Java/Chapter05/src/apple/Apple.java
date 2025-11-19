package apple;

//접근제한자 : 변수나 메소드의 사용범위를 지정하는 문법
//종류 : private < default < protected < public
//public : '같은 프로젝트' 내의 모든 곳에서 사용 가능
//default : '같은 패키지' 내에서만 접근 가능
//private : '변수 메소드를 선언한 클래스' 내에서만 접근가능

// *멤버변수는 무조건 private 붙이기 !
// *메소드는 무조건 public 사용 !
// *지역변수에는 '접근제한자' 사용 못 함 !
// *클래스에는 private 사용 못 함 !

public class Apple {
  int newInt;
  public String name;
  private int price;
  double avg; //(default) double avg;

  public Apple(){

  }


  public void setPrice(int price){
    this.price = price < 0 ? 0 : price;
  }

  public void aaa(){
    price = 10;
  }
  private void bbb(){}
  void ccc(){}
}

