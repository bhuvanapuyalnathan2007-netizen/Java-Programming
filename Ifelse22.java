import java.util.Scanner;
public class Ifelse22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        sc.nextLine(); 
        String customerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();

        double rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0;

        
        if (customerType.equalsIgnoreCase("Residential")) {
            rate1 = 0.10;
            rate2 = 0.15;
            rate3 = 0.25;
            rate4 = 0.30;
        } else if (customerType.equalsIgnoreCase("Commercial")) {
            rate1 = 0.12;
            rate2 = 0.18;
            rate3 = 0.25;
            rate4 = 0.25;
        } else if (customerType.equalsIgnoreCase("Industrial")) {
            rate1 = 0.08;
            rate2 = 0.12;
            rate3 = 0.20;
            rate4 = 0.20;
        }

        
        double tier1 = 0, tier2 = 0, tier3 = 0, tier4 = 0;

        if (units > 0) {
            if (units <= 100) {
                tier1 = units * rate1;
            } else {
                tier1 = 100 * rate1;

                if (units <= 300) {
                    tier2 = (units - 100) * rate2;
                } else {
                    tier2 = 200 * rate2;

                    if (units <= 500) {
                        tier3 = (units - 300) * rate3;
                    } else {
                        tier3 = 200 * rate3;
                        tier4 = (units - 500) * rate4;
                    }
                }
            }
        }

        double subtotal = tier1 + tier2 + tier3 + tier4;

        
        int seasonalPercent = 0;
        if (season.equalsIgnoreCase("Summer")) {
            seasonalPercent = 15;
        } else if (season.equalsIgnoreCase("Winter")) {
            seasonalPercent = -10;
        } else {
            seasonalPercent = 0;
        }

        double seasonalAmount = subtotal * seasonalPercent / 100.0;
        double afterSeason = subtotal + seasonalAmount;

    
        int discountPercent = 0;
        if (paymentMethod.equalsIgnoreCase("Auto-Pay")) {
            discountPercent = 5;
        } else if (paymentMethod.equalsIgnoreCase("Online")) {
            discountPercent = 3;
        } else {
            discountPercent = 0;
        }

        double discountAmount = afterSeason * discountPercent / 100.0;
        double totalBill = afterSeason - discountAmount;

        double avgRate = totalBill / units;

    
        System.out.println("Units Consumed: " + units + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);

        System.out.println("Tier 1 Cost (0-100): $" + tier1);
        System.out.println("Tier 2 Cost (101-300): $" + tier2);
        System.out.println("Tier 3 Cost (301-500): $" + tier3);
        System.out.println("Tier 4 Cost (501+): $" + tier4);

        System.out.println("Seasonal Adjustment: " + seasonalPercent + "%");
        System.out.println("Payment Discount: " + discountPercent + "%");

        System.out.printf("Total Bill: $%.2f\n", totalBill);
        System.out.printf("Average Rate: $%.2f/kWh\n", avgRate);

        sc.close();
    }
}
