package com.saniazt.Geniuses;

public class Dog {
  private String nickname;
  private String breed;
  private int speed;

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

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
