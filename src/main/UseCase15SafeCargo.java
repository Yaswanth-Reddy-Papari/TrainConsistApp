package main;

public class UseCase15SafeCargo {

    // -------- CUSTOM RUNTIME EXCEPTION --------
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // -------- GOODS BOGIE --------
    static class GoodsBogie {
        String shape;
        String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {

            try {
                // RULE: Rectangular cannot carry Petroleum
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo: Petroleum cannot be assigned to Rectangular bogie");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + shape + " -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed for: " + shape);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("=====================================\n");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // SAFE case
        b1.assignCargo("Petroleum");

        System.out.println();

        // UNSAFE case
        b2.assignCargo("Petroleum");

        System.out.println("\nProgram continues safely...");
    }
}