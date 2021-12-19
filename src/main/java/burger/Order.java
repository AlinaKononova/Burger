package burger;

import java.util.Scanner;

public class Order {

  private Integer burger;
  private Integer sauce;
  private Integer cheese;
  private Integer meet;

  public Order setBurger(Integer burger) {
    this.burger = burger;
    return this;
  }

  public Order setSauce(Integer sauce) {
    this.sauce = sauce;
    return this;
  }

  public Order setCheese(Integer cheese) {
    this.cheese = cheese;
    return this;
  }

  public Order setMeet(Integer meet) {
    this.meet = meet;
    return this;
  }

  public String toString() {
    return "Total: " + (this.burger * Price.BURGER.getPrice()
            + this.sauce * Price.SAUCE.getPrice()
            + this.cheese * Price.CHEESE.getPrice()
            + this.meet * Price.MEET.getPrice());
  }

  private final Scanner newBurger = new Scanner(System.in);

  public void calculation(){
    print("How many burgers do you want?");
    setBurger(getQuantity());
    print("How many sauces do you want?");
    setSauce(getQuantity());
    print("How many cheese do you want?");
    setCheese(getQuantity());
    print("How many meet do you want?");
    setMeet(getQuantity());
    print(toString());
  }

  private Integer getQuantity(){
    String quantity = newBurger.nextLine();
    Integer resultQuantity = 0;
    if(!quantity.equals("")){
      resultQuantity = Integer.parseInt(quantity);
    }
    return resultQuantity;
  }

  private void print(String value){
    System.out.println(value);
  }

}
