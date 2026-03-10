import java.util.Scanner;
public class WeeklyWage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int daysWorked=sc.nextInt();
        int wagePerday=sc.nextInt();
        int overTimebonus=sc.nextInt();
        int maintenanceCharge=sc.nextInt();
        int Base=daysWorked*wagePerday;
        int bonus=Base+overTimebonus;
        int Weeklywage=bonus-maintenanceCharge;
        System.out.print(Weeklywage);
        sc.close();

    }
}
