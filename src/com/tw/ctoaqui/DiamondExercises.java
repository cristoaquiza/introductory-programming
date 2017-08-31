package com.tw.ctoaqui;

public class DiamondExercises {

    public static void main (String[] args) {
        int n = 3;
        for (int i = 0; i < n-1; i++) {
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

        for(int m = 0; m < n; m++) {
            for (int p = 1; p < m+1; p++) {
                System.out.print(" ");
            }
            for (int q = 0; q < (n-1)-m; q++) {
                System.out.print("*");
            }
            for(int r = n; r > m; r--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
