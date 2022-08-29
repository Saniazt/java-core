package com.saniazt.staticANDfinal.StaticTask2;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Apple apple = new Apple();
    Banana banana = new Banana();
    Abricos abricos = new Abricos();
    apple.setPrice(20);
    apple.setWeight(5);
    Apple.printManufacturerInfo();
    apple.cost();
    banana.setPrice(10);
    banana.setWeight(200);
    banana.cost();
    abricos.setPrice(6.5);
    abricos.setWeight(8.1374);
    abricos.cost();
    System.out.println("------");
    ArrayList<Double> doubles = new ArrayList<>();
    doubles.add(apple.cost());
    doubles.add(banana.cost());
    doubles.add(abricos.cost());
    for (double doubles1 : doubles) {
      System.out.println(doubles1);
    }
  }
}
