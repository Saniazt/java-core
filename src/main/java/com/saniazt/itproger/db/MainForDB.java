package com.saniazt.itproger.db;

public class MainForDB {
  public static void main(String[] args) {
    DB db = new DB();
    info("Hello World");
  }

  public static void info() {
    System.out.println("Hello");
  }

  public static void info(String word) {
    System.out.println(word + "!");
  }
}
