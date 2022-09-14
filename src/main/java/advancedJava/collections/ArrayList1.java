package advancedJava.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    //    System.out.println(list);
    //    System.out.println(list.get(0));
    //    System.out.println(list.get(99));
    //    System.out.println(list.size());
    /*  for (Integer integer : list) {
      System.out.println(integer);
    }*/

  }
}
