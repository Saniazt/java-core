package advancedJava.multithreading1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool1 {
  public static void main(String[] args) throws InterruptedException {
    long time1 = System.currentTimeMillis();
    ExecutorService executorService = Executors.newFixedThreadPool(2);

    for (int i = 0; i < 5; i++) executorService.submit(new Work(i)); // переданы задания
    executorService.shutdown(); // прекратили передачу заданий, начало выполнения заданий
    System.out.println("All tasks submitted");
    executorService.awaitTermination(1, TimeUnit.DAYS); // даем время на выполнение
    long time2 = System.currentTimeMillis();
    System.out.println("Time of works: " + (time2 - time1));
  }
}

class Work implements Runnable {
  private int id;

  public Work(int id) {
    this.id = id;
  }

  @Override
  public void run() {

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Work id is: " + id);
  }
}
