public class Rectangle {
  private int x1;
  private int y1;
  private int x2;
  private int y2;

  //디폴트 생성자
  public Rectangle(){}

  //x1, y1, x2, y2의 값을 설정하는 생성자
  public Rectangle(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  //void set(int x1, int y1, int x2, int y2)
  //:x1,y1,x2,y2 좌표설정
  public void set(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  //사각형의 넓이 리턴
  public int square(){
    return (x2 - x1)*(y2 - y1);
  }
  //좌표와 넓이 등 직사각형 정보의 화면 출력
  public void show(){
    System.out.println("좌표 : " + x1 + "," + y1 + " / " + x2 + "," + y2);
    System.out.println("넓이 : " + square());
  }

  //*인자란 : "매개변수에 전달된 객체 00"
  //인자로 전달된 객체 r과 현 객체의
  //넓이가 같으면 리턴 true
  public boolean equals(Rectangle r){
    return square() == r.square();
  }

}
