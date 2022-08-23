package com.saniazt.Geniuses;

public class Dog {
  String nickname;
  String breed;
  int speed;

  void showRun() {
    String result = "";
    for (int i = 0; i < speed; ++i) {
      result = result + "run";
      if (i == speed - 1) {
        result += ".";
      } else {
        result += ", ";
      }
    }
    System.out.println(result);
  }

  String info() {
    return "Nickname: " + nickname + ", " + "Breed: " + breed + ", " + "Speed: " + speed;
  }
}
