package com.saniazt.generic.interfaces;

public interface GeomInterface<T> {
  void setCords(T x, T y);

  T getCords(TypeCoord type);
}
