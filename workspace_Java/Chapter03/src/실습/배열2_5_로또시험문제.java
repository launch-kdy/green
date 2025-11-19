//5. 간단한 로또번호 생성기를 만들어보자. 길이가 6인 정수형 배열을 생성하고, 배열의 모든
//요소에 1에서 45까지의 랜덤한 정수를 넣어보자. 그리고 배열의 모든 요소를 출력해보자.(1과
//45를 포함하고, 중복값은 허용한다.)
package 실습;
public class 배열2_5_로또시험문제 {
  public static void main(String[] args) {

    int[] lotto = new int[6];

    for(int i = 0 ; i < lotto.length ; i++){
      //1 ~ 45의 랜덤한 정수 생성

      //0 <= x < 1.0 랜덤한 실수를 반환 + int앞에 적어서 정수화
      int random = (int)(Math.random() * 45 + 1);

      //생성한 정수를 배열에 저장
      lotto[i] = random;
    }

    for(int e : lotto){
      System.out.println(e + " ");
    }

  }
}
