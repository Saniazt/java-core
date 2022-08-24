package com.saniazt.Geniuses;

public class MainFOrDOg {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.setSpeed(4);
    dog1.setNickname("Jack");
    dog1.setBreed("Spaniel");

    dog1.showRun();
    String info1 = dog1.info();
    System.out.println(info1);

    Dog dog2 = new Dog();
    dog2.setSpeed(7);
    dog2.setNickname("Cody");
    dog2.setBreed("Greyhound");

    dog2.showRun();
    String info2 = dog2.info();
    System.out.println(info2);
  }
}
