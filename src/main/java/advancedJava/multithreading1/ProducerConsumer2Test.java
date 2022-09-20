package advancedJava.multithreading1;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer2Test {
  static String s = null;
  public static BlockingQueue<String> queueMY = new ArrayBlockingQueue<>(10);

  public static void main(String[] args) throws InterruptedException {
    Thread thread1 =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  produce();
                } catch (InterruptedException e) {
                  throw new RuntimeException(e);
                }
              }
            });
    Thread thread2 =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  consume();
                } catch (InterruptedException e) {
                  throw new RuntimeException(e);
                }
              }
            });

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

  }

  public static void produce() throws InterruptedException {
    String s = null;
    int i = 0;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      queueMY.put(scanner.nextLine());
      i++;
      System.out.println("Count is: " + i);
    }
  }

  public static void consume() throws InterruptedException {
    while (true) {
      System.out.println("String is: " + queueMY.take());
    }
  }
}
