package com.saniazt.test;

import java.util.*;

public class CollectionsTest {
  public static void main(String[] args) {
    Set<Classmates> map1 = new HashSet<>();
    map1.add(new Classmates(123, "Sasha"));
    map1.add(new Classmates(131, "Andrey"));
    map1.add(new Classmates(88, "Vasya"));
    map1.add(new Classmates(91, "Vitalii"));
    map1.add(new Classmates(568, "Rita"));
    map1.add(new Classmates(3, "Natalia"));
    map1.add(new Classmates(56, "Natalia"));
    for (Classmates i : map1) {
      System.out.println(i);
    }
  }
}

class Classmates {
  int id;
  String name;

  public Classmates(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return id + ":" + name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Classmates that = (Classmates) o;
    return id == that.id && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
