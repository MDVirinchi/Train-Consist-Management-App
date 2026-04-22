import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCase7TrainConsistMgmt {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

public class TrainCon {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Step 3: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Step 4: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 5: Display sorted bogies
        System.out.println("Sorted Bogies by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Program continues...
    }
}
}
