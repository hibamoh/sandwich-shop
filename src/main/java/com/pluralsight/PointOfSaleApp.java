package com.pluralsight;
import java.util.Scanner;

public class PointOfSaleApp {
    public static void main(String[] args) {
        double total;
        double regularSandwich = 5.45;
        double largeSandwich = 8.95;
        double discount = 0.00;
        double loadedReg = 1.0;
        double loadedLarge = 1.75;
        double newPrice;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What sandwich would you like? ");
        System.out.println("1. Regular - $5.45");
        System.out.println("2. Large - $8.95");
        int sandwichType = myScanner.nextInt();


        System.out.println("Do you want the sandwich loaded? (yes / no)");
        String loadedOrNot = myScanner.nextLine();

        System.out.println("1. Regular");
        System.out.println("2. Large");
        int loadedSize = myScanner.nextInt();

        System.out.println("How old are you? ");
        int age = myScanner.nextInt();

        if (age <= 17){
            discount = 0.10;
            System.out.println("you received a 10% discount");
        } else if (age >= 65) {
            discount = 0.20;
            System.out.println("you will earn a 20% discount");
        }
        else {
            System.out.println("no discount for you!");
        }


    }

    }
