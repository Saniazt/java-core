package com.saniazt.enumPackage;

public enum GeomType {
  POINT("point"),
  LINE("line"),
  TRIANGLE("triangle"),
  RECTANGLE("rectangle"),
  ELlIPSE("ellipse");

  private String value;

  GeomType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
