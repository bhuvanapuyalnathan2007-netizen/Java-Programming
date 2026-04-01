import java.util.Scanner;
public class Ifelse19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String movieFormat = sc.nextLine();
        String showTime = sc.nextLine();
        String seatCategory = sc.nextLine();
        String customerType = sc.nextLine();

        double basePrice = 12.0;
        double formatSurcharge = 0.0;
        double seatUpgrade = 0.0;
        int timeAdjustment = 0;
        int customerDiscount = 0;

        
        if (movieFormat.equals("2D")) {
            formatSurcharge = 0;
        } else if (movieFormat.equals("3D")) {
            formatSurcharge = 5;
        } else if (movieFormat.equals("IMAX")) {
            formatSurcharge = 8;
        } else if (movieFormat.equals("4DX")) {
            formatSurcharge = 10;
        }

        
        if (seatCategory.equals("Standard")) {
            seatUpgrade = 0;
        } else if (seatCategory.equals("Premium")) {
            seatUpgrade = 4;
        } else if (seatCategory.equals("Recliner")) {
            seatUpgrade = 7;
        }

        
        if (showTime.equals("Matinee")) {
            timeAdjustment = -30;
        } else if (showTime.equals("Evening")) {
            timeAdjustment = 0;
        } else if (showTime.equals("Prime-Time")) {
            timeAdjustment = 20;
        } else if (showTime.equals("Late-Night")) {
            timeAdjustment = -20;
        }

    
        if (customerType.equals("Adult")) {
            customerDiscount = 0;
        } else if (customerType.equals("Senior")) {
            customerDiscount = 25;
        } else if (customerType.equals("Student")) {
            customerDiscount = 15;
        } else if (customerType.equals("Child")) {
            customerDiscount = 30;
        }

        
        double baseWithSurcharge = basePrice + formatSurcharge + seatUpgrade;
        double adjustedPrice = baseWithSurcharge * (1 + timeAdjustment / 100.0);
        double finalPrice = adjustedPrice * (1 - customerDiscount / 100.0);

        
        String voucher;
        if (showTime.equals("Matinee") || 
            customerType.equals("Senior") || 
            customerType.equals("Student") || 
            customerType.equals("Child")) {
            voucher = "Yes";
        } else {
            voucher = "No";
        }

        
        String category;
        if (finalPrice < 10) {
            category = "Value";
        } else if (finalPrice < 20) {
            category = "Standard";
        } else if (finalPrice < 30) {
            category = "Premium";
        } else {
            category = "Luxury";
        }

        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgrade);
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Customer Discount: " + customerDiscount + "%");
        System.out.printf("Final Ticket Price: $%.2f\n", finalPrice);
        System.out.println("Concession Voucher: " + voucher);
        System.out.println("Pricing Category: " + category);

        sc.close();
    }
}
    

