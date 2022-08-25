package com.saniazt.Collections.HashSetAndTreeSet;

import java.util.HashSet;
// HashSet используеться когда нужно чтобы в колекции небыло дубликатов
// В HashSet все элементы идут не по очереди, поэтому get нельзя использовать

public class MainForHashSet {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
    names.add("John");
    names.add("Olga");
    names.add("Zhenya");
    names.add("Maksym");
    names.add("Olga");
    for (String name : names) {
      System.out.println(name);
    }
  }
}
