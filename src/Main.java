import java.util.*;

public class Main {

    // Goods Bogie class
    static class GoodsBogie {
        private String type;   // Cylindrical / Open / Box
        private String cargo;  // Petroleum / Coal / Grain

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return type + " | Cargo: " + cargo;
        }
    }

    public static void main(String[] args) {

        // Sample data
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // ❌ Try invalid case:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // ✅ UC12: Safety Check
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        // Rule:
                        // If Cylindrical → must be Petroleum
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Output
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}