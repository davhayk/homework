package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a non-negative integer: ");
        int number = scanner.nextInt();
        int dumbCounter = 0;
        for (; number < 0;) {
            if (dumbCounter > 0)
                System.out.println("Go learn maths, u dumb");
            else
            System.out.println("I said input a NON-NEGATIVE integer (the integer must be bigger than 0");
            dumbCounter++;
            number = scanner.nextInt();
        }
        System.out.println("The sum is: " + digitsSum(number));
    }

    static int digitsSum (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
