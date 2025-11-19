//7. 정수 10개를 담을 수 있는 배열을 생성하고, Math.random()함수를 사용하여 1 ~ 100의
//정수를 배열 각 요소에 저장하자. 배열에 저장된 모든 정수 및 최소값, 최대값을 출력해보라.
// (Math.random() 메소드는 0 <= x < 1 사이의 실수를 리턴한다.)
package 실습;
public class 배열2_7 {
  public static void main(String[] args) {
    int[] arr = new int[10];

    //배열의 크기만큼 1~100사이의 랜덤한 정수를 반복해서 저장
    for (int i = 0; i < arr.length; i++) {
      // 0.0 <= x , 1.0 랜덤 실수 반환
      int num = (int) (Math.random() * 100 + 1);
      arr[i] = num;
    }

    //랜덤 데이터 저장 확인
    for (int e : arr) {
      System.out.print(e + " ");
    }
    System.out.println();

    //배열의 가장 큰값을 지정할 변수
    int max = arr[0];
    //배열의 가장 작은 값을 지정할 변수
    int min = arr[0];

    //max 값 구하기
    for (int i = 0; i < arr.length; i++) {
      if(max < arr[i]){
        max = arr[i];
      }
    }

    //min 값 구하기
    for (int i = 0; i < arr.length; i++) {
      if(min > arr[i]){
        min = arr[i];
      }
    }

    System.out.println("최대값 : " + max);
    System.out.println("최솟값 : " + min);


  }
}