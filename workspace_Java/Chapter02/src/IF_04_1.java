import java.util.Scanner;
//1. 문자열 변수를 선언하고 scanner를 사용하여 문자열을 입력받는다. 입력받은 문자열이
//“남” 이라면 ‘남자입니다.’를 출력하고, “여”라면 ‘여자입니다.’를 출력한다. 그 밖의 문자열
//이 들어온다면 ‘다시 입력하세요.’를 출력해야 한다. if문을 사용하여 문제를 풀어보세요.
public class IF_04_1 {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in); -- <키보드 입력을 위해서 필수니까 기억 해둬라>
    Scanner sc = new Scanner(System.in);

    //질문을 적어줘야지 뭘 할 거 아니겠냐
    System.out.println("성별 입력 : ");
    // sc.next(); -- <폼으로 적는 게 아니라, 문자열을 키보드로 입력하라고 쓰는 거다.>
    String gender = sc.next();

    //키보드로 입력받은 문자열이 "남"이라면..
    //equals -- <새로배운 문법이니까 당황하지마라>
    if( gender.equals("남") ){
      System.out.println("남자입니다");
    }
    //키보드로 입력받은 문자열이 "남"이라면..
    else if( gender.equals("여") ){
      System.out.println("여자입니다");
    }

    else{
      System.out.println("다시 입력하세요");
    }



  }
}
