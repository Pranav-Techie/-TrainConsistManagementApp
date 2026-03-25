import java.util.LinkedHashSet;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create LinkedHashSet to store bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies in order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Train Formation:");
        System.out.println(trainFormation);

        // Step 3: Attempt to add duplicate bogie
        trainFormation.add("Sleeper");  // Duplicate (will be ignored)

        System.out.println("\nAfter attempting to add duplicate 'Sleeper':");
        System.out.println(trainFormation);

        // Step 4: Display final formation
        System.out.println("\nFinal Train Formation (No duplicates, order preserved):");
        System.out.println(trainFormation);
    }
}