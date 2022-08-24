package com.saniazt.Collections;

public class Main {
  public static void main(String[] args) {
    MyArrayList employees = new MyArrayList();
    employees.add("Nikita");
    employees.add("Igor");
    employees.add("Vanya");
    employees.add("Ivan");
    employees.add("Maksyn");
    employees.add("Iryna");
    employees.add("Alexey");
    employees.remove("Vanya");
    employees.remove("Alexey");
    employees.remove("Roma");

    for (int i = 0; i < employees.getSize(); i++) {
      System.out.println(employees.get(i));
    }
  }
}
