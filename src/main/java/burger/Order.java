package burger;

import java.util.Scanner;

public class Order {

  private int burger;
  private int sauce;
  private int cheese;
  private int meet;

  public Order setBurger(int burger) {
    this.burger = burger;
    return this;
  }

  public Order setSauce(int sauce) {
    this.sauce = sauce;
    return this;
  }

  public Order setCheese(int cheese) {
    this.cheese = cheese;
    return this;
  }

  public Order setMeet(int meet) {
    this.meet = meet;
    return this;
  }

  public String toString() {
    return "Total: " + (burger * Price.BURGER.getPrice()
            + sauce * Price.SAUCE.getPrice()
            + cheese * Price.CHEESE.getPrice()
            + meet * Price.MEET.getPrice());
  }

  private final Scanner newBurger = new Scanner(System.in);

  public void calculation(){
    print("How many burgers do you want?");
    setBurger(getQuantity());
    print("How many sauces do you want? For skipping press 'Enter'");
    setSauce(getQuantity());
    print("How many cheese do you want? For skipping press 'Enter'");
    setCheese(getQuantity());
    print("How many meet do you want? For skipping press 'Enter'");
    setMeet(getQuantity());
    print(toString());
  }

  private int getQuantity(){
    String quantity = newBurger.nextLine();
    int resultQuantity = 0;
    if(!quantity.equals("")){
      resultQuantity = Integer.parseInt(quantity);
    }
    return resultQuantity;
  }

  private void print(String value){
    System.out.println(value);
  }

}
