package main;

import java.util.Arrays;

public class UseCase17ArraySort {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC17 - Sort Bogie Names using Arrays.sort()");
        System.out.println("=====================================\n");

        // Create array of bogie names
        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogies));

        // -------- BUILT-IN SORT --------
        Arrays.sort(bogies);

        // Display sorted
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogies));
    }
}