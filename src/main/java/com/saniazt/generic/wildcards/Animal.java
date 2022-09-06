package com.saniazt.generic.wildcards;

public class Animal {
  private int id;
  private String name;

  public Animal() {}
  ;

  public Animal(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public static void eat() {
    System.out.println(" is eating... ");
  }

  public String toString() {
    return String.valueOf(id);
  }
}
