import java.util.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create List of Bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 3: Sort using Comparator (ascending order)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 4: Sort in descending order (important for viva)
        bogieList.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nAfter Sorting by Capacity (Descending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}