package com.saniazt.nasledovanie.bySymin;

public class MainForInheritance {
  public static void main(String[] args) {
    Cat cat = new Cat();
    Lion lion = new Lion();
    cat.showInfo();
    lion.showInfo();
    System.out.println(cat.eat());
    System.out.println(lion.eat());
  }
}
