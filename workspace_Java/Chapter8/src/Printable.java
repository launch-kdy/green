//인터페이스 = 사용자 정의 자료형이다.
//인터페이스의 구성요소 : [ (추상) '메소드'만 존재 ].cf 클래스 멤버변수 X 생성자 X
//추상메소드 : 내용부가 없는 메소드
public interface Printable {
  // ex) '흑백 프린터 출력'
  public void blackPrint();

  // ex) '컬러 프린터 출력'
  public void colorPrint();


}
