package com.saniazt.Geniuses.Interfaces.Homework;

public class Cheff extends Worker implements Can_cook {
  public Cheff(String name) {
    super(name);
  }

  @Override
  public void canCook() {
    System.out.println("Can cook");
  }
}
