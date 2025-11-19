public class Board_Test {
  //게시글을 5개 생성
  //생성한 5개 게시글을 배열에 저장!
  public static void main(String[] args) {
    Board b1 = new Board(1, "게시글", "김자바", 5);
    Board b2 = new Board(1, "게시글", "이자바", 0);
    Board b3 = new Board(1, "게시글", "박자바", 1);
    Board b4 = new Board(1, "게시글", "윤자바", 10);
    Board b5 = new Board(1, "게시글", "권자바", 7);

    Board[] boards = new Board[5];
    boards[1] = b1;
    boards[2] = b2;
    boards[3] = b3;
    boards[4] = b4;
    boards[5] = b5;

    //1.배열에 저장된 모든 게시글의 글번호, 제목, 작성자, 조회수를
    //  for문으로 출력
    for(int i = 0 ; i < boards.length ; i++){
      boards[i].display();
    }


    //2.배열에 저장된 게시글 중 작성자가 '김자바'인 게시글의
    //  모든 정보를 for-each문으로 출력
    for(Board a : boards){
      if(a.getWriter().equals("김자바")){
        a.display();
      }
    }
    System.out.println();
    //3.배열에 저장된 게시글 중 조회수가 2이상의 게시글의 제목만
    //  for문으로 출력
    for(int i = 0; i < boards.length; i++){
      if(boards[i].getReadCnt() >= 2 ){
        System.out.println(boards[i].getTitle());
      }
    }
    System.out.println();
    //4.배열에 저장된 모든 게시글의 조회수 총합을 출력
    //  for-each문으로 출력
    int sum = 0;
    for(Board b : boards){
      b.getReadCnt();
      sum = sum + b.getReadCnt();
    }
    System.out.println(sum);
    //5.배열에 저장된 게시글 중 조회수가 홀수인 게시글의 갯수를
    //  for문으로 출력
    int cnt = 0;
    for(int i = 0 ; i < boards.length ; i++){
      if(boards[i].getReadCnt() % 2 == 1){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
