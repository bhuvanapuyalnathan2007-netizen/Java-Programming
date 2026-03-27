 import java.util.Scanner;
public class Ifelse13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String studentStatus = sc.nextLine();   // Full-Time / Part-Time / Continuing-Education
        int creditHours = sc.nextInt();
        sc.nextLine(); // consume newline
        String programType = sc.nextLine();     // Undergraduate / Graduate / Professional
        String residency = sc.nextLine();       // In-State / Out-of-State / International

        double baseFeePerCredit = 0;
        double residencyMultiplier = 1.0;
        double programFee = 0;
        double activityFee = 0;

        // Program Type Fee
        if (programType.equals("Undergraduate")) {
            baseFeePerCredit = 350;
            programFee = 500;
        } else if (programType.equals("Graduate")) {
            baseFeePerCredit = 500;
            programFee = 800;
        } else if (programType.equals("Professional")) {
            baseFeePerCredit = 800;
            programFee = 1200;
        }

        // Residency Multiplier
        if (residency.equals("In-State")) {
            residencyMultiplier = 1.0;
        } else if (residency.equals("Out-of-State")) {
            residencyMultiplier = 2.0;
        } else if (residency.equals("International")) {
            residencyMultiplier = 3.0;
        }

        // Student Status Fee
        if (studentStatus.equals("Full-Time")) {
            activityFee = 200;
        } else if (studentStatus.equals("Part-Time")) {
            activityFee = 100;
        } else if (studentStatus.equals("Continuing-Education")) {
            activityFee = 50;
        }

        // Total Calculation
        double tuition = creditHours * baseFeePerCredit * residencyMultiplier;
        double totalFee = tuition + programFee + activityFee;

        // Output
        System.out.println("Student Status: " + studentStatus);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Program Type: " + programType);
        System.out.println("Residency: " + residency);
        System.out.println("Base Tuition Per Credit: $" + baseFeePerCredit);
        System.out.println("Residency Multiplier: " + residencyMultiplier + "x");
        System.out.println("Program Fee: $" + programFee);
        System.out.println("Student Activity Fee: $" + activityFee);
        System.out.println("Total Registration Fee: $" + totalFee);

        sc.close();
    }
}

