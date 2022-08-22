package com.saniazt.nasledovanie;

public class Ostrich extends Birds {

  public Ostrich(String name, String wings) {
    super(name, wings); // super - всегда первая строчка
  }

  public void hide() {
    System.out.println("I am and Ostrich and i scared");
  }
}
