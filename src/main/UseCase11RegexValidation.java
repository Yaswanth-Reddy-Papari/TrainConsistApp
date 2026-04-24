package main;

import java.util.regex.Pattern;

public class UseCase11RegexValidation {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("=====================================\n");

        // Sample inputs (you can change later)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Validation
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // Output
        System.out.println("Train ID: " + trainId + " → " + (isTrainValid ? "Valid" : "Invalid"));
        System.out.println("Cargo Code: " + cargoCode + " → " + (isCargoValid ? "Valid" : "Invalid"));
    }
}