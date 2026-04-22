import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("====================================\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID (format TRN-XXXX): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (format PET-XX): ");
        String cargoCode = sc.nextLine();

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

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
