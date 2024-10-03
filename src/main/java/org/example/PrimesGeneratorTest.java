package org.example;

import java.util.Iterator;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        int N = 10;
        PrimesGenerator primesGenerator = new PrimesGenerator(N);

        System.out.println("Первые " + N + " простых чисел в прямом порядке:");
        Iterator<Integer> iterator = primesGenerator.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Первые " + N + " простых чисел в обратном порядке:");
        for (Integer prime : primesGenerator.getPrimesInReverse()) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}
