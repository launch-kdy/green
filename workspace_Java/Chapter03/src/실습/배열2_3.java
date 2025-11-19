// 3. 1,2,3을 초기값으로 갖는 배열 arr1과 4,5,6을 초기값으로 갖는 arr2를 만든다. 그 후 새
//로운 배열 newArr을 만들어 arr1과 arr2의 모든 값을 복사해보자. 복사 후 newArr은
//1,2,3,4,5,6을 가져야 한다.
package 실습;
public class 배열2_3 {
  public static void main(String[] args) {

    int[] arr1 = {1, 2, 3};

    int[] arr2 = {4, 5, 6};

    // [6]으로 갯수만 고정시키는 것보다, length 를 활용하여 범위 만들도록 지향
    int[] newArr = new int[arr1.length + arr2.length] ;
    //arr1 배열의 크기(길이)만큼 반복해서 newArr에 데이터를 저장
    for(int i = 0 ; i < arr1.length ; i++){
      newArr[i] = arr1[i];
    }

    //arr2 배열의 크기(길이)만큼 반복해서 newArr에 데이터를 저장
    for(int i = 0 ; i < arr2.length ; i++){
      newArr[i + arr1.length] = arr2[i];
    }

    //newArr 데이터 학인
    for (int a : newArr){
      System.out.println(a + "");
    }

  }
}
