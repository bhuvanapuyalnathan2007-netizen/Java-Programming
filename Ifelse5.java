    import java.util.Scanner;
public class Ifelse5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        double familyIncome = sc.nextDouble();
        int extracurricularScore = sc.nextInt();
        sc.nextLine(); // consume newline
        String scholarshipType = sc.nextLine();

        String eligibility = "Not Eligible";
        double amount = 0.0;
        String category = "None";

        // Minimum eligibility check
        if (gpa >= 2.5) {

            if (scholarshipType.equalsIgnoreCase("Merit")) {

                if (gpa >= 3.8 && extracurricularScore >= 80) {
                    eligibility = "Eligible";
                    amount = 25000.0;
                    category = "Full";
                } else if (gpa >= 3.5 && extracurricularScore >= 70) {
                    eligibility = "Eligible";
                    amount = 15000.0;
                    category = "Partial";
                } else if (gpa >= 3.0 && extracurricularScore >= 60) {
                    eligibility = "Eligible";
                    amount = 8000.0;
                    category = "Minimal";
                }

            } else if (scholarshipType.equalsIgnoreCase("Need-Based")) {

                if (familyIncome <= 30000 && gpa >= 3.5) {
                    eligibility = "Eligible";
                    amount = 30000.0;
                    category = "Full";
                } else if (familyIncome <= 50000 && gpa >= 3.0) {
                    eligibility = "Eligible";
                    amount = 18000.0;
                    category = "Partial";
                } else if (familyIncome <= 70000 && gpa >= 2.8) {
                    eligibility = "Eligible";
                    amount = 10000.0;
                    category = "Minimal";
                }

            } else if (scholarshipType.equalsIgnoreCase("Sports")) {

                if (extracurricularScore >= 85 && gpa >= 3.0) {
                    eligibility = "Eligible";
                    amount = 22000.0;
                    category = "Full";
                } else if (extracurricularScore >= 75 && gpa >= 2.8) {
                    eligibility = "Eligible";
                    amount = 20000.0;
                    category = "Partial";
                } else if (extracurricularScore >= 65 && gpa >= 2.5) {
                    eligibility = "Eligible";
                    amount = 12000.0;
                    category = "Minimal";
                }

            }
        }

        // Output
        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + familyIncome);
        System.out.println("Extracurricular Score: " + extracurricularScore);
        System.out.println("Scholarship Type: " + scholarshipType);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Award Amount: $" + amount);
        System.out.println("Award Category: " + category);
    }
}

