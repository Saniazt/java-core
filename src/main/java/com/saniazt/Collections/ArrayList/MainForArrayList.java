package com.saniazt.Collections.ArrayList;

import java.util.ArrayList;

public class MainForArrayList {
  public static void main(String[] args) {
    /* ArrayList<String> employees = new ArrayList<>();
    employees.add("Sergei");
    employees.add("Krystyna");
    employees.add("Elena");
    employees.add("Viktor");
    employees.add("Natasha");
    employees.remove(0);
    employees.remove("Natasha");
    for (String name : employees) {
        System.out.println(name);
    }*/
    // CNTRL + SHIFT + SLASH - закоментировать кусок кода

    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      numbers.add(i);
    }
    int sum = 0;
    /*for (int i : numbers) {
      System.out.println(i);
    }*/
    for (int i : numbers) {
      sum += i;
    }
    System.out.println(sum);
  }
}
