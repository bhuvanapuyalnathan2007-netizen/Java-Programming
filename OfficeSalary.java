import java.util.Scanner;
public class OfficeSalary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int BasicPay=sc.nextInt();
        int HouseRent=sc.nextInt();
        int PerfBonus=sc.nextInt();
        int ProfTAx=sc.nextInt();
        int ProviFund=sc.nextInt();
        int TotalHomeSalary=BasicPay+HouseRent+PerfBonus-ProfTAx-ProviFund;
        System.out.println("TotalSalary"+TotalHomeSalary);
        sc.close();

    }
}
