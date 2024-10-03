package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Иван", "Иванов", 25));
        humans.add(new Human("Петр", "Сидоров", 30));
        humans.add(new Human("Анна", "Петрова", 22));
        humans.add(new Human("Мария", "Кузнецова", 28));

        Set<Human> humanSet = new HashSet<>(humans);

        System.out.println("Содержимое HashSet:");
        for (Human human : humanSet) {
            System.out.println(human);
        }

        Set<Human> linkedHumanSet = new LinkedHashSet<>(humans);

        System.out.println("\nСодержимое LinkedHashSet:");
        for (Human human : linkedHumanSet) {
            System.out.println(human);
        }
    }
}

