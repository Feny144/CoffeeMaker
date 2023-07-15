package com.pgs.domain;

public class LatteCoffee extends Coffee {

    public Coffee prepare() {
        System.out.println("Mocha coffee is prepared");
        return new LatteCoffee();
    }

    public float getPrice() {
        return 150;
    }
}
