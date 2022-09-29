package com.saniazt.test;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class codeWars1 {
  public static String longest(String s1, String s2) {
    var set = new TreeSet<String>();

    for (String s : Arrays.asList(s1, s2)) {
      for (char c : s.toCharArray()) {
        set.add(String.valueOf(c));
      }
    }

    return String.join(", ", set);
  }

  public static int squareSum(int[] n) {
    if (n.length == 0) return 0;
    n = Arrays.stream(n).map(a -> a * a).toArray();
    return Arrays.stream(n).reduce(Integer::sum).getAsInt();
  }

  public static String numberToString(int num) {
    return Integer.toString(num);
  }

  public static int findSmallestInt(int[] args) {
    args = Arrays.stream(args).sorted().toArray();
    return args[0];
  }

  public static String oddOrEven(int[] array) {

    if (array.length == 0) return "even";
    int sum = Arrays.stream(array).reduce(Integer::sum).getAsInt();
    if (sum % 2 == 0) return "even";
    else return "odd";
  }

  public static int squareDigits(int n) {
    String s1 = String.valueOf(n);
    String[] s2 = s1.split("");
    int[] arr1 = new int[s2.length];
    for (int i = 0; i < s2.length; i++) {
      arr1[i] = Integer.parseInt(s2[i]);
    }
    arr1 = Arrays.stream(arr1).map(a -> a * a).toArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr1.length; i++) {
      sb.append(arr1[i]);
    }
    return Integer.parseInt(String.valueOf(sb));
  }

  public static int returnDouble(int n) {
    var a = 2;
    return n * a;
  }
  public static String highAndLow(String numbers) {
    int [] arr1 = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
    int a1 = Arrays.stream(arr1).min().getAsInt();
    int a2 =Arrays.stream(arr1).max().getAsInt();
    return a2+" "+a1;
  }


  public static int findShort(String s) {
  return Arrays.stream(s.split(" ")).min((o1, o2) -> {
    if (o1.length() > o2.length()) return 1;
    if (o1.length() < o2.length()) return -1;
    else return 0;
  }).get().length();
  }

  public static int grow(int[] x){
    return Arrays.stream(x).reduce((new IntBinaryOperator() {
      @Override
      public int applyAsInt(int left, int right) {
        return left*right;
      }
    })).getAsInt();
  }


  public int Liters(double time)  {

    double d = (time/0.5);
    return  ((int) d);
  }


  public static String  disemvowel(String str) {
    String [] arr2 = {"a", "e", "i", "o", "u","A","E","I","O","U"};
    int y = arr2.length;
    for (String s : arr2) {
      {
        if (str.contains(s))
          str = str.replaceAll(s, "");
      }
    }
  return str;
   }




  public static void main(String[] args) throws InterruptedException {
    longest("gsdgsdg", "jkfyuxi");
    final int f = 5;
    Thread thread =
        new Thread(
            () -> {
              for (int i = 0; i < 10; i++) {
                System.out.println(i);
              }
            });
    thread.start();
    thread.join();

    Set<String> list = new HashSet<>();
    list.add("George");
    list.add("Ann");
    list.add("Vitalii");
    list.add("Sasha");
    list.add("Sasha");
    List<Integer> list1 = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      list1.add(i, i + 1);
    }

    Thread thread3 = new Thread(() -> System.out.println(list + list1.toString()));
    thread3.start();
    thread3.join();

    Map<Integer, String> map1 = new HashMap<>();
    Iterator<String> it = list.iterator();
    for (int i = 0; i < list.size(); i++) {
      map1.put(list1.get(i), it.next());
    }
    System.out.println(map1);
    int[] n = new int[] {6, 2, 65};
    squareSum(n);
    System.out.println(findSmallestInt(n));
    System.out.println(squareDigits(62781));
    BiFunction<String, String, Integer> fun = (var g, var t) -> g.length() + t.length();
    System.out.println(fun.apply("Java", "Java"));
  }
}
