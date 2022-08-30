package com.saniazt.vlozhenieKlassi.Dog;

public class Dog {
  private String name = "";
  private Foot foot = new Foot();
  private int id = -1;

  {
    foot = new Foot();
    String name = "";
    System.out.println("New example is ready.");
    Stat.counter++;
    id = ++Stat.id;
  }

  Dog() {}

  public Dog(String name) {
    this.name = name;
  }

  void run() {
    foot.run();
  }

  class Foot {
    void run() {
      System.out.println("Dog " + Dog.this.name + " is running");
    }
  }

  static class Stat {
    public static int counter = 0;
    public static int id = 0;
  }
}
