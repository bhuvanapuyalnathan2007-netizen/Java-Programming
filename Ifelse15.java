
import java.util.Scanner;
public class Ifelse15 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userCount = sc.nextInt();
        sc.nextLine(); // consume newline
        String licenseType = sc.nextLine();
        String supportLevel = sc.nextLine();
        int contractYears = sc.nextInt();

        double basePrice = 0;
        double supportFee = 0;
        double volumeDiscount = 0;
        double multiYearDiscount = 0;

        // Base price based on license type
        if (licenseType.equalsIgnoreCase("Standard")) {
            basePrice = 60;
        } else if (licenseType.equalsIgnoreCase("Professional")) {
            basePrice = 120;
        } else if (licenseType.equalsIgnoreCase("Enterprise")) {
            basePrice = 200;
        }

        // Support fee
        if (supportLevel.equalsIgnoreCase("Basic")) {
            supportFee = 10;
        } else if (supportLevel.equalsIgnoreCase("Priority")) {
            supportFee = 30;
        } else if (supportLevel.equalsIgnoreCase("Premium")) {
            supportFee = 80;
        }

        // Volume discount
        if (userCount >= 1000) {
            volumeDiscount = 35;
        } else if (userCount >= 500) {
            volumeDiscount = 20;
        } else if (userCount >= 100) {
            volumeDiscount = 15;
        } else {
            volumeDiscount = 0;
        }

        // Multi-year discount
        if (contractYears == 5) {
            multiYearDiscount = 20;
        } else if (contractYears == 3) {
            multiYearDiscount = 10;
        } else if (contractYears == 2) {
            multiYearDiscount = 5;
        } else {
            multiYearDiscount = 0;
        }

        // Price calculation
        double discountedBase = basePrice - (basePrice * volumeDiscount / 100);
        double yearlyPrice = discountedBase + supportFee;
        double finalAnnualPerUser = yearlyPrice - (yearlyPrice * multiYearDiscount / 100);

        double totalAnnualCost = finalAnnualPerUser * userCount;
        double totalContractValue = totalAnnualCost * contractYears;

        // Pricing Tier
        String pricingTier;
        if (userCount >= 1000) {
            pricingTier = "Enterprise";
        } else if (userCount >= 100) {
            pricingTier = "Mid-Market";
        } else {
            pricingTier = "Small Business";
        }

        // Output
        System.out.println("User Count: " + userCount);
        System.out.println("License Type: " + licenseType);
        System.out.println("Support Level: " + supportLevel);
        System.out.println("Contract Duration: " + contractYears + " years");
        System.out.println("Base Price Per User: $" + basePrice);
        System.out.println("Volume Discount: " + volumeDiscount + "%");
        System.out.println("Support Fee Per User: $" + supportFee);
        System.out.println("Multi-Year Discount: " + multiYearDiscount + "%");
        System.out.println("Annual Cost Per User: $" + finalAnnualPerUser);
        System.out.println("Total Annual Cost: $" + totalAnnualCost);
        System.out.println("Total Contract Value: $" + totalContractValue);
        System.out.println("Pricing Tier: " + pricingTier);

        sc.close();
    }
}

