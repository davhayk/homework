package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = n;
        int[] arr = new int[n];
        int i = 0;
        while (k > 0) {
            arr[i] = scanner.nextInt();
            i++;
            k--;
        }
        i = 0;
        while (k < n) {
            System.out.println("Element " + i + " = " + arr[i]);
            i++;
            k++;
        }
    }
}
