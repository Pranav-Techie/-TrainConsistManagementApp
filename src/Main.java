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

        // Reuse list (UC7/UC8)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("First Class", 45));
        bogies.add(new Bogie("AC Chair", 65));

        // ✅ UC9: Grouping using Stream API
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.getType()));

        // Display grouped result
        System.out.println("Grouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println(b);
            }
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List Size: " + bogies.size());
    }
}