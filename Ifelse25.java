import java.util.Scanner;

public class Ifelse25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dataGB = sc.nextDouble();
        int callMinutes = sc.nextInt();
        sc.nextLine(); 
        String internationalUsage = sc.nextLine();
        String deviceType = sc.nextLine();

        String planName = "";
        String planCategory = "";
        double baseCost = 0.0;
        double dataLimit = 0.0;
        int callLimit = 0;

        double dataOverage = 0.0;
        double callOverage = 0.0;
        double intlFee = 0.0;
        double deviceFee = 0.0;
        double savings = 0.0;

        
        if (dataGB <= 2) {
            planName = "Basic 2GB";
            baseCost = 25.0;
            dataLimit = 2;
            callLimit = 500;
            planCategory = "Budget";
        } else if (dataGB <= 5) {
            planName = "Standard 5GB";
            baseCost = 40.0;
            dataLimit = 5;
            callLimit = 1000;
            planCategory = "Standard";
        } else if (dataGB <= 25) {
            planName = "Premium Unlimited";
            baseCost = 70.0;
            dataLimit = Double.MAX_VALUE;
            callLimit = Integer.MAX_VALUE;
            planCategory = "Premium";
        } else {
            planName = "Unlimited Max";
            baseCost = 90.0;
            dataLimit = Double.MAX_VALUE;
            callLimit = Integer.MAX_VALUE;
            planCategory = "Unlimited";
        }

    
        if (dataGB > dataLimit && dataLimit != Double.MAX_VALUE) {
            dataOverage = (dataGB - dataLimit) * 10;
        }

    
        if (callMinutes > callLimit && callLimit != Integer.MAX_VALUE) {
            callOverage = (callMinutes - callLimit) * 0.05;
        }

    
        if (internationalUsage.equalsIgnoreCase("None")) {
            intlFee = 0;
        } else if (internationalUsage.equalsIgnoreCase("Light")) {
            intlFee = 5;
        } else if (internationalUsage.equalsIgnoreCase("Moderate")) {
            intlFee = 15;
        } else if (internationalUsage.equalsIgnoreCase("Heavy")) {
            intlFee = 30;
        }

        
        if (deviceType.equalsIgnoreCase("Basic")) {
            deviceFee = 0;
        } else if (deviceType.equalsIgnoreCase("Smartphone")) {
            deviceFee = 10;
        } else if (deviceType.equalsIgnoreCase("Tablet")) {
            deviceFee = 10;
        } else if (deviceType.equalsIgnoreCase("Hotspot")) {
            deviceFee = 20;
        }

        
        double totalCost = baseCost + dataOverage + callOverage + intlFee + deviceFee;

        
        if (planName.equals("Standard 5GB") && dataGB > 5) {
            savings = 5.0; 
        }

        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + internationalUsage);
        System.out.println("Device Type: " + deviceType);
        System.out.println("Recommended Plan: " + planName);

        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + intlFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + totalCost);
        System.out.println("Potential Savings: $" + savings);
        System.out.println("Plan Category: " + planCategory);

        sc.close();
    }
}