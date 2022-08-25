package com.saniazt.nasledovanie.bySymin;

public class CatFamily {
  private int ears;
  private int legs;
  private boolean bigClaws; // есть ли большие когти

  public CatFamily(int ears, int legs, boolean bigClaws) {
    this.ears = ears;
    this.legs = legs;
    this.bigClaws = bigClaws;
  }

  public void showInfo() {
    System.out.println("Ears count " + ears + ". Legs count " + legs + ". Big Claws? " + bigClaws);
  }

  public void setBigClaws(boolean bigClaws) {
    this.bigClaws = bigClaws;
  }

  public String eat() {
    return ("Im eating ");
  }
}
