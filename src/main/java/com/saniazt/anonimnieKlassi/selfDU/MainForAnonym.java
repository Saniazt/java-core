package com.saniazt.anonimnieKlassi.selfDU;

public class MainForAnonym {
  public static void main(String[] args) {
    Animal dog =
        new Animal(
            new Say() {
              @Override
              public void say() {
                System.out.println("Dog is speaking");
              }
            });
    dog.execute();
  }
}
