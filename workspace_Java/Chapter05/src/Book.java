public class Book {
  String title;
  String writer;
  int price;

  //제목을 변경하는 메서드 -> (set+바꿀거)
  //this. -> 클래스에서 선언된
  //this. -> 메서드 안에서 사용도 가능하긴 함
  public void setTitle(String title){
    this.title = title;
  }

  //책의 모든 정보를 변경하는 메서드
  public void setBook(String title, String writer, int price){
    this.title = title;
    this.writer = writer;
    this.price = price;
  }

  public void printBook(){
    System.out.println("제목 : " + title);
  }

}
