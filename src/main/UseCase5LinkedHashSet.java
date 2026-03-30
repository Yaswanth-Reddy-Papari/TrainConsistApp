package main;

import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5LinkedHashSet {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=====================================\n");

        // LinkedHashSet → maintains order + uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ADD bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate attempt
        formation.add("Sleeper");

        // DISPLAY
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nUC5 operations completed successfully...");
    }
}