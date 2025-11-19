package 이론;

public class 배열값읽고쓰기 {
  public static void main(String[] args) {

    //1, 3, 5를 초기화 된 데이터를 갖는 배열 arr1 생성
    int[] arr1 = {1, 3 ,5};

    System.out.println(arr1);
    //배열의 값을 읽을 대는 배열명을 출력해서는 안 된다.

    System.out.println(arr1[0]);
    //배열에 저장된 값을 읽을 때는 " (명확하게) 배열의 (요소) 까지 작성해야함 "

    int[] arr2 = new int[3]; //(1부터 시작하는 칸 '갯수')
    System.out.println(arr2[2]); //(0부터 시작하는 칸 '위치' )
    //배열의 sout 에서 숫자는 0부터 시작하는 칸이다.

    String[] arr3 = new String[5]; //(문자열은 null)
    System.out.println(arr3[0]);

    //배열의 값을 변경, 등록 할 때도 비율의 각 요소로 접근해야 넣는다.
    arr3[0] = "java";
    System.out.println(arr3[0]);



  }
}
