package com.saniazt.anonimnieKlassi.selfDU;

public class Animal {
  Say say1;

  Animal(Say say1) {
    this.say1 = say1;
  }

  public void execute() {
    say1.say();
  }
}
