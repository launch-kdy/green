import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

//public class 심화문제_메서드 {
  //public static void main(String[] args) {

    //test1(3);

    //5번
    //바로 넣지 말고, 데이터를 생성하고 넣아야만 한다.
    //int[] aaa = {1, 2, 3};
    //printArray(aaa);

    //6번
    //int[] arr = {10, 1, 2, 3};
    //int result1 = test6(arr);
    //System.out.println(result1);

    //7번
    //String[] arr = {"ad", "bc", "ce", "dd"};
    //String result = test7(arr);
    //System.out.println(result);

    //8번
    //int[] arr1 = {1, 2, 3};
    //int[] arr2 = {2, 3, 4};
    //int[] result = test8(arr1, arr2);
    //반복문 안 쓰고 출력하는 방법
    //System.out.println( Arrays.toString(result));

    //9번
    //int[] arr = {1, 5, 3, 2, 7 ,10 ,8};
    //test9(arr); test9(arr);
    //System.out.println( Arrays.toString(resultArr) );
  //}

  //1번
  // 정수 하나룰 매개변수로 받아 두 정수의 곱을 리턴하는 메소드를 선언하고
  //호출하여 결과를 확인해보세요.
  //public static void test1(int num){
  //  for(int i = 1 ; i < 10 ; i++){
  //    System.out.println(num + " * " + i + " = " + num * i);
  //  }
  //}

  // 5번
  // 정수형 배열을 매개변수로 받아
  // 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.
  //public static void printArray(int[] a) {
  // 여기서'a'는 위에 있는 aaa 가 가지고 있는 1 2 3 4 5 그대로 가지게 된다고 함
  //  for(int i = 0; i < a.length; i++) {
  //    System.out.println(a[i]);
  //  }
  //}

  // 6번
  //public static int test6(int[] arr){
  //  int max = arr[0];

  //  for(int i = 0; i < arr.length ; i++){
  //    if(max <arr[i]){
  //      max = arr[i];
  //    }
  //  }
  //  return max;
  //}

  // 7번
  //public static String test7(String[] arr){
  //  String result = "";

  //  for (int i= 0; i < arr.length; i++){
  //    result = result + arr[i];
  //  }
  //  return result;
  //}

  //8번
  //public static int[] test8(int[] arr1, int[] arr2){
  //  int[] resultArr = new int[arr1.length + arr2.length];

  //  for (int i = 0; i < arr1.length ; i++){
  //    resultArr[i] = arr1[i];
  //  }
  //  for (int i = 0; i < arr2.length ; i++){
  //    resultArr[i + arr1.length] = arr2[i];
  //  }

  //  return resultArr;
  //}

  //9번
  //public static int[] test9(int[] arr){
    //매개변수로 들어온 배열의 짝수의 갯수를 구함
    //int evenCnt = 0;

    //for (int i = 0; i < arr.length; i++){
    //  if(arr[i] % 2 == 0){
    //    evenCnt++;
    //  }
    //}
    //짝수의 갯수만큼의 공간을 갖는 배열을 생성
    //int[] resultArr = new int[evenCnt];
    //새로 생성한 배열에 매개변수로 들어온 배열 요소 중 짝수만 저장한다
    //int index =0;
    //for (int i = 0; i < arr.length; i++){
    //  if(arr[i] % 2 == 0){
    //    resultArr[index] = arr[i];
    //    index++;
    //  }
    //}
    //배열을 리턴한다
    //return resultArr;

  //}

//}
