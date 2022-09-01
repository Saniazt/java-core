package com.saniazt.vlozhenieKlassi.Dog;

public class MainForDogAndCat {
  public static void main(String[] args) {
    Dog tessa = new Dog("Tessa");
    tessa.run();
    tessa.gav();
    System.out.println(Dog.Stat.counter);
    System.out.println(Dog.Stat.id);
    System.out.println("Hello world!!!!");
    Cat olivia = new Cat("Olivia", 5);
    olivia.eat();
    olivia.sravnenie();
    olivia.setAge(11);
    olivia.setName("Grisha");
    olivia.meow("8fsdkfjsdf");
    olivia.sravnenie();
    olivia.eat();
    olivia.meow("Hello");
    olivia.meow("Bye");
  }
}
