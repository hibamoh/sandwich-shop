package com.pluralsight;
import java.util.Scanner;

public class PointOfSaleApp {
    public static void main(String[] args) {
        double total;
        double regularSandwich = 5.45;
        double largeSandwich = 8.95;
        double seniorDisc = 0.20;
        double minorDisc = 0.10;
        double loadedReg = 1.0;
        double loadedLarge = 1.75;
        double newPrice;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What sandwich would you like? ");
        System.out.println("Option 1: Regular - $5.45 Option 2: Large - $8.95");
        String sandwichType = myScanner.nextLine();

        System.out.println("Do you want the sandwich loaded? (yes / no)");
        String loadedOrNot = myScanner.nextLine();

        System.out.println("1. Regular or 2. Large");
        int loadedSize = myScanner.nextInt();

        System.out.println("How old are you? ");
        int age = myScanner.nextInt();

        if (age < 17) {
            System.out.println("You receive a 10% disc");
            if (sandwichType.equalsIgnoreCase("option 1")) {
                if (loadedOrNot.equalsIgnoreCase("yes")) {
                    newPrice = ((regularSandwich + loadedReg) - (minorDisc * (regularSandwich + loadedReg)));
                    System.out.printf("your total is $%.2f%n ", newPrice);
                }
                else {
                    newPrice = ((regularSandwich - (minorDisc * regularSandwich)));
                    System.out.printf("your total is $%.2f%n ", newPrice);
                }
            }
            else if (sandwichType.equalsIgnoreCase("option 2")){
                if (loadedOrNot.equalsIgnoreCase("yes")) {
                    newPrice = ((largeSandwich + loadedLarge) - (minorDisc * (largeSandwich + loadedLarge)));
                    System.out.printf("your total is $%.2f%n ", newPrice);
            }
                else {
                    newPrice = ((largeSandwich - (minorDisc * largeSandwich)));
                    System.out.printf("your total is $%.2f%n ", newPrice);
                }


        } else if (age > 65) {
            System.out.println("You receive a 20% disc");
            if (sandwichType.equalsIgnoreCase("option 1")) {
                if (loadedOrNot.equalsIgnoreCase("yes")) {
                    newPrice = ((regularSandwich + loadedReg) - (seniorDisc * (regularSandwich + loadedReg)));
                    System.out.printf("your total is $%.2f%n ", newPrice);
                } else {
                    newPrice = (regularSandwich - (seniorDisc * minorDisc));
                    System.out.printf("your total is $%.2f%n ", newPrice);
                }

            }
        } else {
                if (sandwichType.equalsIgnoreCase("option 1")) {
                    if (loadedOrNot.equalsIgnoreCase("yes")){
                    newPrice = (regularSandwich + loadedReg);
                    System.out.printf("your total is $%.2f%n ", newPrice);
                }
            }
                else if (sandwichType.equalsIgnoreCase("option1")){
                    if (loadedOrNot.equalsIgnoreCase("yes")){
                        newPrice = (la)
                    }
                }
                }
        }
    }

