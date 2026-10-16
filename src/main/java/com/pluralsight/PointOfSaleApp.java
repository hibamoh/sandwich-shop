package com.pluralsight;
import java.util.Scanner;

public class PointOfSaleApp {
    public static void main(String[] args) {
        double total;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What sandwich would you like? ");
        System.out.println("Option 1: Regular - $5.45 Option 2: Large - $8.95");
        String sandwichType = myScanner.nextLine();

        System.out.println("How old are you? ");
        int age = myScanner.nextInt();

        System.out.println("Do you want the sandwich loaded? (yes / no)");
        String loadedOrNot = myScanner.nextLine();

        if(age < 17){
            System.out.println("You receive a 10% disc");
            if(sandwichType.equalsIgnoreCase("option 1")){
                total = (5.45 -(0.10 * 5.45));
                System.out.printf("Your total is $%.2f%n" , total );
            }
            else {
                total = (8.95-(0.10 * 8.95));
                System.out.printf("Your total is $%.2f%n" , total);
            }
        } else if (age > 65) {
            System.out.println("You receive a 20% disc");
            if (sandwichType.equalsIgnoreCase("option 1")){
                total = (5.45-(0.20 * 5.45));
                System.out.printf("Your total is $%.2f%n" ,total );
            }
            else {
                total = (8.95-(0.20 * 8.95));
                System.out.printf("Your total is $%.2f%n" , total);
            }

        }
        else {
            if (sandwichType.equalsIgnoreCase("option 1")){
                System.out.println("Your total is $5.45");
            }
            else {
                System.out.println("Your total is $8.95");
            }
        }

    }
}
