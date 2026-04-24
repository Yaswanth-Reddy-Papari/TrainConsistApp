package main;

public class UseCase20SearchValidation {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("=====================================\n");

        // Empty bogie list (important for this use case)
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        try {
            // -------- FAIL-FAST VALIDATION --------
            if (bogieIds.length == 0) {
                throw new IllegalStateException("Cannot perform search: No bogies available");
            }

            // -------- SEARCH LOGIC --------
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // Result
            if (found) {
                System.out.println("Bogie ID " + searchId + " FOUND");
            } else {
                System.out.println("Bogie ID " + searchId + " NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}