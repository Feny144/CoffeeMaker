package com.pgs.domain;

public class MochaCoffee extends Coffee {

    public Coffee prepare() {
        System.out.println("Mocha coffee is prepared");
        return new MochaCoffee();
    }

    public float getPrice() {
        return 130.5f;
    }
}
