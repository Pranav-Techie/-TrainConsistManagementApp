import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize train
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // UC2: Passenger bogies
        System.out.println("\n--- UC2: Passenger Bogie Operations ---");

        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        System.out.println("\nDoes Sleeper exist? " + passengerBogies.contains("Sleeper"));

        // UC3: Unique Bogie IDs using HashSet
        System.out.println("\n--- UC3: Unique Bogie ID Tracking ---");

        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique IDs
        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);
    }
}