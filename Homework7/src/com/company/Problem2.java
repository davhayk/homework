package com.company;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.println("The percentage is: " + incOrDecPercentage(a, b) + "%");
    }

    static int incOrDecPercentage (int a, int b) {
        int percentage = ( a - b ) * 100 / a;
        if ( a > b )
            percentage = - percentage;
        return percentage;
    }
}
