package list;

//사원정보를 갖는 클래스
public class Emp {
  private int empNo;
  private String name;
  private String dept;
  private String tel;
  private int salary;

  public Emp(int empNo, String name, String dept, String tel, int salary) {
    this.empNo = empNo;
    this.name = name;
    this.dept = dept;
    this.tel = tel;
    this.salary = salary;
  }

  public int getEmpNo() {
    return empNo;
  }
  public String getName() {
    return name;
  }
  public String getDept() {
    return dept;
  }
  public String getTel() {
    return tel;
  }
  public int getSalary() {
    return salary;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setDept(String dept) {
    this.dept = dept;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "empNo=" + empNo +
            ", name='" + name + '\'' +
            ", dept='" + dept + '\'' +
            ", tel='" + tel + '\'' +
            ", salary='" + salary + '\'' +
            '}';
  }
}
