package com.pgs.domain;

public class EspressoCoffee extends Coffee {

    @Override
    public Coffee prepare() {
        System.out.println("Expresso coffee is prepared");
        return new EspressoCoffee();
    }

    @Override
    public float getPrice() {
        return 190;
    }
}
