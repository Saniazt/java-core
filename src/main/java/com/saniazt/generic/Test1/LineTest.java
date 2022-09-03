package com.saniazt.generic.Test1;

public interface LineTest<TL extends Number> {
  void SetLineCord(TL x, TL y);

  TL GetLineCords(TestLineCord type1);
}
