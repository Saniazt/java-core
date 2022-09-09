package com.saniazt.serialization;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

  @Serial private static final long serialVersionUID = -3471457094249069784L;
  private int id;
  private String name;
  private transient double netWorth;

  public Person(int id, String name, double netWorth) {
    this.id = id;
    this.name = name;
    this.netWorth = netWorth;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return id + " : " + name + ", NetWorth is " + netWorth;
  }
}
