package com.saniazt.Geniuses.Interfaces.Homework;

public class Driver extends Worker implements CanWork {
  public Driver(String name) {
    super(name);
  }

  @Override
  public void canWork() {
    System.out.println("Im driving now");
  }
}
