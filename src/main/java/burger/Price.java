package burger;

public enum Price {
  BURGER(50),
  SAUCE(10),
  CHEESE(20),
  MEET(30);

  private int price;

  Price(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }

}
