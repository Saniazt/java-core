package com.saniazt.conseptions.poliforfizm.test;

public class Dog extends Animal {
  @Override
  public void eat() {
    System.out.println("Dog is eating...");
  }

  public void bark() {
    System.out.println("Gav-Gav");
  }
}
