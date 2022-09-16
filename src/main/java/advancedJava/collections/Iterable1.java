package advancedJava.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterable1 {
  public static void main(String[] args) {
    List<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    // before java 5
    int idx = 0;
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      if (idx == 2) iterator.remove();
      idx++;
    }
    System.out.println(list);

    // Java5:
    /*  for (int x : list) {
      System.out.println(x);
    }*/
  }
}
