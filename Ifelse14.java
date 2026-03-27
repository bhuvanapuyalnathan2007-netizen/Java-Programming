    import java.util.Scanner;
public class Ifelse14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gathering
        System.out.print("Enter Membership Tier (Basic, Premium, Elite, VIP): ");
        String membershipTier = scanner.nextLine();
        
        System.out.print("Enter Contract Months (1, 6, 12, 24): ");
        int contractMonths = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter Access Level (Single-Location, Regional, Nationwide): ");
        String accessLevel = scanner.nextLine();
        
        System.out.print("Enter Add-Ons (None, Personal-Training, Classes, Full-Package): ");
        String addOns = scanner.nextLine();

        // Variables for calculation
        double baseMonthlyFee = 0;
        double contractDiscount = 0;
        double accessFee = 0;
        double addOnFee = 0;

        // 1. Determine Base Monthly Fee (Nested If-Else)
        if (membershipTier.equalsIgnoreCase("Basic")) {
            baseMonthlyFee = 50.0;
        } else if (membershipTier.equalsIgnoreCase("Premium")) {
            baseMonthlyFee = 80.0;
        } else if (membershipTier.equalsIgnoreCase("Elite")) {
            baseMonthlyFee = 120.0;
        } else if (membershipTier.equalsIgnoreCase("VIP")) {
            baseMonthlyFee = 200.0;
        }

        // 2. Determine Contract Discount
        if (contractMonths == 6) {
            contractDiscount = 10.0; // 10% discount
        } else if (contractMonths == 12) {
            contractDiscount = 20.0; // 20% discount
        } else if (contractMonths == 24) {
            contractDiscount = 30.0; // 30% discount
        } else {
            contractDiscount = 0.0;
        }

        // 3. Determine Access Fee
        if (accessLevel.equalsIgnoreCase("Regional")) {
            accessFee = 20.0;
        } else if (accessLevel.equalsIgnoreCase("Nationwide")) {
            accessFee = 50.0;
        } else {
            accessFee = 0.0; // Single-Location is default
        }

        // 4. Determine Add-On Fee
        if (addOns.equalsIgnoreCase("Personal-Training")) {
            addOnFee = 50.0;
        } else if (addOns.equalsIgnoreCase("Classes")) {
            addOnFee = 30.0;
        } else if (addOns.equalsIgnoreCase("Full-Package")) {
            addOnFee = 70.0;
        } else {
            addOnFee = 0.0;
        }

        // Calculations
        double monthlySubtotal = baseMonthlyFee + accessFee + addOnFee;
        double discountAmount = monthlySubtotal * (contractDiscount / 100.0);
        double monthlyTotal = monthlySubtotal - discountAmount;
        double contractTotal = monthlyTotal * contractMonths;
        
        // Savings vs Month-to-Month (Full price * months - discounted price * months)
        double savings = (monthlySubtotal * contractMonths) - contractTotal;

        // Determine Membership Category
        String category = "";
        if (monthlyTotal < 70) {
            category = "Budget";
        } else if (monthlyTotal < 130) {
            category = "Standard";
        } else if (monthlyTotal < 200) {
            category = "Premium";
        } else {
            category = "Luxury";
        }

        // Final Output Formatting
        System.out.println("\n--- Membership Summary ---");
        System.out.println("Membership Tier: " + membershipTier);
        System.out.println("Contract Length: " + contractMonths + " months");
        System.out.println("Access Level: " + accessLevel);
        System.out.println("Add-Ons: " + addOns);
        System.out.printf("Base Monthly Fee: $%.2f\n", baseMonthlyFee);
        System.out.printf("Contract Discount: %.0f%%\n", contractDiscount);
        System.out.printf("Access Fee: $%.2f\n", accessFee);
}
}
