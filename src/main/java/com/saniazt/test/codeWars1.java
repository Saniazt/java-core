package com.saniazt.test;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

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
    int[] arr1 = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
    int a1 = Arrays.stream(arr1).min().getAsInt();
    int a2 = Arrays.stream(arr1).max().getAsInt();
    return a2 + " " + a1;
  }

  public static int findShort(String s) {
    return Arrays.stream(s.split(" "))
        .min(
            (o1, o2) -> {
              if (o1.length() > o2.length()) return 1;
              if (o1.length() < o2.length()) return -1;
              else return 0;
            })
        .get()
        .length();
  }

  public static int grow(int[] x) {
    return Arrays.stream(x)
        .reduce(
            (new IntBinaryOperator() {
              @Override
              public int applyAsInt(int left, int right) {
                return left * right;
              }
            }))
        .getAsInt();
  }

  public int Liters(double time) {

    double d = (time / 0.5);
    return ((int) d);
  }

  public static String disemvowel(String str) {
    String[] arr2 = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
    int y = arr2.length;
    for (String s : arr2) {
      {
        if (str.contains(s)) str = str.replaceAll(s, "");
      }
    }
    return str;
  }

  public static int Past(int h, int m, int s) {
    return (h * 60000 * 60) + (m * 60000) + (s * 1000);
  }

  public static int cockroachSpeed(double x) {
    return (int) x;
  }

  public static boolean setAlarm(boolean employed, boolean vacation) {
    return employed && !vacation;
  }

  public static double find_average(int[] array) {
    if (array.length == 0) return 0;
    return Arrays.stream(array).average().getAsDouble();
  }

  //   Stream<String>stream = Arrays.stream(pin.split("")).filter((Predicate<String>) s -> {
  //     int[] number = new int[]{1,2,3,4,5,6,7,8,9,0};
  //     for(int i=0;i<pin.length();i++){
  //       if(Integer.parseInt(s) == number[i]) return true;
  //       else return false;
  //   };
  // }

  //    String[] arr4 = Arrays.stream(pin.split("")).toArray();
  //    for (int i = 0; i < pin.length(); i++)
  //      if (arr4[i].contains("A-Za-z")) return false;
  //      else if (arr4.length == 4) return true;
  //    return true;

  public static List<Object> filterList(final List<Object> list) {
    // return list.stream().filter(o -> !o.toString().contains("[A-Za-z+]")).toList();
    return list.stream().filter(a -> a instanceof Integer).collect(Collectors.toList());
  }

  public static int sortDesc(final int num) {
    String[] arr = numberToString(num).split("");
    int[] arr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).sorted().toArray();
    return 1;
  }

  public static boolean getXO(String str) {
    String[] arr1 = str.split("");
    int y = 0;
    int x = 0;
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i].equals("o") || arr1[i].equals("O")) x = x + 1;
      if (arr1[i].equals("x") || arr1[i].equals("X")) y = y + 1;
    }
    System.out.println(x + "and" + y);
    if (x == y) return true;
    else return false;
  }

  public static int stringToNumber(String str) {
    return Integer.parseInt(str);
  }

  public static boolean isLove(final int flower1, final int flower2) {
    if (flower1 % 2 == 0 && !(flower2 % 2 == 0)) return true;
    else if (flower2 % 2 == 0 && !(flower1 % 2 == 0)) return true;
    else return false;
  }

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> list1 = new ArrayList<>(Arrays.stream(a).boxed().toList());
    List<Integer> list2 = Arrays.stream(b).boxed().toList();
    list1.removeAll(list2);
    return list1.stream().mapToInt(e -> e).toArray();
  }

  public static int sum(int[] arr) {
    return Arrays.stream(arr).filter(v -> v > 0).sum();
  }

  public static String[] towerBuilder(int nFloors) {
    String[] tower = new String[nFloors];
    for (int i = 0; i < nFloors; i++)
      tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
    List<String> list = Arrays.asList(tower);
    list.stream().forEach(System.out::println);
    return tower;
  }

  public static Map<Integer, String> toMApKV(List<Integer> list) {
    return list.stream()
        .collect(Collectors.toMap(Function.identity(), a -> (a % 2 == 0) ? "even" : "odd"));
  }

  public static int findIt(int[] a) {
    int xor = 0;
    for (int i : a) {
      xor = xor ^ i;
    }

    return xor;
  }

  public static int[] countBy(int x, int n) {
    int[] xi = new int[n];
    for (int i = 0; i < xi.length; i++) {
      xi[i] = x;
      x = x + xi[0];
    }
    System.out.println(Arrays.toString(xi));
    return xi;
  }

  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    HashMap<Integer, Integer> map = new HashMap<>();
    return Arrays.stream(elements)
        .filter(
            i -> {
              map.merge(i, 1, Integer::sum);
              return map.get(i) <= maxOccurrences;
            })
        .toArray();
  }

  public static int persistence(long n) {
    int result = 0;
    while (n > 9) {
      long multi = 1;
      for (char t : String.valueOf(n).toCharArray()) {
        multi *= Long.parseLong(String.valueOf(t));
      }
      n = multi;
      result++;
    }
    return result;
  }

  public static char getGrade(int s1, int s2, int s3) {
    var y = (s1 + s2 + s3) / 3;
    if (y < 60) return 'F';
    if (y >= 60 && y < 70) return 'D';
    if (y >= 70 && y < 80) return 'C';
    if (y >= 80 && y < 90) return 'B';
    if (y >= 90 && y <= 100) return 'A';
    else return 'H';
  }

  public static String accum(String s) {
    List<String> strings = Arrays.stream(s.split("")).toList();
    strings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(strings.get(i).toUpperCase())
          .append(strings.get(i).toLowerCase().repeat(i))
          .append("-");
    }
    return sb.toString().substring(0, sb.length() - 1);
  }

  public static String camelCase(String input) {
    char[] strings = input.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(strings[i])) {
        sb.append(" ");
      }
      sb.append(strings[i]);
    }
    return sb.toString();
  }

  private static int getNum(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        return Character.getNumericValue(s.charAt(i));
      }
    }
    return 0;
  }

  public static String order(String words) {
    if (words.equals("")) {
      return "";
    }
    String[] arr = words.split(" ");
    String[] temp = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      temp[getNum(arr[i]) - 1] = arr[i];
    }
    return String.join(" ", temp);
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
    System.out.println(cockroachSpeed(5));
    getXO("xxx23424esdsfvxXXOOooo");
    int[] m = new int[] {1, 2, 4, 2, 2, 4, 6, 2};
    int[] p = new int[] {1, 5};
    arrayDiff(m, p);
    towerBuilder(40);
    countBy(5, 6);
    System.out.println(Arrays.toString(deleteNth(m, 3)));
    System.out.println(persistence(147));
    System.out.println(accum("MlkhaoPO"));
    System.out.println(camelCase("camelCasing"));
    System.out.println(order("is2 Thi1s T4est 3a"));
  }
}
