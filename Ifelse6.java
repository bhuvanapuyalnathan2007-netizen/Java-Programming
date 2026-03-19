    import java.util.Scanner;
public class Ifelse6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookingClass = sc.nextLine();
        int daysUntilDeparture = sc.nextInt();
        double seatAvailability = sc.nextDouble();
        sc.nextLine(); // consume newline
        String routeType = sc.nextLine();

        double basePrice = 0.0;
        double multiplier = 1.0;
        double finalPrice;
        String category = "";

        // 1. Base Price Calculation (Nested If)
        if (bookingClass.equalsIgnoreCase("Economy")) {

            if (routeType.equalsIgnoreCase("Domestic")) {
                basePrice = 200.0;
            } else if (routeType.equalsIgnoreCase("International-Short")) {
                basePrice = 500.0;
            } else if (routeType.equalsIgnoreCase("International-Long")) {
                basePrice = 800.0;
            }

        } else if (bookingClass.equalsIgnoreCase("Business")) {

            if (routeType.equalsIgnoreCase("Domestic")) {
                basePrice = 600.0;
            } else if (routeType.equalsIgnoreCase("International-Short")) {
                basePrice = 1500.0;
            } else if (routeType.equalsIgnoreCase("International-Long")) {
                basePrice = 2500.0;
            }

        } else if (bookingClass.equalsIgnoreCase("First")) {

            if (routeType.equalsIgnoreCase("Domestic")) {
                basePrice = 1000.0;
            } else if (routeType.equalsIgnoreCase("International-Short")) {
                basePrice = 3000.0;
            } else if (routeType.equalsIgnoreCase("International-Long")) {
                basePrice = 5000.0;
            }
        }

        // 2. Demand Multiplier (Nested If)
        if (seatAvailability < 30 && daysUntilDeparture < 14) {
            multiplier = 1.8;
            category = "High Demand";
        } else if (seatAvailability < 50 && daysUntilDeparture < 30) {
            multiplier = 1.5;
            category = "High Demand";
        } else if (seatAvailability < 60 || (daysUntilDeparture >= 30 && daysUntilDeparture <= 60)) {
            multiplier = 1.0;
            category = "Moderate";
        } else if (seatAvailability >= 60 && daysUntilDeparture > 60) {
            multiplier = 0.8;
            category = "Low Demand";
        }

        // Final Price
        finalPrice = basePrice * multiplier;

        // Output
        System.out.println("Booking Class: " + bookingClass);
        System.out.println("Days Until Departure: " + daysUntilDeparture);
        System.out.println("Seat Availability: " + seatAvailability + "%");
        System.out.println("Route Type: " + routeType);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Demand Multiplier: " + multiplier + "x");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Pricing Category: " + category);
    }
}

