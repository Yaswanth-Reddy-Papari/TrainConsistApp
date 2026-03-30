package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCase7SortBogie {

    // Inner class (important)
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("=====================================\n");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 24));

        // BEFORE SORT
        System.out.println("Before Sorting:");
        System.out.println(bogies);

        // SORT using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // AFTER SORT
        System.out.println("\nAfter Sorting by Capacity:");
        System.out.println(bogies);

        System.out.println("\nUC7 operations completed successfully...");
    }
}