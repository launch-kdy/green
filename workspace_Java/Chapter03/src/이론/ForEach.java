package 이론;

import javax.swing.*;

//For~each 문은 배열의 모든내용을 반복할 땨 아주 많이 사용 문자
//For~each는 또 다른 for 문이다
public class ForEach {
  public static void main(String[] args) {
    double[] arr1 = {1.1, 2.2, 3.3};

    for (int i = 0 ; i < arr1.length ; i++){
      System.out.println(arr1[i]);
    }

    //for( (좌) 하나씩 까낸 데이터를 저장할 변수 : (우) 반복 돌릴 배열)
    for(double e : arr1){
      System.out.println(e);
    }

    String[] arr2 = {"홍길동", "이순신"};

    for(String e : arr2){
      System.out.println(e);
    }



  }
}
