package com.saniazt.test;

public class Ytube5 {
    // Массивы
    public static void main(String[] args) {
        float[] name = new float[]{23.23f,34.23f,56.45f};
        System.out.println(name[1]);
       //   а можно было и отдельно строкой: name = new int[5];
        // значит что выделено памяти под 5 элементов;
        // в массивах отчет начинается с нуля
       // name[0] = 23 и тд, можно и так записывать каждый элемент
        // у нас в массиве 5 элементов НО отчет идет с НУЛЯ: 0,1,2,3,4
    }
}
