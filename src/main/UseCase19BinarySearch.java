package main;

import java.util.Arrays;

public class UseCase19BinarySearch {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("=====================================\n");

        // Create array (unsorted intentionally)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // IMPORTANT: sort before binary search
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display sorted data
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // -------- BINARY SEARCH --------
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = key.compareTo(bogieIds[mid]);

            if (compare == 0) {
                found = true;
                break;
            } else if (compare < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Result
        if (found) {
            System.out.println("\n\nBogie ID " + key + " FOUND");
        } else {
            System.out.println("\n\nBogie ID " + key + " NOT FOUND");
        }
    }
}