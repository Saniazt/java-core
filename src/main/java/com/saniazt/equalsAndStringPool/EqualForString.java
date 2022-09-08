package com.saniazt.equalsAndStringPool;

public class EqualForString {
  public static void main(String[] args) {
    String string1 = "Hello"; // при создании строки - она перемещается в StringPool
    String string2 =
        "Hello"; // при создании такой же строки - она просто ссылается на первую строку тк они
    // одинаковы

    System.out.println(string1.equals(string2));

    String a = "Friend";
    String b =
        "Friend123"
            .substring(
                0, 6); // то есть, по сути у нас a=b; но a==b будет false, именно поэтому так строки
    // сравнивать нельзя
    System.out.println(a == b);
  }
}
