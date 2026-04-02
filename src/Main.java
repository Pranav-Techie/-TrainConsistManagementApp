import java.util.*;
import java.util.regex.*;

public class Main {

    // Bogie class (same as before)
    static class Bogie {
        private String type;
        private int capacity;

        public Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 User Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // ✅ Regex Patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // ✅ Compile Patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // ✅ Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // ✅ Validation
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        sc.close();
    }
}