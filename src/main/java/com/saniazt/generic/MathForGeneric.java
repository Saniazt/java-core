package com.saniazt.generic;

public class MathForGeneric {
  public static <T> boolean isIn(T val, T[] ar) { // Это обобщенный метод
    for (T v : ar) if (v.equals(val)) return true;
    return false;
  }
}
