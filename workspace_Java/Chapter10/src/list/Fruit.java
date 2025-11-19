package list;

public class Fruit {
  private String name;
  private String country;
  private int price;

  public Fruit(String name, String country, int price) {
    this.name = name;
    this.country = country;
    this.price = price;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }
  public String getCountry() {
    return country;
  }
  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Fruit{" +
            "name='" + name + '\'' +
            ", country='" + country + '\'' +
            ", price=" + price +
            '}';
  }



}
