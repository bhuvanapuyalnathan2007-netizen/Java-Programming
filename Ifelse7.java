    import java.util.*;
public class Ifelse7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int heartRate = sc.nextInt();
        String bloodPressure = sc.next();
        double temperature = sc.nextDouble();
        sc.nextLine(); // consume newline
        String symptomSeverity = sc.nextLine();

        // Extract systolic and diastolic
        String[] bpParts = bloodPressure.split("/");
        int systolic = Integer.parseInt(bpParts[0]);
        int diastolic = Integer.parseInt(bpParts[1]);

        String priority = "";
        int waitTime = 0;
        String action = "";

        // Nested if-else logic
        if (symptomSeverity.equalsIgnoreCase("Life-Threatening")) {
            priority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";
        } else {
            if (symptomSeverity.equalsIgnoreCase("Severe")) {
                if (heartRate > 100 || systolic > 140 || temperature > 101) {
                    priority = "Urgent";
                    waitTime = 15;
                    action = "Priority Medical Attention";
                } else {
                    priority = "Standard";
                    waitTime = 30;
                    action = "Medical Evaluation";
                }
            } else {
                if (symptomSeverity.equalsIgnoreCase("Moderate")) {
                    if (heartRate >= 60 && heartRate <= 100 &&
                        systolic < 140 && temperature < 100) {
                        priority = "Standard";
                        waitTime = 45;
                        action = "Standard Examination";
                    } else {
                        priority = "Urgent";
                        waitTime = 20;
                        action = "Quick Medical Review";
                    }
                } else { // Mild
                    priority = "Non-Urgent";
                    waitTime = 60;
                    action = "Routine Checkup";
                }
            }
        }

        // Output
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + symptomSeverity);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);
        sc.close();
    }
}

