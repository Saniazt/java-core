package com.saniazt.Geniuses.Interfaces;

public class Main {
  public static void main(String[] args) {
    /*    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();
    Cat cat4 = new Cat();
    Cat cat5 = new Cat();
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    Dog dog3 = new Dog();
    Dog dog4 = new Dog();
    Dog dog5 = new Dog();
    Bird bird1 = new Bird();
    Bird bird2 = new Bird();
    Fish fish1 = new Fish();
    ArrayList<CanRun> animals = new ArrayList<>();
    animals.add(dog1);
    animals.add(cat2);
    animals.add(bird1);
    animals.add(cat4);
    animals.add(dog3);
    for (CanRun animal__ : animals) {
      animal__.run();
    }*/
    Dog dog = new Dog();
    CanRun canRun = dog;
    dog = (Dog) canRun;
    Fluable fluable = new Bird();
    fluable.fly();
  }
}
