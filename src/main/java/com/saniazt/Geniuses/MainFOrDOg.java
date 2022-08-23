package com.saniazt.Geniuses;

public class MainFOrDOg {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.speed = 4;
    dog1.nickname = "Jack";
    dog1.breed = "Spaniel";

    dog1.showRun();
    String info1 = dog1.info();
    System.out.println(info1);

    Dog dog2 = new Dog();
    dog2.speed = 7;
    dog2.nickname = "Cody";
    dog2.breed = "Greyhound";

    dog2.showRun();
    String info2 = dog2.info();
    System.out.println(info2);
  }
}
