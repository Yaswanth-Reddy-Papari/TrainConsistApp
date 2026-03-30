package main;

import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create empty train consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully.");

        // Display initial count
        System.out.println("Number of bogies: " + trainConsist.size());

        // Display consist summary
        if (trainConsist.isEmpty()) {
            System.out.println("Consist Summary: EMPTY");
        }
    }
}