package com.saniazt.innerClass;

public class MainForBicycle {
    public static void main(String[] args) {
        Bicycle ukraine = new Bicycle("Ukraine",75,109.3);
        Bicycle.HandleBar handleBar = ukraine.new HandleBar();
        Bicycle.Seat seat = ukraine.new Seat();
        Bicycle.Korzina korzina = ukraine.new Korzina();

        ukraine.start();
        seat.up();
        handleBar.left();
        handleBar.right();
        korzina.not_take();

    }
}
