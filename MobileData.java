
import java.util.Scanner;

public class MobileData {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int baseCost = sc.nextInt();
        int extraGB = sc.nextInt();
        int ratePerGB = sc.nextInt();
        int tax = sc.nextInt();

        int totalBill = baseCost + (extraGB * ratePerGB);
        double taxAmount = (totalBill * tax) / 100.0;
        double finalBill = totalBill + taxAmount;

        System.out.println("Total Bill = " + finalBill);

        sc.close();
    }
}