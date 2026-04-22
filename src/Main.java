import java.util.ArrayList;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after adding
        System.out.println("After adding bogies: " + passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists");
        } else {
            System.out.println("Sleeper bogie not found");
        }

        // Final state
        System.out.println("Final bogie list: " + passengerBogies);
    }
}