package com.tw.ctoaqui;

public class DiamondExercises {

    public static void main (String[] args) {
        int n = 10;
        printUpperTriangle(n);
        printACenteredDiamond();
        printLowerTriangle(n);
    }

    private static void printUpperTriangle(int n) {
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
    }

    private static void printACenteredDiamond() {
        System.out.println("cris");
    }

    private static void printLowerTriangle(int n) {
        for(int i = 1; i < n; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (n-1)-i; k++) {
                System.out.print("*");
            }
            for(int l = n; l > i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
