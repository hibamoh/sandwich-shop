package com.pluralsight;
import java.util.Scanner;

public class PointOfSaleApp {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What sandwich would you like? ");
        System.out.println("Option 1: Regular - $5.45 Option 2: Large - $8.95");
        String sandwichType = myScanner.nextLine();

        System.out.println("How old are you? ");
        int age = myScanner.nextInt();

        if(age < 17){
            System.out.println("You receive a 10% disc");
            if(sandwichType.equalsIgnoreCase("option 1")){
                System.out.println("Your total is $" + (0.10 * 5.45));

            }

        }


    }
}
