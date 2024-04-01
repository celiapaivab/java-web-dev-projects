package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        input.close();

        double area = length * width;
        System.out.println("The rectangle area is: " + area);

    }
}
