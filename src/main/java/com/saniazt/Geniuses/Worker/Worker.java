package com.saniazt.Geniuses.Worker;

public class Worker {
  String name;
  String jobTitle;
  double salary;

  public Worker(String name, String jobTitle, double salary) {
    this.name = name;
    this.jobTitle = jobTitle;
    this.salary = salary;
  }

  public String info(int i) {
    return "Worker's name is "
        + name
        + " Job Title is "
        + jobTitle
        + " Salary got from the last "
        + i
        + " months is "
        + salary * i
        + " dollars.";
  }
}
