package com.saniazt.generic.Test1;

public class MainForTestGen {
  public static void main(String[] args) {
    TestGen<Double, String, Integer> testGen = new TestGen<>(5.4, 1.4);
    testGen.summ();
    testGen.SetLineCord(5.8, 8.54);
    System.out.println(
        "So, the line distance is "
            + (testGen.GetLineCords(TestLineCord.Coord_1).doubleValue()
                + testGen.GetLineCords(TestLineCord.Coord_2).doubleValue()));
    testGen.setAgeTest(24);
    testGen.setNameTest("Sasha");
    System.out.println(testGen.GetFullInfo1());
  }
}
