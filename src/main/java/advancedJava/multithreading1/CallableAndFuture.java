package advancedJava.multithreading1;

import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executorService = Executors.newFixedThreadPool(1);

    Future<Integer> future =
        executorService.submit(
            () -> {
              System.out.println("Starting");
              try {
                Thread.sleep(500);
              } catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
              System.out.println("Finished");

              Random random = new Random();
              int randomValue = random.nextInt(9);
              if (randomValue < 5) {
                throw new Exception("Something bad happened");
              }
              return random.nextInt(10);
            });

    executorService.shutdown();
    try {
      System.out.println(future.get()); // get дожидается окончания выполнения потока
    } catch (InterruptedException | ExecutionException e) {
      Throwable ex = e.getCause();
      System.out.println(ex.getMessage());
    }
  }
}
