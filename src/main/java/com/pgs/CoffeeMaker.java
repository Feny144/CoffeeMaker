package com.pgs;

import com.pgs.domain.Coffee;
import com.pgs.domain.ExpressoCoffee;
import com.pgs.domain.LatteCoffee;
import com.pgs.domain.MochaCoffee;

import java.util.Scanner;

public class CoffeeMaker {
    public static void main(String[] args) {
        System.out.println("1: Latte");
        System.out.println("2: Mocha:");
        System.out.println("3: Expresso:");
        System.out.println("5: Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        int num = scanner.nextInt();
        Coffee coffee = null;
        LatteCoffee latteCoffee = new LatteCoffee();
        switch (num) {
            case 1:
                coffee = new LatteCoffee();
                break;
            case 2:
                coffee = new MochaCoffee();
                break;
            case 3:
                coffee = new ExpressoCoffee();
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }
        coffee.prepare();
        float price = coffee.getPrice();
        coffee.successMessage(price);
    }
}
