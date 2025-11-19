package Test;

import java.util.Scanner;

public class Test1 {
    // 1. 세 정수를 Scanner로 입력받아 큰 수부터 나열하여 출력하는 프로그램을 작성하시오.
    // 단 입력받는 세 수는 중복값이 없다고 가정한다. (클래스명 : Test1.java)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //- 출력예시
        //첫번째 수 : 10
        //두번째 수 : 30
        //세 번째 수 : 20
        //30 > 20 > 10

        System.out.print("첫번째 수 :");
        int a = sc.nextInt();
        System.out.print("두번째 수 :");
        int b = sc.nextInt();
        System.out.print("세번째 수 :");
        int c = sc.nextInt();

        int min, mid, max;

        //min, mid, max 변수에 값 저장하기

        //a가 가장 큰 경우
        if(a > b && a > c) {
            max = a;
            //b가 c보다 큰 경우
            if(b > c) {
                mid = b;
                min = c;
            }
            //그렇지 않은 경우
            else {
                mid = c;
                min = b;
            }
        }
        //b가 가장 큰 경우
        else if(b > a && b > c) {
            max = b;
            if (a > c) {
                mid = a;
                min = c;
            }
            else{
                mid = c;
                min = a;
            }
        }
        //그렇지 않으면 (c가 가장 큰 경우)
        else{
            max = c;
            if(a > b){
                mid = a;
                min = b;
            }
            else{
                mid = b;
                min = a;
            }
        }
        //결과출력
        System.out.println(max + ">" + mid + ">" + min);
    }
}


