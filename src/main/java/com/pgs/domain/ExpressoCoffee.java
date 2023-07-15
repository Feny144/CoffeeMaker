package com.pgs.domain;

public class ExpressoCoffee extends Coffee {

    @Override
    public Coffee prepare() {
        System.out.println("Expresso coffee is prepared");
        return new ExpressoCoffee();
    }

    @Override
    public float getPrice() {
        return 190;
    }
}
