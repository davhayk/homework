package com.company;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        String[] stringArr = new String[] {"acd", "katu", "shun", "ads", "wad"};
        System.out.println("The modified array is: " + Arrays.toString(modifier(stringArr)));
    }
    static String[] modifier (String[] stringArr) {
        char tempChar;
        for (int i = 0; i < stringArr.length; i++) {
            char[] temp = stringArr[i].toCharArray();
            for (int j = stringArr[i].length()-1, k = 0; j >= k; j--, k++) {
                tempChar = temp[k];
                temp[k] = temp[j];
                temp[j] = tempChar;
            }
            stringArr[i] = new String(temp);
        }
        return stringArr;
    }
}
