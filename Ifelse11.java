import java.util.Scanner;
public class Ifelse11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String orderType = sc.nextLine();
        String loyaltyStatus = sc.nextLine();
        double orderValue = sc.nextDouble();
        sc.nextLine(); 
        String timeSlot = sc.nextLine();

        double baseDiscount = 0;
        double timeAdjustment = 0;
        double serviceFeeRate = 0;

        if (loyaltyStatus.equalsIgnoreCase("Gold")) {
            baseDiscount = 15;
        } else if (loyaltyStatus.equalsIgnoreCase("Silver")) {
            baseDiscount = 10;
        } else if (loyaltyStatus.equalsIgnoreCase("Bronze")) {
            baseDiscount = 5;
        }

        if (timeSlot.equalsIgnoreCase("Late-Night")) {
            timeAdjustment = -5;
        }

        if (orderType.equalsIgnoreCase("Delivery")) {
            serviceFeeRate = 10;
        } else if (orderType.equalsIgnoreCase("Takeout")) {
            serviceFeeRate = 3;
        } else if (orderType.equalsIgnoreCase("Dine-In")) {
            serviceFeeRate = 5;
        }

        double totalDiscount = baseDiscount + timeAdjustment;
        double discountAmount = (totalDiscount / 100) * orderValue;
        double discountedPrice = orderValue - discountAmount;

        double serviceFee = (serviceFeeRate / 100) * orderValue;

        double finalAmount = discountedPrice + serviceFee;

        String priority = "";
        int prepTime = 0;

        if (timeSlot.equalsIgnoreCase("Peak") && orderType.equalsIgnoreCase("Delivery")) {
            priority = "High";
            prepTime = 30;
        } else if (timeSlot.equalsIgnoreCase("Regular")) {
            priority = "Medium";
            prepTime = 20;
        } else {
            priority = "Low";
            prepTime = 15;
        }

        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: " + loyaltyStatus);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Service Fee: $" + serviceFee);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");

        sc.close();
    }
}

