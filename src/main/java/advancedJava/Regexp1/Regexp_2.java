package advancedJava.Regexp1;

import java.util.Arrays;

public class Regexp_2 {
  public static void main(String[] args) {
    // split:

    String a = "Hello there hey";
    String[] words = a.split(" ");
    System.out.println(Arrays.toString(words));

    String b = "Hello.there.hey";
    String[] words2 = b.split("\\.");
    System.out.println(Arrays.toString(words2));

    String c = "Hello224124there53454hey2dgsd";
    String[] words3 = c.split("\\d+");
    System.out.println(Arrays.toString(words3));

    // replace:
    // replaceALL - принимает на вход регулярные выражения
    // replaceFirst - меняет только первое(принимает только регулярные выражения)

    String k = "Hello there hey";
    String k2 = k.replace(" ", "."); // конткретно знаем что заменить
    System.out.println(k2);

    String p = "Hello214124there214124124hey";
    String p2 = p.replaceAll("\\d+", ".");
    System.out.println(p2);
  }
}
