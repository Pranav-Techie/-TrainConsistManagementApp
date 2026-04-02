import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // Bogie class inside same file
    static class Bogie {
        private String type;
        private int capacity;

        public Bogie(String type, int capacity) {
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

        // Reuse list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("First Class", 45));
        bogies.add(new Bogie("AC Chair", 65));

        // ✅ UC10: Total Seat Calculation
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);    // sum all

        System.out.println("Total Seating Capacity: " + totalSeats);

        // Verify original list unchanged
        System.out.println("Original List Size: " + bogies.size());
    }
}}