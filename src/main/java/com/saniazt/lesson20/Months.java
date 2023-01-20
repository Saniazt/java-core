package com.saniazt.lesson20;

public enum Months {
    JANUARY(31,"january"), FEBRUARY(28,"feb"),MARCH(31,"mar"), APRIL(30,"apr");

   private int days;
   private String month;

    Months(int days, String month){
        this.days = days;
        this.month = month;
    }

    public int getDays() {
        return days;
    }

    public String getMonth() {
        return month;
    }
    public void foo1(){
        System.out.println(JANUARY.getMonth()+JANUARY.getDays());

    }

    }





