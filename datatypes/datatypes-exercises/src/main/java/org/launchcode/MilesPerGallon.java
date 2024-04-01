package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter the amount of gas you have consumed: ");
        double gas = input.nextDouble();
        input.close();

        double milesPerGas = miles / gas;
        System.out.println("The consume is " + milesPerGas + " mpg.");

    }
}
