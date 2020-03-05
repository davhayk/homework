package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String string = scanner.next();
        System.out.println("Input the k integer");
        int k = scanner.nextInt();
        if ( k < string.length() ) {
            System.out.println(string.charAt(k));
        }
        else {
            System.out.println("Out of bounds");
        }
    }
}
