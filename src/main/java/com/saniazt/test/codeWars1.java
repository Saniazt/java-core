package com.saniazt.test;

public class codeWars1 {
  public static int getCount(String str) {
    String[] words = str.split("");
    int h = 0;
    for (int i = 0; i < words.length; i++) {
      if (words[i].equals("a")) h = h + 1;
      if (words[i].equals("e")) h = h + 1;
      if (words[i].equals("i")) h = h + 1;
      if (words[i].equals("o")) h = h + 1;
      if (words[i].equals("u")) h = h + 1;
    }
    return h;
  }

  public static void main(String[] args) {
    System.out.println(getCount("aious"));
  }
}
