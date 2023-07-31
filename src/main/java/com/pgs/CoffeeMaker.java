package com.pgs;

import com.pgs.domain.Coffee;
import com.pgs.domain.EspressoCoffee;
import com.pgs.domain.LatteCoffee;
import com.pgs.domain.MochaCoffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMaker {
    public static void main(String[] args) {
        System.out.println("1: Latte");
        System.out.println("2: Mocha:");
        System.out.println("3: Espresso:");
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
                coffee = new EspressoCoffee();
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

class Test {


    public static void main(String[] args) {
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new LatteCoffee());
        coffees.add(new EspressoCoffee());
        for (Coffee c: coffees) {
            System.out.println(c);
        }
        coffees.forEach(c -> {
            System.out.println(c);
        });

        for (int i = 0; i < coffees.size() ; i++) {

        }

    }
}
