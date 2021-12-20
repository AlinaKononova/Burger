package burger;

import java.util.Scanner;

public class Order {

  private int numberBurger;
  private int numberSauce;
  private int numberCheese;
  private int numberMeet;

  public Order setBurger(int numberBurger) {
    this.numberBurger = numberBurger;
    return this;
  }

  public Order setSauce(int numberSauce) {
    this.numberSauce = numberSauce;
    return this;
  }

  public Order setCheese(int numberCheese) {
    this.numberCheese = numberCheese;
    return this;
  }

  public Order setMeet(int numberMeet) {
    this.numberMeet = numberMeet;
    return this;
  }

  public String toString() {
    return "Total: " + (numberBurger * Price.BURGER.getPrice()
            + numberSauce * Price.SAUCE.getPrice()
            + numberCheese * Price.CHEESE.getPrice()
            + numberMeet * Price.MEET.getPrice());
  }

  private final Scanner newBurger = new Scanner(System.in);

  private int getQuantity() {
    String quantity = newBurger.nextLine();
    int resultQuantity = 0;
    if (!quantity.equals("")) {
      resultQuantity = Integer.parseInt(quantity);
    }
    return resultQuantity;
  }

  private void print(String value) {
    System.out.println(value);
  }

  public void calculation() {
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

}
