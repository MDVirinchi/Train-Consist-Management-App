import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {
    public static void main(String[] args) {

        class Bogie {
            private String name;
            private int capacity;

            public Bogie(String name, int capacity) {
                this.name = name;
                this.capacity = capacity;
            }

            public String getName() { return name; }
            public int getCapacity() { return capacity; }
        }

        class Train {
            private Map<String, Bogie> bogieMap = new HashMap<>();

            public void addBogie(String name, int capacity) {
                bogieMap.put(name, new Bogie(name, capacity));
            }

            public void displayBogies() {
                for (Map.Entry<String, Bogie> entry : bogieMap.entrySet()) {
                    Bogie b = entry.getValue();
                    System.out.println("Bogie: " + b.getName() + " | Capacity: " + b.getCapacity());
                }
            }

            public int getTotalCapacity() {
                int total = 0;
                for (Bogie b : bogieMap.values()) {
                    total += b.getCapacity();
                }
                return total;
            }
        }

        System.out.println("======================================");
        System.out.println(" Train Consist Management ");
        System.out.println("======================================");

        Train train = new Train();

        train.addBogie("Sleeper", 72);
        train.addBogie("AC Chair", 78);
        train.addBogie("First Class", 24);
        train.addBogie("General", 90);

        train.displayBogies();

        System.out.println("Total Capacity: " + train.getTotalCapacity());
    }
}
