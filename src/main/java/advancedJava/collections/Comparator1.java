package advancedJava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Для строк и чисел применяется естественный порядок(а доп порядок можем переназначить мы)
// Для наших собсвенных обьектов мы создаем свой порядок по параментрам которые хотим

public class Comparator1 {
  public static void main(String[] args) {
    List<String> animals = new ArrayList<>();
    animals.add("Cat");
    animals.add("Frogggg");
    animals.add("Bird");
    animals.add("Dogggggg");

    Collections.sort(
        animals,
        new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
            if (o1.length() > o2.length()) return 1;
            else if (o1.length() < o2.length()) return -1;
            else return 0;
          }
        });
    System.out.println(animals);

    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(2);
    numbers.add(1734);
    numbers.add(12);
    Collections.sort(
        numbers,
        new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            if (o1 > o2) return -1;
            else if (o1 < o2) return 1;
            else return 0;
          }
        });
    System.out.println(numbers);

    List<Personn> people = new ArrayList<>();
    people.add(new Personn("Katy", 2));
    people.add(new Personn("Mike", 3));
    people.add(new Personn("Bob", 1));
    Collections.sort(
        people,
        new Comparator<Personn>() {
          @Override
          public int compare(Personn o1, Personn o2) {
            if (o1.getId() > o2.getId()) return 1;
            else if (o1.getId() < o2.getId()) return -1;
            else return 0;
          }
        });
    System.out.println(people);
  }
}

class Personn {
  private String name;
  private int id;

  public Personn(String name, int id) {
    this.name = name;
    this.id = id;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", id=" + id + '}';
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }
}
