public class Restaurant {
  private String name;
  private Cookable chef = new NewChef();

  //영업 중..
  public void open(){
    chef.cook();
  }

}
