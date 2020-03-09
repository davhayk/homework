package com.company;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 20, 30, 15, 60};
        int n = 30;
        System.out.println("The index is: " + funct(arr, n));
    }

    static int funct (int[] arr, int integer) {
        boolean isFound = false;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == integer) {
                isFound = true;
                break;
            }
        }
        if (isFound)
            return i;
        else
            return -1;
    }
}
