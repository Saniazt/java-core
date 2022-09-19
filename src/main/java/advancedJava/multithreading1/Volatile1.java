package advancedJava.multithreading1;

import java.util.Scanner;

public class Volatile1 {
  public static void main(String[] args) {
    ThreadForVolatile threadForVolatile = new ThreadForVolatile();
    threadForVolatile.start();

    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    threadForVolatile.shotDown();
  }
}

class ThreadForVolatile extends Thread {
  private volatile boolean running = true; // гарантирует когерентность(совпадение) кэшей

  public void run() {
    while (running) {
      System.out.println("Hello");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public void shotDown() {
    this.running = false;
  }
}
