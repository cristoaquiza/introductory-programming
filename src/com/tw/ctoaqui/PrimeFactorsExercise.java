package com.tw.ctoaqui;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsExercise {

    public static void main(String[] args) {
        int number = 30;
        for (Integer factor: generatePrimeFactors(number)) {
            System.out.print(factor + ", ");
        }
    }

    private static List<Integer> generatePrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        for(int i = 2; i <= number; i++) {
            while(number%i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        return primeFactors;
    }
}
