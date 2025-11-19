import java.util.Scanner;

// 10. 세 정수를 선언하고 scanner로 값을 입력받는다.
// 그리고 세 수를 큰 순서대로 출력하여보라. (입력받운 세 수는 같은 값이 없다고 가정
public class IF_03_10_TEST {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

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
