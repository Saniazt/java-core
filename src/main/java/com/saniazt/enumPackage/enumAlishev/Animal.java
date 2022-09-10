package com.saniazt.enumPackage.enumAlishev;

public enum Animal {
  DOG("sobaka"),
  CAT("koshka"),
  FROG("lyagushka");

  private String translation;

  Animal(String translation) {
    this.translation = translation;
  }

  public String getTranslation() {
    return translation;
  }

  public String toString() {
    return "Translation:" + translation;
  }
}
