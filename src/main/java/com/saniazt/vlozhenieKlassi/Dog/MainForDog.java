package com.saniazt.vlozhenieKlassi.Dog;

public class MainForDog {
  public static void main(String[] args) {
    Dog tessa = new Dog("Tessa");
    tessa.run();
    System.out.println(Dog.Stat.counter);
    System.out.println(Dog.Stat.id);
  }
}
