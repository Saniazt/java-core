package com.saniazt.generic.interfaces;

public class Point2<TT> implements GeomInterface<TT> {
  private TT x, y;

  public void setCords(TT x, TT y) {
    this.x = x;
    this.y = y;
  }

  public TT getCords(TypeCoord type) {
    return (type == TypeCoord.COORD_X) ? x : y;
  }
}
