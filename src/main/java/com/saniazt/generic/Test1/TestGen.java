package com.saniazt.generic.Test1;

public class TestGen<T extends Number, T2, T3> implements LineTest<T>, PersonInfo<T2, T3> {
  private T firstNum;
  private T secondNum;
  private T x;
  private T y;
  private T2 name;
  private T3 age;

  public TestGen(T firstNum, T secondNum) {
    this.firstNum = firstNum;
    this.secondNum = secondNum;
  }

  public void summ() {
    System.out.println("Summ is " + (firstNum.intValue() + secondNum.intValue()));
  }

  @Override
  public void SetLineCord(T x, T y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public T GetLineCords(TestLineCord type1) {
    return type1 == TestLineCord.Coord_1 ? x : y;
  }

  @Override
  public void setNameTest(T2 name) {
    this.name = name;
  }

  @Override
  public void setAgeTest(T3 age) {
    this.age = age;
  }

  public TestGen(T2 name, T3 age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String GetFullInfo1() {
    return "Your name is " + name + " and you are " + age + " years old";
  }
}
