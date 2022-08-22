package com.saniazt.nasledovanie;

public class Crow extends Birds {
  public Crow(String name, String wings) {
    super(name, wings);
  }

  public void fly() {
    System.out.println("I am Crow and i can fly");
  }
}
