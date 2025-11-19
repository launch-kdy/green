package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
  private List<Emp> empList;
  private Scanner sc;

  public EmpService() {
    sc = new Scanner(System.in);
    empList = new ArrayList<>();

    empList.add(new Emp(1001, "김자바", "개발부", "010-1111-1111", 5000));
    empList.add(new Emp(1002, "이자바", "개발부", "010-1111-2222", 6000));
    empList.add(new Emp(1003, "홍자바", "개발부", "010-1111-3333", 7000));
    empList.add(new Emp(1004, "박자바", "개발부", "010-1111-4444", 8000));
    empList.add(new Emp(1005, "권자바", "개발부", "010-1111-5555", 9000));
  }

  //* 메서드의 return의 역할
  //1. 메서드의 결과 데이터룰 반환(리턴)
  //2. 메서드 안의 리턴을 return ; 이렇게 사용하면 메서드를 종료하라는 의미

  //로그인 메서드
  public void login() {
    //String tel = "010-1111-1111";
    //String result = tel.substring(9);
    while (true) {
      System.out.println("사번 : ");
      int no = sc.nextInt();  //비교하는 자료형이랑 같아야 편하기 때문에 똑같해준다
      System.out.println("비밀번호(연락처의 마지막 4자리) : ");
      String pw = sc.next();  //비교하는 자료형이랑 같아야 편하기 때문에 똑같해준다

      for (int i = 0; i < empList.size(); i++) {
        if (empList.get(i).getEmpNo() == no && empList.get(i).getTel().substring(9).equals(pw)) {
          System.out.println("로그인 하였습니다.");
          System.out.println("'" + empList.get(i).getName() + "'" + "님 반갑습니다.");
          return;
        }
      }

      System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");

    }
  }
  // 키보드로 부서명을 입력받아, 해당 부서에 소속된 사원들의
  // 월급 정보를 출력하는 메소드를 구현하여라.
  public void printSalaryInfo(){
    System.out.println("부서명 : ");
    String deptName = sc.next();


    int salarySum = 0;
    int cnt = 0;
    System.out.println("==" + deptName + " 월급 현황 ==");
    for (int i = 0; i < empList.size(); i++) {
      if (empList.get(i).getDept().equals(deptName)){
        System.out.println("이름 : " + empList.get(i).getName() + ", 월급 : " + empList.get(i).getSalary());
        salarySum = salarySum + empList.get(i).getSalary();
        cnt++;
      }
    }

    double avg = salarySum / (double)cnt;
    System.out.println(deptName + "의 월급 총액은 " + salarySum + "원이며" + ", 평균 급여는 " + avg + "원입니다.");
  }

  public void updateSalary(){
    System.out.println("부서명 : ");
    String deptName = sc.next();
    System.out.println("인상급여 : ");
    int money = sc.nextInt();
    System.out.println(deptName + " 각 사원의 급여가 각각 " + money + "원씩 인상됩니다.");
    System.out.println("==월급 인상 후 " + deptName + " 월급 현황==");
    for (int i = 0; i < empList.size(); i++) {
      if (empList.get(i).getDept().equals(deptName)){
        empList.get(i).setSalary(empList.get(i).getSalary() + money);
        System.out.println("이름 : " + empList.get(i).getName() + ", 월급 : " + empList.get(i).getSalary());
      }
    }
  }
}