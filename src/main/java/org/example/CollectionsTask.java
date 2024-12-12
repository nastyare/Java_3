package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CollectionsTask {

        public static int[] createRandomArray(int N) {
        Random random = new Random();
        int[] randomArray = new int[N];

        for (int i = 0; i < N; i++) {
            randomArray[i] = random.nextInt(101);
        }

        System.out.print("array of " + N + " random numbers: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        return randomArray;
    }

    public static List<Integer> convertArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int num : array) {
            list.add(num);
        }

        System.out.println("list based ont the array: " + list);

        return list;
    }

    public static void sortList(List<Integer> list) {
        Collections.sort(list);

        System.out.println("sorted list in ascending order: " + list);
    }

    public static void sortListInReverseOrder(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("sorted list in reverse order: " + list);
    }

    public static void shuffleList(List<Integer> list) {
        Collections.shuffle(list);

        System.out.println("shuffled list: " + list);
    }

    public static void rotateListByOne(List<Integer> list) {
        Collections.rotate(list, 1);

        System.out.println("list after rotating by 1 element: " + list);
    }

    public static List<Integer> keepDuplicates(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> duplicatesList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicatesList.add(entry.getKey());
            }
        }

        System.out.println("list with duplicate elements: " + duplicatesList);

        return duplicatesList;
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqueList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueList.add(entry.getKey());
            }
        }

        System.out.println("list with unique elements: " + uniqueList);

        return uniqueList;
    }

    public static int[] convertListToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        System.out.print("Array based on the list: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        return array;
    }

    public static void countOccurrences(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("count of occurrences of each number in the array:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("number " + entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        int[] randomArray = createRandomArray(10);

        List<Integer> list = convertArrayToList(randomArray);

        sortList(list);
        sortListInReverseOrder(list);
        shuffleList(list);
        rotateListByOne(list);

        List<Integer> uniqueList = new ArrayList<>(list);
        List<Integer> duplicateList = new ArrayList<>(list);

        removeDuplicates(uniqueList);
        keepDuplicates(duplicateList);

        int[] finalArray = convertListToArray(list);

        countOccurrences(finalArray);
    }

}
