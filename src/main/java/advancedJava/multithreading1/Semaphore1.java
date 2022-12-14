package advancedJava.multithreading1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphore1 {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(200);
    Connection connection = Connection.getConnection();
    for (int i = 0; i < 200; i++) {
      executorService.submit(
          new Runnable() {
            @Override
            public void run() {
              try {
                connection.work();
              } catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
            }
          });
    }
    executorService.shutdown(); // закончили давать задания в наш executorService
    executorService.awaitTermination(1, TimeUnit.DAYS);
  }
}

class Connection { // Singleton
  private static Connection connection = new Connection();
  private int connectionCount = 0;
  private Semaphore semaphore = new Semaphore(10);

  private Connection() {}

  public static Connection getConnection() {
    return connection;
  }

  public void work() throws InterruptedException {
    semaphore.acquire();
    try {
      doWork();
    } finally {
      semaphore.release(); // если doWork кинет исключение - semaphore все равно выполнится
    }
  }

  private void doWork() throws InterruptedException {
    synchronized (this) {
      connectionCount++;
      System.out.println(connectionCount);
    }
    Thread.sleep(5000); // проделали полезную работу
    synchronized (this) {
      connectionCount--;
    }
  }
}
