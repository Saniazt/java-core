package advancedJava.collections;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>();
    set1.add(0);
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);
    set1.add(5);

    Set<Integer> set2 = new HashSet<>();
    set2.add(2);
    set2.add(3);
    set2.add(4);
    set2.add(5);
    set2.add(6);
    set2.add(7);
    set2.add(8);

    // union - обьединение множеств
    Set<Integer> union = new HashSet<>(set1);
    union.addAll(set2);
    System.out.println(union);

    // Intersection - пересечение множеств
    Set<Integer> intersection = new HashSet<>(set1);
    intersection.retainAll(set2);
    System.out.println(intersection);

    // Difference - разность множеств
    Set<Integer> difference = new HashSet<>(set1);
    difference.removeAll(set2);
    System.out.println(difference);
  }
}
