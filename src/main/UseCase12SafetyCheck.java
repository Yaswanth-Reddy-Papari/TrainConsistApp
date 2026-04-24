package main;

import java.util.ArrayList;
import java.util.List;

public class UseCase12SafetyCheck {

    // Goods Bogie Model
    static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("=====================================\n");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Open", "Grain"));

        // Print bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // SAFETY RULE using stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                        b.cargo.equals("Petroleum")
                );

        // Output result
        System.out.println("\nSafety Status: " + (isSafe ? "SAFE" : "UNSAFE"));
    }
}