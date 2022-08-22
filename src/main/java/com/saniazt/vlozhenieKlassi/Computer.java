package com.saniazt.vlozhenieKlassi;

public class Computer {
  class Preccessor {

    private boolean isStart = false;

    public void start() {
      isStart = true;
    }

    public void shutdown() {
      isStart = false;
    }
  }

  class RAM {
    private boolean isStart = false;

    public void start() {
      isStart = true;
      System.out.println("isStart = " + isStart);
    }

    public void shutdown() {
      isStart = false;
      System.out.println("isStart = " + isStart);
    }
  }

  Preccessor i7 = new Preccessor();
  RAM transfer = new RAM();
}
