package Test;

//생성자 this()
public class Hamburger {
      // ---------- (선언)  ---------- //
      //햄버거 레시피에는 (자료형 + 자료명 + (자료명)구체적정보)
      //가 들어가야 맛있는 레시피가 완성된다.

      //(1) 햄버거의 자료형과 자료명을 적는다
      String brand;
      String patty;
      int topping;

      //(2 - '기본생성자' ) 자료명의 구체적 정보를 적는다
/*      Hamburger(){
          brand = "lotteria";
          patty = "shirimp";
          topping = 3;
      }*/

      //(3 - '매개변수가 있는 생성자' )
      // " brand patty topping 자료명 긴 거 언제 다 적을래 ? "
      // -> 이니셜화 ex) ' brand = b; '
/*      Hamburger(String b, String p, int t){
          brand = b;
          patty = p;
          topping = t;
      }*/

      //(4 - 'this() 를 활용' )
      Hamburger(){
        this("Lotteria", "shirimp", 3);
      }

      Hamburger(String b, String p, int t){
        brand = b;
        patty = p;
        topping = t;
      }
      // ---------- (선언)  ---------- //


  }
