package com.saniazt.Geniuses.Anonym.HM;

public class MainForHMAnonym {
  public static void main(String[] args) {
    Director director = new Director();
    Counter counter =
        new Counter() {
          @Override
          public String report(int month) {
            String str = Integer.toString(month);
            return str;
          }
        };
    System.out.println(director.force(counter, 9));
  }
}
