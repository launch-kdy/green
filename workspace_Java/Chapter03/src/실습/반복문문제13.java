// 13. 1부터 누적해서 합을 구하다 300이 최초로 넘었을 때 for문을 멈추고 그때까지의 합과
//마지막으로 더해진 값을 각각 출력하여라.
package 실습;
public class 반복문문제13 {
  public static void main(String[] args) {

    //1~21 -> 260
    //1~21 + 22 -> 282
    //1~22 + 22 + 23 -> 305

    int i = 1;
    int sum = 0;

    //무한루프
    while(i < 100){
      sum = sum + i;
      //System.out.println("i = " + i + " / sum = " + sum); <참고>
      if(sum > 300){
        System.out.println(sum);
        System.out.println(i);
        break;
      }
      i++;

    }

  }
}
