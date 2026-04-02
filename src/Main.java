import java.util.*;

public class Main {

    //  Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    //  Passenger Bogie Class
    static class PassengerBogie {
        private String type;
        private int capacity;

        // Constructor with validation
        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return type + " | Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            //  Valid bogies
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 60));

            //  Invalid bogie (test case)
            bogies.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}