package com.pluralsight;
import java.util.Scanner;

public class PointOfSaleApp {
    public static void main(String[] args) {
        double total;
        double regularSandwich = 5.45;
        double large = 8.95;
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


        }

    }
