import java.util.Scanner;

public class Ifelse2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtRatio = sc.nextDouble();
        sc.nextLine();
        String loanType = sc.nextLine();

        String decision;
        double maxLoan = 0.0;

        // Nested if-else for decision
        if (creditScore >= 700 && debtRatio <= 35) {
            decision = "Approved";

            if (loanType.equals("Home")) {
                maxLoan = annualIncome * 4;
            } 
            else if (loanType.equals("Business")) {
                maxLoan = annualIncome * 3;
            } 
            else if (loanType.equals("Personal")) {
                maxLoan = annualIncome * 0.5;
            }

        } 
        else if (creditScore >= 600 && debtRatio <= 45) {
            decision = "Needs Review";

            if (loanType.equals("Home")) {
                maxLoan = annualIncome * 2;
            } 
            else if (loanType.equals("Business")) {
                maxLoan = annualIncome * 1.5;
            } 
            else if (loanType.equals("Personal")) {
                maxLoan = annualIncome * 0.5;
            }

        } 
        else {
            decision = "Rejected";
            maxLoan = 0.0;
        }

        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + debtRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoan);

        sc.close();
    }
}
