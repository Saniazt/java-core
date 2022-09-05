package com.saniazt.stringBuilder;

public class MainForStringBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Hello").append(". My name is Sasha.");
    System.out.println(sb.toString());

    System.out.println("------");

    System.out.printf("This is my String,%s", " . That's it\n");
    System.out.printf("This is my float, %.4f\n", 567.456789);
    System.out.printf("This is my float,%10d\n", 7654);
    System.out.printf("This is my float,%-10d\n", 7654);
  }
}
