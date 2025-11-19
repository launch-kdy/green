import java.io.PrintStream;
import java.sql.SQLOutput;

public class Phone {
  String modelName;
  int price;
  String os;

  //폰의 모델명을 변경하는 기능
  public void setModelName(String newModelName){
    modelName = newModelName;
  }

  //폰의 가격을 변경하는 기능
  public void setPrice(int newPrice){
    price = newPrice;
  }


  //폰의 os를 변경하는 기능
  public void stetOs(String newOs){
    os = newOs;
  }

  //모델명 가격 모두 변경
  public void setPhoneInfo(String newModelName, int newPrice, String newOs){
    modelName = newModelName;
    price = newPrice;
    os = newOs;
  }

  //폰의 모델명, 가격 os 정보를 출력하는 기능
  public void printPhoneInfo(){
    System.out.println("모델명 : " + modelName);
    System.out.println("모델명 : " + price);
    System.out.println("모델명 : " + os);
  }

}
