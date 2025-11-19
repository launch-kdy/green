package Test;

import java.util.Scanner;

public class Test3 {
    // 3. 1 ~ 999까지의 수 중 임의의 숫자를 Scanner를 통해 입력 받아,
    // 입력받은 숫자의 369게임 결과를 출력하는 프로그램을 만드시오.
    // 만약 박수가 없는 숫자라면 ‘박수 0번’, 박수 한 번이라면 ‘박수 1번’,
    // 박수 두 번이라면 ‘박수 2번’, 박수가 3번이면 ‘박수 3번’이라는 문자열을 출력하면 된다.
    // 단, 키보드로 숫자를 입력받을 때 1 ~ 999까지 숫자 이외의 데이터는 입력받지 않는다고 가정한다.
    // (클래스명 : Test3.java)

    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);

        System.out.print("1 ~ 999까지 의 수 중 임의의 숫자를 입력하세요 : ");
        int num = game.nextInt();

        //100의 자리를 100으로 나누었을 때 몫 : 3 6 9
        int num1 = num / 100;
        //10의 자리를 10으로 나누었을 때 몫 : 3 6 9
        int num2 = num / 10;
        int num3 = num2 % 10;
        //1의 자리를 3으로 나누었을 때 나머지 :
        int num4 = num % 10;

        //초기값을 0번으로 시작해서 -> if절에 만족하면 + 1번 해주면된다.
        int cnt = 0;

        if(num1 == 3 || num1 ==  6 || num1 == 9 ){
            cnt = cnt + 1;
        }
        if(num3 == 3 || num3 ==  6 || num3 == 9 ) {
            cnt = cnt + 1;
        }
        if(num4 == 3 || num4 ==  6 || num4 == 9 ) {
            cnt = cnt + 1;
        }


        System.out.println(cnt + "번");

    }
}
