import java.util.Scanner;

public class Ifelse18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double weight = sc.nextDouble();
        sc.nextLine(); 
        String zone = sc.nextLine();
        String speed = sc.nextLine();
        String size = sc.nextLine();

        double baseRate = 0, weightCharge, zoneMultiplier = 0, sizeCharge = 0;
        String delivery = "", service = "";

    
        if (speed.equals("Economy")) {
            baseRate = 5;
            service = "Budget";
        } else if (speed.equals("Standard")) {
            baseRate = 10;
            service = "Standard";
        } else if (speed.equals("Express")) {
            baseRate = 25;
            service = "Priority";
        } else if (speed.equals("Overnight")) {
            baseRate = 50;
            service = "Premium";
        }


        weightCharge = weight;

        // Zone multiplier
        if (zone.equals("Local")) {
            zoneMultiplier = 1.0;
        } else if (zone.equals("Regional")) {
            zoneMultiplier = 1.2;
        } else if (zone.equals("National")) {
            zoneMultiplier = 1.5;
        } else if (zone.equals("International")) {
            zoneMultiplier = 3.0;
        }

    
        if (size.equals("Small")) {
            sizeCharge = 0;
        } else if (size.equals("Medium")) {
            sizeCharge = 5;
        } else if (size.equals("Large")) {
            sizeCharge = 15;
        } else if (size.equals("Oversized")) {
            sizeCharge = 30;
        }

        
        double baseCost = (baseRate + weightCharge) * zoneMultiplier;
        double totalCost = baseCost + sizeCharge;

        
        if (speed.equals("Economy")) {
            if (zone.equals("Local") || zone.equals("Regional") || zone.equals("National")) {
                delivery = "7 business days";
            } else {
                delivery = "14-21 business days";
            }
        } else if (speed.equals("Standard")) {
            if (zone.equals("Local")) delivery = "3 business days";
            else if (zone.equals("Regional") || zone.equals("National")) delivery = "5 business days";
            else delivery = "10-14 business days";
        } else if (speed.equals("Express")) {
            if (zone.equals("Local")) delivery = "1 business days";
            else if (zone.equals("Regional") || zone.equals("National")) delivery = "2 business days";
            else delivery = "3-5 business days";
        } else if (speed.equals("Overnight")) {
            delivery = "1 business days";
        }

    
        System.out.println("Package Weight: " + weight + " lbs");
        System.out.println("Destination Zone: " + zone);
        System.out.println("Shipping Speed: " + speed);
        System.out.println("Package Size: " + size);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightCharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeCharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + delivery);
        System.out.println("Service Level: " + service);

        sc.close();
    }
}