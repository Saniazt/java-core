package com.saniazt.Geniuses.Interfaces.Homework;

public class Progger extends Worker implements CanWork {

  public Progger(String name) {
    super(name);
  }

  @Override
  public void canWork() {
    System.out.println("Im progging now");
  }
}
