package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    //크기가 3인 배열에 1 ~ 9 까지의 랜덤한 수를 중복없이 저장
    //크기가 3인 정수형 배열 생성, 모든 요소는 0으로 초기화
    int[] arr = new int[3];

    //마지막) 정답을 저장할 배열
    int[] answer = new int[3];
    // 키보드 입력을 위한 scanner 생성
    Scanner sc = new Scanner(System.in);

    //반복적으로 배열에 랜덤 정수 저장
    for (int i = 0; i < arr.length ; i++) {
      arr[i] = (int)(Math.random() * 9 + 1);

      //중복검사
      for (int j = 0; j < i ; j++) {
        //만약에 중복이라면
        if(arr[i] == arr[j]){
          //중복된 데이터가 발생하면 데이터에 다시 넣는다
        }
      }
    }

    //배열완성확인 (for문 안 쓰고 .tostring())
    System.out.println(Arrays.toString(arr));

    System.out.println("게임을 시작합니다");

    //키보드로 입력한 값을 answer 배열에 저장

      int tryCnt = 0; //시도횟수
      //정답을 맞출 때 까지 게임은 끝나지 않는다
      while(true){
        //tryCnt++; //시도횟수 1증가

        //정답입력
        System.out.print(++tryCnt + " >> ");
        answer[0] = sc.nextInt();
        answer[1] = sc.nextInt();
        answer[2] = sc.nextInt();

        //arr배열과 answer 배열과 비교하여 s,b 갯수 확인
        int strike = 0; //스트라이크 갯수를 저장할 변수
        int ball = 0; //볼 갯수를 저장할 변수

        //arr에 저장된 데이터의 수만큼 반복
        for (int i = 0; i < arr.length ; i++) {
          for (int j = 0; j < answer.length ; j++) {
            //두 배열의 수가 같으면
            if(arr[i] == answer[i]){
              //위치도 같은가 ?
              if(i == i);
              else {
                ball++;
              }
            }
          }
        }

          //계산한 결과 출력
          System.out.println(strike + "S " + ball + "B");

          //3S 이면 게임을 종료한다
          if (strike == 3) {
            System.out.println(tryCnt + "만에 성공");
            break;
          }
        }

      }
    }
