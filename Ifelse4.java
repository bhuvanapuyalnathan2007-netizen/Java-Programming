import java.util.Scanner;
public class Ifelse4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        String loyaltyTier = sc.nextLine();
        double cartValue = sc.nextDouble();
        sc.nextLine(); // consume newline
        String productCategory = sc.nextLine();
        String membershipStatus = sc.nextLine();

        double baseDiscount = 0;
        double additionalDiscount = 0;

        // Base Discount based on loyalty
        if (loyaltyTier.equalsIgnoreCase("Bronze")) {
            baseDiscount = 5;
        } else if (loyaltyTier.equalsIgnoreCase("Silver")) {
            baseDiscount = 10;
        } else if (loyaltyTier.equalsIgnoreCase("Gold")) {
            baseDiscount = 12;
        } else if (loyaltyTier.equalsIgnoreCase("Platinum")) {
            baseDiscount = 15;
        }

        // Additional Discount based on category + membership
        if (productCategory.equalsIgnoreCase("Electronics")) {
            if (membershipStatus.equalsIgnoreCase("Prime")) {
                additionalDiscount = 10;
            } else {
                additionalDiscount = 5;
            }
        } 
        else if (productCategory.equalsIgnoreCase("Fashion")) {
            if (membershipStatus.equalsIgnoreCase("Prime")) {
                additionalDiscount = 7;
            } else {
                additionalDiscount = 3;
            }
        } 
        else if (productCategory.equalsIgnoreCase("Groceries")) {
            additionalDiscount = 2;
        } 
        else if (productCategory.equalsIgnoreCase("Books")) {
            additionalDiscount = 4;
        }

        double totalDiscount = baseDiscount + additionalDiscount;

        // Calculations
        double discountAmount = (totalDiscount / 100) * cartValue;
        double finalPrice = cartValue - discountAmount;

        // Output
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Cart Value: $" + cartValue);
        System.out.println("Product Category: " + productCategory);
        System.out.println("Membership: " + membershipStatus);
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Additional Discount: " + additionalDiscount + "%");
        System.out.println("Total Discount: " + totalDiscount + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Savings: $" + discountAmount);

        sc.close();
    }
}