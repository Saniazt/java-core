package com.saniazt.Geniuses.Interfaces;

public class Cat extends Animal implements CanRun {
  @Override
  public void eat() {
    System.out.println("Whiskas");
  }

  public void run() {
    System.out.println("Cat is running");
  }
}
