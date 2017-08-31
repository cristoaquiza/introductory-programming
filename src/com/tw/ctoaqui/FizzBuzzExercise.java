package com.tw.ctoaqui;

public class FizzBuzzExercise {

    public static void main(String[] args) {
        countFizzBuzz();
    }

    private static void countFizzBuzz() {
        for(int i = 1; i <= 100; i++) {
            if(isFizzBuzz(i)) {
                System.out.println("FizzBuzz");
            } else if(isFizz(i)) {
                System.out.println("Fizz");
            } else if(isBuzz(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isFizzBuzz(int number) {
        if(number%3 == 0 && number%5 == 0) {
            return true;
        }
        return false;
    }

    private static boolean isFizz(int number) {
        if(number%3 == 0) {
            return true;
        }
        return false;
    }

    private static boolean isBuzz(int number) {
        if(number%5 == 0) {
            return true;
        }
        return false;
    }
}
