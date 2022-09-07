package com.saniazt.conseptions.poliforfizm.test;

public class MainForConsPol {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Animal dog = new Dog();
    Cat cat = new Cat();
    Dog dog1 = new Dog();
    dog1.bark();

    test(animal);
    test(dog);
    test(cat);
  }

  public static void test(Animal animal) {
    animal.eat();
  }
}
