package advancedJava.collections;

import java.util.*;

public class Comparable1 {
  public static void main(String[] args) {
    List<Person2> person2List = new ArrayList<>();
    Set<Person2> person2Set = new TreeSet<>();

    addElements(person2List);
    addElements(person2Set);
    Collections.sort(person2List);

    System.out.println(person2List);
    System.out.println(person2Set);
  }

  private static void addElements(Collection collection) {
    collection.add(new Person2(3, "Katy"));
    collection.add(new Person2(1, "Bob"));
    collection.add(new Person2(4, "George"));
    collection.add(new Person2(2, "Tom"));
  }
}

class Person2 implements Comparable<Person2> {
  private int id;
  private String name;

  public Person2(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person2{" + "id=" + id + ", name='" + name + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person2 person2 = (Person2) o;
    return id == person2.id && Objects.equals(name, person2.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public int compareTo(Person2 o) { //чем меньше имя - тем меньше обьект
    if (this.name.length() > o.getName().length()) return 1;
    else if (this.name.length() < o.getName().length()) return -1;
    else return 0;
  }
}
