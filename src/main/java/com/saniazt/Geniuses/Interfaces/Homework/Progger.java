package com.saniazt.Geniuses.Interfaces.Homework;

public class Progger extends Worker implements Can_prog {

  public Progger(String name) {
    super(name);
  }

  @Override
  public void canProg() {
    System.out.println("Can prog");
  }
}
