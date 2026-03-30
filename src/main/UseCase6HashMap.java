package main;

import java.util.HashMap;
import java.util.Map;

public class UseCase6HashMap {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("=====================================\n");

        // Create HashMap
        Map<String, Integer> capacityMap = new HashMap<>();

        // ADD bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 50);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 1000);

        // DISPLAY all entries
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                               " | Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully...");
    }
}