import java.awt.*;

public class Computer {
  //멤버변수 생성
  String brand;
  int price;

  //this.생성자
  public Computer(String brand, int price){
    this.brand = brand;
    this.price = price;
  }

  //새로운 출력 메서드 생성하여 출력하기 왜냐,
  //위에 메서드는 private로 락이 걸려서, Test에서는 안 불러와짐
  public void display(){
    System.out.println("브랜드 : " + brand);
    System.out.println("가격 : " + price);
  }

}