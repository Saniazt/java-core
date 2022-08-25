package com.saniazt.nasledovanie.bySymin;

public class Cat extends CatFamily {
  public Cat() {
    super(2, 4, false);
  }

  @Override
  public String eat() {
    System.out.print(super.eat());
    return "Whiskas";
  }
}
