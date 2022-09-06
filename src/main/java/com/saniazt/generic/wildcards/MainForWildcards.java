package com.saniazt.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public class MainForWildcards {
  public static void main(String[] args) {
    List<Animal> listOfAnimals = new ArrayList<>();
    listOfAnimals.add(new Animal(1, "Animal1"));
    listOfAnimals.add(new Animal(2, "Animal2"));
    listOfAnimals.remove(1);

    List<Dog> listOfDogs = new ArrayList<>();
    listOfDogs.add(new Dog());
    listOfDogs.add(new Dog());

    test(listOfAnimals);
    test(listOfDogs);
  }

  // Object-Animal-Dog: такая иерархия
  // extends это только Animal и Dog
  // super это Object-Animal-Dog

  private static void test(List<? extends Animal> list) {
    for (Animal animal : list) {
      System.out.print(animal.getName() + "");
      animal.eat();
    }
  }
}
