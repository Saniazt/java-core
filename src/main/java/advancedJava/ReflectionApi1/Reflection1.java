package advancedJava.ReflectionApi1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection1 {
  public static void main(String[] args) throws ClassNotFoundException {
    PersonForRefl pr = new PersonForRefl();

    Class personClass = PersonForRefl.class;
    Class personClass2 = pr.getClass();
    Class personClass3 = Class.forName("advancedJava.ReflectionApi1.PersonForRefl");

    Method[] methods = personClass.getMethods();
    for (Method method : methods) {
      System.out.println(
          method.getName()
              + ", "
              + method.getReturnType()
              + ", "
              + Arrays.toString(method.getParameterTypes()));
    }
    System.out.println("_________");
    Field[] fields = personClass.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(
          field.getName()
              + ", "
              + field.getType()); // если было бы getFields - ничего не выведет тк приватные поля
    }
    System.out.println("__________");
    Annotation[] annotations = personClass.getAnnotations();
    for (Annotation annotation : annotations) {
      if (annotation instanceof Author) {
        System.out.println("Yes, it is instanceof Author");
      }
    }
  }
}
