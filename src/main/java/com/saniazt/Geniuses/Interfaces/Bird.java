package com.saniazt.Geniuses.Interfaces;

public class Bird extends Animal implements CanRun, Fluable {
  @Override
  public void fly() {
    System.out.println("Bird is flying");
  }

  @Override
  public void eat() {
    System.out.println("birdseed");
  }

  @Override
  public void run() {
    System.out.println("Bird is running");
  }
}
