//게시글 하나의 정보를 지정하는 자료형
//게시글 하나 - 글번호, 제목, 작성자, 조회수
public class Board {
  private int boardNum;
  private String title;
  private String writer;
  private int readCnt;

  public Board(int boardNum, String title, String writer, int readCnt) {
    this.boardNum = boardNum;
    this.title = title;
    this.writer = writer;
    this.readCnt = readCnt;
  }




  //setter
  public void setBoardNum(int boardNum) {
    this.boardNum = boardNum;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  public void setReadCnt(int readCnt) {
    this.readCnt = readCnt;
  }

  //getter
  public int getBoardNum() {
    return boardNum;
  }
  public String getTitle() {
    return title;
  }
  public String getWriter() {
    return writer;
  }
  public int getReadCnt() {
    return readCnt;
  }

  //출력문
  public void display(){
    System.out.println("글번호 : " + boardNum);
    System.out.println("제목 : " + title);
    System.out.println("작성자 : " + writer);
    System.out.println("조회수 : " + readCnt);
  }

}
