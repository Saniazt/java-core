package advancedJava.StreamApi1;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamApi5 {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
    BinaryOperator<Integer> bop = (a, b) -> a > b ? a : b;
    Optional<Integer> biggest1 = list.stream().reduce(bop);
    int biggest2 = biggest1.get();

    int sum = list.stream().filter(a -> a % 2 == 1).reduce(Integer::sum).get();
    System.out.println(sum);
    System.out.println(biggest2);
  }
}
