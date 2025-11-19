public class MemberService {
  //매개값 id 가 hong 매개값 password가 12345일 경우에만 true 리턴
  public boolean login(String id, String password){
    return id.equals("hong") && password.equals("12345") ? true : false;
    //return id.equals("hong") && password.equals("12345") ;
  }

  //로그아웃 되었습니다가 출력되도록 하세요
  public void logout(String id){
    System.out.println("로그아웃 되었습니다.");
  }

}
