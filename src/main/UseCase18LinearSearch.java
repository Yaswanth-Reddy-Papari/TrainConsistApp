package main;

public class UseCase18LinearSearch {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("=====================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchId = "BG309";

        // Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // -------- LINEAR SEARCH --------
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // early termination
            }
        }

        // Result
        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " FOUND");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " NOT FOUND");
        }
    }
}