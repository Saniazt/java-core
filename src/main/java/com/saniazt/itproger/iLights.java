package com.saniazt.itproger;

public interface iLights {

  //   boolean isOn = false; // изначально фары выключены
  // все поля в интерфейсах автомат final

  void setLights(boolean set);

  void blinkLight();
}
