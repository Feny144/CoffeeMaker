package com.pgs.domain;

import org.w3c.dom.Document;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class COFFEES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        int[] CoffeePrices = {199, 299, 399};
        String[] CoffeeName = {" Espresso Coffee", " Latte Coffee", " Mocha Coffee"};
        int[] numCoffees = new int[CoffeePrices.length];

        System.out.println("---------------------------");
        System.out.println("WELCOME TO THE COFFEE SHOP");
        System.out.println("---------------------------");
        System.out.println("Here's our menu:");
        System.out.println("---------------------------");

        for (int i = 0; i < CoffeePrices.length; i++) {
            System.out.println((i + 1) + "." + CoffeeName[i] + "- ₹" + CoffeePrices[i]);
        }
        while (true) {
            System.out.println("Enter the number of coffee you,d like to order(or 0 to finish):");
            System.out.println("---------------------------------------------------------------");
            int coffeeNum = scanner.nextInt();
            if (coffeeNum == 0) {
                break;
            }
            System.out.println("Enter the quantity of the coffee you,d like to order:");
            System.out.println("------------------------------------------------------");

            int quantity = scanner.nextInt();
            numCoffees[coffeeNum - 1] += quantity;
        }
        int totalCost = 0;
        System.out.println("-----------------");
        System.out.println("Here's your Bill:");
        System.out.println("-----------------");

        for (int i = 0; i < CoffeePrices.length; i++) {
            if (numCoffees[i] > 0) {
                int coffeeCost = CoffeePrices[i] * numCoffees[i];
                System.out.println(numCoffees[i] + "" + CoffeeName[i] + "-₹" + coffeeCost);
                totalCost += coffeeCost;
            }
        }
        System.out.println("Total cost:₹" + totalCost);

    }
}
