import java.util.Arrays;

public class Song {

  //노래정보로 제목, 가수, 앨범, 연도, 작곡가를 가지는 클래스 생성
  String title;
  String artist;
  String album;
  int year;
  String[] composer;

  //모든 필드의 값을 변경하는 메서드
  public void setSong(String title1, String artist1, String album1, int year1, String[] composer1){
    title = title1;
    artist = artist1;
    album = album1;
    year = year1;
    composer = composer1;
  }

  //모든 정보를 출력하는 메소드 생성
  public void printsetSong(){
    System.out.println(" 제목을 입력하세요 : " + title);
    System.out.println(" 가수를 입력하세요 : " + artist);
    System.out.println(" 앨범을 입력하세요 : " + album);
    System.out.println(" 연도를 입력하세요 : " + year);
    System.out.println(" 작곡가를 입력하세요 : " + Arrays.toString(composer));
  }

}
