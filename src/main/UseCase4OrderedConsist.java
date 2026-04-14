package main;

import java.util.LinkedList;
import java.util.List;

public class UseCase4OrderedConsist {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=====================================\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // ADD bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // INSERT Pantry Car at position 2
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry at position 2:");
        System.out.println(trainConsist);

        // REMOVE first and last
        trainConsist.remove(0); // remove Engine
        trainConsist.remove(trainConsist.size() - 1); // remove Guard

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 operations completed successfully...");
    }
}