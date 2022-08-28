package com.saniazt.Geniuses.Interfaces.Homework;

public class Cheff extends Worker implements CanWork {
  public Cheff(String name) {
    super(name);
  }

  @Override
  public void canWork() {
    System.out.println("Im cooking now");
  }
}
