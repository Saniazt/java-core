package com.saniazt.firstTest1;

import java.util.Objects;
import java.util.Scanner;

public class Calculate extends RequestTWO implements iCalculate {
    String opetainonal;
    @Override
    public void operation() {
        System.out.println("So, " + name + " what do you what to do with you numbers? (+,-,*,/)?");
        Scanner oper_scam = new Scanner(System.in);
        opetainonal = oper_scam.nextLine();
        if (Objects.equals(opetainonal, "+")){
            System.out.println("Okey, the summ of your numbers is: "+ (a+b));
        }
        if (Objects.equals(opetainonal, "-")){
            System.out.println("Okey, we have: "+ (a-b));
        }
        if (Objects.equals(opetainonal, "*")){
            System.out.println("Okey, we have: "+ (a*b));
        }
        if (Objects.equals(opetainonal, "/")){
            System.out.println("Okey, we have: "+ (a/b));
        }
    }
}
