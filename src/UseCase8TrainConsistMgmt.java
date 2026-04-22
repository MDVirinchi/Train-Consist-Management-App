import java.util.*;
import java.util.stream.*;

public class UseCase8TrainConsistMgmt {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("UC8 - Filter Passengers by Capacity");
        System.out.println("====================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("Second Sitting", 65));

        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("Bogies with capacity > 60:");
        filtered.forEach(System.out::println);
    }
}
