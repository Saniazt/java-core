package com.saniazt.nasledovanie;

public class Main {
  public static void main(String[] args) {
    Ostrich ostrich = new Ostrich("Pervui", "Pervoho");

    ostrich.setName("Ostrich");

    Birds ostrich2 = new Ostrich("Vtoroi", "Vtorogo");
    ostrich2.walk();

    Crow crow1 = new Crow("vorona", "Krulya");
    crow1.fly();
    crow1.walk();
  }
}
