package com.pgs.domain;

public abstract class Coffee {
    public abstract Coffee prepare();
    public void successMessage(float price) {
        System.out.println("Your Coffee is ready. Please pay "+price+". Have a nice day!!");
    }

    public abstract float getPrice();
}
