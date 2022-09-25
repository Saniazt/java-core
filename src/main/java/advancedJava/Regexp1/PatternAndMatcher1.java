package advancedJava.Regexp1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher1 {
  public static void main(String[] args) {
    String text =
        "Hello, guys! I send you my email joe@gmail.com so we can \n"
            + "keep in touch. Thanks, Joe! That's cool. I am sending you \n"
            + "my address is: tim@outlook.dot. Lets stay in touch...";

    Pattern email = Pattern.compile("(\\w+)@(gmail|outlook)\\.(com|dot)"); // без new!!!
    // то что в regex в () это группа, кот-рая имеет свой id;
    Matcher matcher = email.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group()); // возращает то что нашел find, строку целеком
      System.out.println(matcher.group(1)); // возвращает 1-ую группу по regex в ()
      System.out.println(matcher.group(2)); // возвращает 2-ую группу по regex в ()
      System.out.println(matcher.group(3)); // возвращает 3-ю группу по regex в ()
    }
  }
}
