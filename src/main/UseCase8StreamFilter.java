package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8StreamFilter {

    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("UC8 - Stream Filtering\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("All Bogies:");
        System.out.println(bogies);

        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (capacity > 60):");
        System.out.println(filtered);
    }
}
