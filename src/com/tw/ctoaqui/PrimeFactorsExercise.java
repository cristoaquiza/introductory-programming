package com.tw.ctoaqui;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsExercise {

    public static void main(String[] args) {
        int number = 100;
        List<Integer> primeFactors = generate(number);
        for (Integer factor: primeFactors) {
            System.out.print(factor + ", ");
        }
    }

    private static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        for(int i = 2; i <= number; i++) {
            while(number%i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        return primeFactors;
    }
}
