package com.saniazt.Collections.HashSetAndTreeSet;

import java.util.TreeSet;

public class MainForTreeSet {
  // Тоже недопускает дубликатов, но данные в отсортированом виде(алфавит или очередность цифр)
  // TreeSet работает медленее чем HashSet
  // метода get в TreeSet нет
  public static void main(String[] args) {
    TreeSet<Integer> names = new TreeSet<>();
    names.add(4);
    names.add(182);
    names.add(82);
    names.add(81);
    names.add(8);
    for (Integer name : names) {
      System.out.println(name);
    }
  }
}
