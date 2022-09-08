package com.saniazt.Geniuses.Exceptions.alishevExceptions;

import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
  public static void main(String[] args) {
    try {
      run();
    } catch (Exception e) { // multi catching
      throw new RuntimeException(e);
    }
  }

  public static void run() throws IOException, ParseException, IllegalArgumentException {}
}
