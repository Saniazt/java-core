package com.saniazt.Geniuses.Man;

import com.saniazt.Geniuses.Box.Box;

public class MainForMan {
  public static void main(String[] args) {
    Man man = new Man("Igor", 27);
    System.out.println(man.getAge());
    Box box = new Box(12, 21, 21);
  }
}
