package advancedJava.multithreading1;

public class MultithreadingStartInfo {
  public static void main(String[] args) throws InterruptedException {
    //    MyThread myThread = new MyThread();
    //    myThread.start();
    //
    //    Thread.sleep(1000);
    //
    //    MyThread myThread2 = new MyThread();
    //    myThread2.start();
    Thread thread = new Thread(new Runner());
    thread.start();
    System.out.println("Hello from Main Thread");
  }
}

class Runner implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("Hello from my Thread!" + i);
    }
  }
}

class MyThread extends Thread { // первый способ создания потока
  public void run() {
    for (int i = 0; i < 1000; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("Hello from my Thread!" + i);
    }
  }
}
