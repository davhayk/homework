package com.company;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        String[] stringArr = new String[] {"acd", "katu", "shun", "ads", "wad"};
        System.out.println("The modified array is: " + modifier(stringArr));
    }
    static String[] modifier (String[] stringArr) {
        char[] temp = new char[100];
        for (int i = 0; i < stringArr.length-1; i++) {
            for (int j = stringArr[i].length()-1, k = 0; j > k; j--, k++) {
                temp = stringArr[i].toCharArray();
                temp[k] = temp[j];
            }
            stringArr[i] = Arrays.toString(temp);
        }
        return stringArr;
    }
}
