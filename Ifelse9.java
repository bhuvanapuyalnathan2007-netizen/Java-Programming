    import java.util.Scanner;
public class Ifelse9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        double annualRevenue = sc.nextDouble();
        sc.nextLine(); // consume newline
        String businessType = sc.nextLine();
        double deductibleExpenses = sc.nextDouble();
        double taxCredits = sc.nextDouble();

        // Step 1: Taxable Income
        double taxableIncome = annualRevenue - deductibleExpenses;

        double taxRate = 0;

        // Step 2: Determine Tax Rate using nested if-else
        if (businessType.equals("C-Corp")) {
            if (taxableIncome < 500000) {
                taxRate = 21;
            } else if (taxableIncome < 1000000) {
                taxRate = 24;
            } else if (taxableIncome < 2000000) {
                taxRate = 28;
            } else {
                taxRate = 30;
            }
        } else if (businessType.equals("S-Corp")) {
            if (taxableIncome < 500000) {
                taxRate = 20;
            } else if (taxableIncome < 1000000) {
                taxRate = 25;
            } else {
                taxRate = 28;
            }
        } else if (businessType.equals("LLC")) {
            if (taxableIncome < 200000) {
                taxRate = 15;
            } else if (taxableIncome < 500000) {
                taxRate = 18;
            } else {
                taxRate = 22;
            }
        } else if (businessType.equals("Partnership")) {
            if (taxableIncome < 300000) {
                taxRate = 18;
            } else if (taxableIncome < 800000) {
                taxRate = 22;
            } else {
                taxRate = 26;
            }
        }

        // Step 3: Gross Tax
        double grossTax = taxableIncome * (taxRate / 100);

        // Step 4: Net Tax (minimum 0)
        double netTax = grossTax - taxCredits;
        if (netTax < 0) {
            netTax = 0;
        }

        // Step 5: Effective Tax Rate
        double effectiveRate = (netTax / annualRevenue) * 100;

        // Output
        System.out.println("Annual Revenue: $" + annualRevenue);
        System.out.println("Business Type: " + businessType);
        System.out.println("Deductible Expenses: $" + deductibleExpenses);
        System.out.println("Tax Credits: $" + taxCredits);
        System.out.println("Taxable Income: $" + taxableIncome);
        System.out.println("Tax Rate: " + (int)taxRate + "%");
        System.out.println("Gross Tax: $" + grossTax);
        System.out.println("Net Tax After Credits: $" + netTax);

        // Format effective rate to 2 decimal places
        System.out.printf("Effective Tax Rate: %.2f%%", effectiveRate);

        sc.close();
    }
}

