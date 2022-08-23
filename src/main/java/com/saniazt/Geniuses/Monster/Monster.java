package com.saniazt.Geniuses.Monster;

public class Monster {
  int eyes, hands, legs;

  public Monster() {}

  public Monster(int eyes) {
    this.eyes = eyes;
  }

  public Monster(int eyes, int hands) {
    this.eyes = eyes;
    this.hands = hands;
  }

  public Monster(int eyes, int hands, int legs) {
    this.eyes = eyes;
    this.hands = hands;
    this.legs = legs;
  }

  public void voice() {
    System.out.println("Voice");
  }

  public void voice(int i) {
    for (int j = 0; j < i; j++) {
      System.out.println("Voice");
    }
  }

  public void voice(int i, String asd) {
    for (int j = 0; j < i; j++) {
      System.out.println(asd);
    }
  }
}
