import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 2: Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        // (Optional) Add goods bogie capacities
        bogieCapacityMap.put("Cargo Rectangular", 100);
        bogieCapacityMap.put("Cargo Cylindrical", 120);

        // Step 3: Display all bogie-capacity mappings
        System.out.println("Train Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Step 4: Example lookup (important concept)
        String searchBogie = "Sleeper";
        System.out.println("\nCapacity of " + searchBogie + ": " +
                bogieCapacityMap.get(searchBogie));
    }
}