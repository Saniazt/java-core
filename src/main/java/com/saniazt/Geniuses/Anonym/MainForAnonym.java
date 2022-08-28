package com.saniazt.Geniuses.Anonym;

public class MainForAnonym {
  public static void main(String[] args) {
    Director director = new Director();
    director.force(
        new Cookable() {
          @Override
          public void cook() {
            System.out.println("Im cooking");
          }
        });
  }
}
