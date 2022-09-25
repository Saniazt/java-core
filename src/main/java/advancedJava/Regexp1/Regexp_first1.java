package advancedJava.Regexp1;

public class Regexp_first1 {
  public static void main(String[] args) {
    /*
      RegExLib.com  - CheatSheet;
       \\d  - одна цифра
       \\w - одна буква =[a-zA-Z]
       + - 1 или более
       * - 0 или более
       ? - символ до него может быть или не быть. 0 или 1 символ до
       (x|y|z) - одна строка из множества строк
       [a-zA-Z] - все англ буквы
       [abc] = (a|b|c)
       [0-9] = \\d
       [^abc] - мы хотим все символы кроме a b c
       . - любой символ
       {2} - 2 символа до =  (\\d{2}) - хотим видеть ровно 2 цифры;
       {2, } - от 2 симолов, 2 and >;
       {2, 4} - от 2 до 4 символов;
    */
    boolean x = true;
    boolean y = false;
    String a = "-213123";
    String b = "2134";
    String c = "+21412";

    System.out.println(a.matches("(-|\\+)?\\d*"));
    System.out.println(b.matches("(-|\\+)?\\d*"));
    System.out.println(c.matches("(-|\\+)?\\d*"));

    String d = "asd21fDDDsd24124124fsdf4214";
    System.out.println(d.matches("[a-zA-Z0-9]+?\\d*"));

    String e = "helloc";
    System.out.println(e.matches("[^abc]*"));

    String url = "http://www.google.com";
    String url2 = "Hello NOR!!";
    System.out.println(
        url.matches("http://www\\..+\\.(com|ru)")); // .+ на месте названия сайта любой символ
    System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

    String f = "132222";
    System.out.println(f.matches("\\d{2,}")); // хотив две или более цифры
  }
}
