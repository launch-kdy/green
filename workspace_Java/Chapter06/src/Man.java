import javax.lang.model.element.Name;

//첫번째 클래스
public class Man {
  String name;

  public Man(){

  }

  public Man(String man){

  }

  public void tellName(){
    System.out.println("Name is " + name);
  }
}


//'해당클래스'는 Man 클래스를 상속한다.(=받는다) - extends + 받을 클래스 -
//상속하는 클래스의 멤버변수와 메소드를 상속받게 됨
// -> 멤버변수와 메소드를 내것처럼 사용 가능

//상속관계에 있는 자식클래스의 객체를 생성할 때,
//내부적으로 부모 클래스의 객체도 동시에 생성한다.
//부모 클래스의 객체를 생성할 때도 생성자를 호출해서 객체를 만든다.
//이때, 호출돠는 생성자는 '매개변수가 없는 생성자'를 호출한다.

//그리고 이렇게 부모클래스의 기본 생성자를 호출하는 문법은
//숨겨져 있다 = 생략되어있다.
//그럼, 생략되어 있는 부모클래스의 생성자 문법은 어디 숨겨져 있냐면,
//자식 클래스의 생성자 첫줄에 super();라는 키워드로 생략되어 있다.

class BusinessMan extends Man{
  String company;

  //초기화
  public BusinessMan(String company){
    //spuer(); // - 숨겨져있는 부모클래스의 생성자 호출 문법
    this.company = company;
  }

  public void tellCompany(){
    System.out.println("Company is " + company);
  }
}
