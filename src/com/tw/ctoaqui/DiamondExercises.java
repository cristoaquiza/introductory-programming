package com.tw.ctoaqui;

public class DiamondExercises {

    public static void main (String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < i+1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
