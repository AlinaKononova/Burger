package burger;

public enum Price {
  BURGER(50),
  SAUCE(10),
  CHEESE(20),
  MEET(30);

  private Integer price;

  Price(Integer price){
    this.price = price;
  }

  public Integer getPrice(){
    return this.price;
  }

}
