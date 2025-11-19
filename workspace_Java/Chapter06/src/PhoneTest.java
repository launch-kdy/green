public class PhoneTest {
  public static void main(String[] args) {
    //다형성 : 객체의 형태가 다양하다
    //장점 : 서로 다른 클래스 자료형을 일괄적으로 관리
    //단점 : 자식클래스의 메서드 사용 못함. 부모클래스의 메서드만 사용가눙


    //객체 생성방법을 다양하게 가질 수 있다.
    //부모클래스는 자식객체를 전부 받아들인다.
    //자식클래스는 부모객체를 못 받는다.

    MobilePhone m = new MobilePhone();
    SmartPhone p = new SmartPhone();

    /// 모바일폰 주세요 -> 스마트폰을 전달해준다
    // m1 객체는 스마트폰 객체다
    // 단, 현재는 모바일폰 객체로 인식하고 있기 때문애
    // 모바일 폰 클래스에 정의한 메서드, 멤버변수만 사용 가능
    MobilePhone m1 = new SmartPhone();

    //형변환을 통해 모바일폰 객체를 스마트폰 객체로 변환 가능
    SmartPhone pp = (SmartPhone)m1;
    pp.playApp();

    //모바일폰 객체를 강제로 스마트폰 객체로 형 변환 할 수는 없다.
    //실행전 빨간줄(빨간글자)로 알려주는 오류 : 컴파일오류
    //빨간줄이 생기지 않지만 실행시 발생하는 오류 : 런타임오류
    MobilePhone m2 = new MobilePhone();
    SmartPhone p3 = (SmartPhone)m2;
    p3.playApp();


    //스마트폰 주세요 -> 모바일폰을 전달해준다. X
    //SmartPhone p1 = new MobilePhone(); 오류발생

  }
}
