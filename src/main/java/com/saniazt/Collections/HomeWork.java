package com.saniazt.Collections;

import java.util.ArrayList;

public class HomeWork {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Ivan");
    names.add("Grisha");
    names.add("Natasha");
    names.add("Timur");
    names.add("Sergei");
    names.add("Vova");
    names.add("Grisha");
    names.add("Misha");
    names.add("Sasha");
    names.add("Max");
    names.add("John");

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(24);
    numbers.add(21);
    numbers.add(43);
    numbers.add(21);
    numbers.add(15);
    numbers.add(81);
    numbers.add(12);
    numbers.add(19);
    numbers.add(91);
    numbers.add(91);
    int g1 = numbers.size();
    ArrayList<String> over = new ArrayList<>();
    for (int g = 0; g < numbers.size(); g++) {
      over.add(names.get(g) + " age is " + numbers.get(g));
    }
    for (String total1 : over) {
      System.out.println(total1);
    }
    System.out.println(g1);
  }
}
