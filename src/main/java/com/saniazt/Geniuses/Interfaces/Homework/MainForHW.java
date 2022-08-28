package com.saniazt.Geniuses.Interfaces.Homework;

import java.util.ArrayList;

public class MainForHW {
  public static void main(String[] args) {

    Progger misha = new Progger("Misha");
    Driver anton = new Driver("Anton");
    Cheff petya = new Cheff("Petya");
    ArrayList<Worker> workers = new ArrayList<>();
    workers.add(misha);
    workers.add(anton);
    workers.add(petya);
    for (Worker worker : workers) {
      worker.voice();
    }
    System.out.println("--------");
    System.out.print(misha.getName());
    System.out.print(". And " + misha.getName() + " is ");
    misha.canWork();
  }
}
