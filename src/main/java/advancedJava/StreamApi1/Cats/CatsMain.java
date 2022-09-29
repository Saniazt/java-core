package advancedJava.StreamApi1.Cats;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CatsMain {
  public static void main(String[] args) {
    Cat cat1 = new Cat("Olivia", 5, "Grey");
    Cat cat2 = new Cat("Barsiksss", 7, "White");
    Cat cat3 = new Cat("Tessa", 4, "Red");
    Cat cat4 = new Cat("Tessa", 4, "Red");

    List<Cat> list1 = List.of(cat1, cat2, cat3, cat4);

    int age = 5;
    /* List<Cat> result = list1.stream().filter(a -> a.getWeight() >= age).toList();
    System.out.println(result);*/
    /* Stream<Cat> catToName =
        list1.stream().filter(a -> a.getName().length() > 5).filter(a -> a.getWeight() > 5); //по очереди с каждым элементорм
    try {
      List<Cat> result2 = catToName.collect(Collectors.toList());
    } catch (NullPointerException e) {
      System.out.println(e);
    }*/

    /* Stream<String> catToName2 =
        list1.stream().filter(a -> a.getWeight() > age).map(a -> a.getName());
    List<String> result3 = catToName2.collect(Collectors.toList());
    System.out.println(result3);*/
    /*    Stream<Cat> catToName3 = list1.stream().filter(a->a.getWeight()<5).peek(a->a.setName("_"+a.getName()));
    catToName3.forEach(System.out::println);
    System.out.println();
    for(Cat cat:list1){
      System.out.println(cat);*/
    Stream<Integer> catLongestName =
        list1.stream()
            .map(a -> a.getName().length())
            .sorted(
                (o1, o2) -> {
                  if (o1 > o2) return -1;
                  if (o1 < o2) return 1;
                  else return 0;
                });

    String longest =
        list1.stream()
            .sorted(
                (o1, o2) -> {
                  if (o1.getName().length() < o2.getName().length()) return 1;
                  if (o1.getName().length() > o2.getName().length()) return -1;
                  else return 0;
                })
            .findFirst()
            .get()
            .getName();
    List<Cat> wd = list1.stream().distinct().collect(Collectors.toList());
    System.out.println(wd);

    //    String longest = catLongestName2.toList().stream().findFirst().get().getName();

    System.out.println(longest);
  }
}
