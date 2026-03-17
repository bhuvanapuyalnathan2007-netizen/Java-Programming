import java.util.Scanner;
public class Ifelse3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String smokingStatus = sc.nextLine();
        String preExisting = sc.nextLine();
        String coverageTier = sc.nextLine();

        double basePremium = 0;
        double riskSurcharge = 0;

        // Base premium using nested if
        if(age >= 18 && age <= 30) {
            if(coverageTier.equals("Basic"))
                basePremium = 200;
            else if(coverageTier.equals("Standard"))
                basePremium = 250;
            else if(coverageTier.equals("Premium"))
                basePremium = 350;
        }
        else if(age >= 31 && age <= 50) {
            if(coverageTier.equals("Basic"))
                basePremium = 250;
            else if(coverageTier.equals("Standard"))
                basePremium = 300;
            else if(coverageTier.equals("Premium"))
                basePremium = 500;
        }
        else {
            if(coverageTier.equals("Basic"))
                basePremium = 350;
            else if(coverageTier.equals("Standard"))
                basePremium = 450;
            else if(coverageTier.equals("Premium"))
                basePremium = 600;
        }

        // Risk surcharge
        if(smokingStatus.equals("Smoker")) {
            riskSurcharge += 120;
        }

        if(preExisting.equals("Yes")) {
            riskSurcharge += 230;
        }

        double totalPremium = basePremium + riskSurcharge;

        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingStatus);
        System.out.println("Pre-existing Conditions: " + preExisting);
        System.out.println("Coverage Tier: " + coverageTier);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);

        sc.close();
    }
}

