package com.saniazt.enumPackage.enumAlishev;

public class MainForEnumAnimal {
  public static void main(String[] args) {
    Animal animal = Animal.DOG;

    switch (animal) {
      case CAT -> System.out.println("Its a cat");

      case DOG -> System.out.println("Its a dog");
    }
    System.out.println(animal);
    Season season = Season.SUMMER;
    switch (season) {
      case SUMMER -> System.out.println("Its warm");
      case WINTER -> System.out.println("its cold");
    }
    System.out.println(season.getClass());
    System.out.println(animal.getClass());
    System.out.println(season.getTemp());
    System.out.println(season.name());
    System.out.println(animal.name());
    System.out.println(season.ordinal());
  }
}
