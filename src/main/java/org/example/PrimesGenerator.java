package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimesGenerator {
    private List<Integer> primes;

    public PrimesGenerator(int N) {
        primes = new ArrayList<>();
        generatePrimes(N);
    }

    private void generatePrimes(int N) {
        int count = 0;
        int number = 2; // Первое простое число

        while (count < N) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Integer> iterator() {
        return primes.iterator();
    }

    public List<Integer> getPrimes() {
        return new ArrayList<>(primes);
    }

    public List<Integer> getPrimesInReverse() {
        List<Integer> reversedPrimes = new ArrayList<>(primes);
        java.util.Collections.reverse(reversedPrimes);
        return reversedPrimes;
    }
}
