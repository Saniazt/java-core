package advancedJava.Annotations1;

public class MethodInfoTest {
  @MethodInfo(purpose = "Print Hello World")
  public void printHelloWorld() {
    System.out.println("Hello world");
  }
}
