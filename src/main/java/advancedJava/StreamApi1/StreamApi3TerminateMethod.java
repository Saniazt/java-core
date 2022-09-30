package advancedJava.StreamApi1;

import java.util.List;
import java.util.function.Predicate;

public class StreamApi3TerminateMethod {
  public static void main(String[] args) {
    List<String> projectLanguages = List.of("Java", "Fortran", "C", "C++", "Python", "Ruby", "Js");
    List<String> iKnow = List.of("Java", "Fortran", "C", "Python");

    Predicate<String> predicate = check(iKnow);

    if (projectLanguages.stream().anyMatch(predicate)) {
      System.out.println("I can implement part of the task ");
    } else {
      System.out.println("I cant help");
    }

    if (projectLanguages.stream().allMatch(predicate)) {
      System.out.println("I can implement the whole taks");
    } else System.out.println("I cant implement the whole task");
  }

  public static <T> Predicate<T> check(List<T> list) {
    class CheckLanguages implements Predicate<T> {
      @Override
      public boolean test(T t) {
        for (T element : list) {
          if (element.equals(t)) return true;
        }
        return false;
      }
    }
    return new CheckLanguages();
  }
}
