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

        // Контрольный вывод
        System.out.print("Массив из " + N + " случайных чисел: ");
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

        System.out.println("Список на основе массива: " + list);

        return list;
    }

    public static void sortList(List<Integer> list) {
        Collections.sort(list);

        System.out.println("Отсортированный список по возрастанию: " + list);
    }

    public static void sortListInReverseOrder(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Отсортированный список в обратном порядке: " + list);
    }

    public static void shuffleList(List<Integer> list) {
        Collections.shuffle(list);

        System.out.println("Перемешанный список: " + list);
    }

    public static void rotateListByOne(List<Integer> list) {
        Collections.rotate(list, 1);

        System.out.println("Список после циклического сдвига на 1 элемент: " + list);
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

        System.out.println("Список с уникальными элементами: " + uniqueList);

        return uniqueList;
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

        System.out.println("Список с дублирующимися элементами: " + duplicatesList);

        return duplicatesList;
    }

    public static int[] convertListToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        System.out.print("Массив на основе списка: ");
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

        System.out.println("Количество вхождений каждого числа в массиве:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Число " + entry.getKey() + " встречается " + entry.getValue() + " раз(а).");
        }
    }

    public static void main(String[] args) {
        int[] randomArray = createRandomArray(10);


        List<Integer> list = convertArrayToList(randomArray);

        sortList(list);

        sortListInReverseOrder(list);

        shuffleList(list);

        rotateListByOne(list);

        list = removeDuplicates(list);

        list = keepDuplicates(list);

        int[] finalArray = convertListToArray(list);

        countOccurrences(finalArray);
    }
}
