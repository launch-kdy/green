public class Worker_Test {
  public static void main(String[] args) {
    Person p = new Person("KIM", 20);
    Worker w = new Worker("java company", "dev", p);
    w.printWorker();
  }
}
