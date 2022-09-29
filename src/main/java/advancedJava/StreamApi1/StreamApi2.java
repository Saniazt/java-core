package advancedJava.StreamApi1;

import java.util.List;
import java.util.stream.Stream;

public class StreamApi2 {
  public static void main(String[] args) {
    List<String> list1 = List.of("A1", "C1", "B1");

    /*  Stream<String> stream1 =
        list1.stream()
            .filter(
                n -> {
                  System.out.println("Filter " + n);
                  return n.endsWith("2");
                })
            .map(
                n -> {
                  System.out.println("Map " + n);
                  return n;
                });
    stream1.forEach(n -> System.out.println("forEach " + n));*/

    Stream<String> stream2 =
        list1.stream()
            .sorted(
                (o1, o2) -> {
                  System.out.println("Sorted " + o1 + " " + o2);
                  return o1.compareTo(o2);
                })
            .filter(
                s -> {
                  System.out.println("Filter " + s);
                  return s.startsWith("B");
                })
            .map(
                s -> {
                  System.out.println("Map " + s);
                  return "_" + s;
                });
    stream2.forEach(a -> System.out.println("forEach " + a));
  }
}
