package advancedJava.collections;

import java.util.*;

public class Set1 {
  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<>();
    Set<String> linkedHashSet = new LinkedHashSet<>();
    Set<String> treeSet = new TreeSet<>();

    hashSet.add("Katy");
    hashSet.add("Mike");
    hashSet.add("Tom");
    hashSet.add("George");
    hashSet.add("Donald");
    hashSet.add("Donald");
    hashSet.add("Donald");

    for (String name : hashSet) {
      System.out.println(name);
    }

    System.out.println(hashSet.contains("Tom"));
    System.out.println(hashSet.contains("Sasha"));
    System.out.println(hashSet.isEmpty());
  }
}
