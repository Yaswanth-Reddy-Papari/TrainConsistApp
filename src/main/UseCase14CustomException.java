package main;

public class UseCase14CustomException {

    // -------- CUSTOM EXCEPTION --------
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // -------- PASSENGER BOGIE --------
    static class PassengerBogie {
        String type;
        int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            // VALIDATION (fail-fast)
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }

        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC14 - Custom Exception Validation");
        System.out.println("=====================================\n");

        try {
            // VALID case
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            // INVALID case (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}