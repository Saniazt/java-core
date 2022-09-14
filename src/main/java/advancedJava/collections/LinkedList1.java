package advancedJava.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
  public static void main(String[] args) {
    List<Integer> linkedList = new LinkedList<>();
    List<Integer> arrayList = new ArrayList<>();
    measureTime(linkedList);
    measureTime(arrayList);
  }

  private static void measureTime(List<Integer> list) {
    long start = System.currentTimeMillis(); // возвращает текущее время в миллисекундах
    for (int i = 0; i < 100000; i++) {
      list.add(0, i);
    }
    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
