package advancedJava.Lambda1;

interface Executable {
  int execute(int x, int y);
}

class Runner {
  public void run(Executable e) {
    int a = e.execute(10, 15);
    System.out.println(a);
  }
}

public class LambdaExpressions1 {
  public static void main(String[] args) {
    Runner runner = new Runner();
    int h = 1;
    runner.run(
        new Executable() {
          @Override
          public int execute(int x, int y) {
            int h = 2;
            return x + y;
          }
        });

    final int a = 1;
    runner.run((x, y) -> x + y + a); // runner.run(x -> x + 5);
  }
}
