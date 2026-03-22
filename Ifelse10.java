import java.util.Scanner;
public class Ifelse10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String timeOfDay = sc.nextLine();
        double powerConsumption = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        sc.nextLine(); // consume newline
        String rateTier = sc.nextLine();

        double baseRate = 0;
        double rateMultiplier = 0;
        double renewableCredit;
        double totalCost;
        double potentialSavings = 0;
        String recommendation = "";

        // 1. Base Rate by Tier
        if (rateTier.equals("Basic")) {
            baseRate = 0.18;
        } else if (rateTier.equals("Time-of-Use")) {
            baseRate = 0.15;
        } else if (rateTier.equals("Premium-Green")) {
            baseRate = 0.12;
        }

        // 2. Rate Multiplier (Nested if-else)
        if (timeOfDay.equals("Peak")) {
            if (rateTier.equals("Time-of-Use")) {
                rateMultiplier = 1.8;
            } else {
                rateMultiplier = 1.5;
            }
        } else if (timeOfDay.equals("Off-Peak")) {
            if (rateTier.equals("Time-of-Use")) {
                rateMultiplier = 0.8;
            } else {
                rateMultiplier = 1.0;
            }
        } else if (timeOfDay.equals("Super-Off-Peak")) {
            if (rateTier.equals("Premium-Green")) {
                rateMultiplier = 0.6;
            } else {
                rateMultiplier = 0.5;
            }
        }

        // 3. Renewable Credit
        renewableCredit = (powerConsumption * renewablePercentage / 100) * baseRate;

        // 4. Total Cost
        totalCost = (powerConsumption * baseRate * rateMultiplier) - renewableCredit;
        if (totalCost < 0) {
            totalCost = 0.0;
        }

        // 5. Recommendations (Nested conditions)
        if (timeOfDay.equals("Peak") && renewablePercentage < 30) {
            recommendation = "Shift high-power appliances to Off-Peak hours";
            potentialSavings = powerConsumption * baseRate * (rateMultiplier - 0.8);
        } 
        else if (renewablePercentage >= 50) {
            recommendation = "Excellent! Maximize appliance use during this period";
            potentialSavings = 0.0;
        } 
        else if (rateTier.equals("Basic") && powerConsumption > 20) {
            recommendation = "Consider upgrading to Time-of-Use plan";
            potentialSavings = powerConsumption * (0.18 - 0.15);
        } 
        else if (timeOfDay.equals("Peak") && renewablePercentage >= 70) {
            recommendation = "Great renewable usage! Minor peak reduction possible";
            potentialSavings = powerConsumption * baseRate * 0.2;
        } 
        else if (timeOfDay.equals("Off-Peak") && rateTier.equals("Time-of-Use")) {
            recommendation = "Good timing! Consider increasing renewable capacity";
            potentialSavings = 0.0;
        }

        // Output
        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.printf("Base Rate: $%.2f/kWh\n", baseRate);
        System.out.printf("Rate Multiplier: %.1fx\n", rateMultiplier);
        System.out.printf("Renewable Credit: $%.2f\n", renewableCredit);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.printf("Potential Savings: $%.2f\n", potentialSavings);

        sc.close();
    }
}