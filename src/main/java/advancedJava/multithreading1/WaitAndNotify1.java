package advancedJava.multithreading1;

import java.util.LinkedList;
import java.util.Queue;

public class WaitAndNotify1 {

  public static void main(String[] args) throws InterruptedException {
    ProducerConsumer pc = new ProducerConsumer();

    Thread thread1 =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  pc.produce();
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
                  pc.consume();
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
}

class ProducerConsumer {
  private Queue<Integer> queue =
      new LinkedList<>(); // в отличии от ArrayBlockingQueue - не потокобезопасна
  private final int LIMIT = 10; // макс кол-во элементов в нашей очереди
  private final Object lock = new Object(); // будем синхронизироваться на этом обьекте

  public void produce() throws InterruptedException { // здесь будем закидывать новые число
    int value = 0;
    while (true) {
      synchronized (lock) {
        while (queue.size() == LIMIT) {
          lock.wait();
        }
        queue.offer(value++);
        lock.notify();
      }
    }
  }

  public void consume() throws InterruptedException { // будем числа вынимать из очереди
    while (true) {
      synchronized (lock) {
        while (queue.size() == 0) {
          lock.wait();
        }
        int value = queue.poll();
        System.out.println(value);
        System.out.println("Queue size is: " + queue.size());
        lock.notify();
      }
      Thread.sleep(1000);
    }
  }
}
