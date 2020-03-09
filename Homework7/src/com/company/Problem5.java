package com.company;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a non-negative integer: ");
        int number = scanner.nextInt();
        int dumbCounter = 0;
        for (int i = 0; number < 0; i++) {
            if (dumbCounter > 0)
                System.out.println("Who is your maths teacher?");
            else
                System.out.println("Input a non-negative integer, please");
            dumbCounter++;
            number = scanner.nextInt();
        }
        System.out.println(even(number));
    }

    static boolean even(int number) {
        boolean isEven = true;
        int zeroCounter = 0;
        while (number > 0) {
            if (number % 10 == 0) {
                zeroCounter++;
            }
            number /= 10;
        }
        if (zeroCounter % 2 != 0)
            isEven = false;
        return isEven;
    }
}

