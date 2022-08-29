package com.saniazt.staticANDfinal.StaticTask2;

public class Banana extends Fruits {
  private double price;
  private double weight;

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public double cost() {
    return this.weight * this.price;
  }
}
