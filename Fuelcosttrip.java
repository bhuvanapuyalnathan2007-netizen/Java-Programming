import java.util.Scanner;
public class Fuelcosttrip {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int mileage=sc.nextInt();
        int fuelprice=sc.nextInt(); 
        int tollcharge=sc.nextInt();

        int fuelneeded=distance/mileage;
        int fuelcost=fuelneeded*fuelprice;
        int totalcost=fuelcost+tollcharge;
        System.out.println("Total Trip cost="+totalcost);
        sc.close();
    }
    
}
