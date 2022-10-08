package advancedJava.ReflectionApi1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Reflection2 {
  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InstantiationException,
          IllegalAccessException, InvocationTargetException {
    Scanner scanner = new Scanner(System.in);
    // Название класса1 Название класса2 Название метода
    Class<?> classObject1 =
        Class.forName(scanner.next()); // будет делить строчку по пробелу три раза
    Class<?> classObject2 = Class.forName(scanner.next());
    String methodName = scanner.next();

    Method m = classObject1.getMethod(methodName, classObject2);
    Object o1 = classObject1.newInstance();
    Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

    m.invoke(o1, o2); // вызываем метод на обьекте о1 с аргументом о2

    System.out.println(o1);
  }
}
