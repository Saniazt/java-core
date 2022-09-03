package com.saniazt.generic.Test1;

public interface PersonInfo<TInfo, TInfo2> {

  void setNameTest(TInfo name);

  void setAgeTest(TInfo2 age);

  String GetFullInfo1();
}
