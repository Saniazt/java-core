package com.saniazt.nasledovanie.bySymin;

public class Lion extends CatFamily {
  public Lion() {
    super(2, 4, true);
  }

  @Override // CNTRL+o быстрый оверрайд(переопределение)
  public String eat() {
    System.out.print(super.eat());
    return "Meat";
  }
}
