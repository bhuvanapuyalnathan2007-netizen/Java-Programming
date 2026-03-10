import java.util.Scanner;
public class TravelExpenses{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int mileage=sc.nextInt();
        int fuelPrice=sc.nextInt();
        int tollcharge=sc.nextInt();
        int fuelneeded=distance/mileage;
        int fuleCost=fuelneeded*fuelPrice;
        int Totalexpenses=fuleCost+tollcharge;
        System.out.println(Totalexpenses);
        sc.close();

    }
}
