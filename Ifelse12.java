    import java.util.Scanner;
    public class Ifelse12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        String vehicleType, drivingRecord, coverage;
        double basePremium = 0;

        // Input
        System.out.print("Enter Driver Age: ");
        age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Vehicle Type (Sports/Sedan/SUV): ");
        vehicleType = sc.nextLine();

        System.out.print("Enter Driving Record (Clean/Minor-Violations/Major-Violations): ");
        drivingRecord = sc.nextLine();

        System.out.print("Enter Coverage Level (Basic/Comprehensive): ");
        coverage = sc.nextLine();

        // Base Premium based on vehicle type
        if (vehicleType.equalsIgnoreCase("Sports")) {
            basePremium = 1500;
        } else if (vehicleType.equalsIgnoreCase("SUV")) {
            basePremium = 1200;
        } else {
            basePremium = 1000; // Sedan or default
        }

        // Age adjustment
        if (age < 25) {
            basePremium += 500;
        } else if (age > 60) {
            basePremium += 300;
        }

        // Driving record adjustment
        if (drivingRecord.equalsIgnoreCase("Minor-Violations")) {
            basePremium += 200;
        } else if (drivingRecord.equalsIgnoreCase("Major-Violations")) {
            basePremium += 500;
        }

        // Coverage adjustment
        if (coverage.equalsIgnoreCase("Comprehensive")) {
            basePremium += 300;
        }

        // Output
        System.out.println("\nOutput:");
        System.out.println("Driver Age: " + age);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Driving Record: " + drivingRecord);
        System.out.println("Coverage Level: " + coverage);
        System.out.println("Base Premium: $" + basePremium);

        sc.close();
    }
}

