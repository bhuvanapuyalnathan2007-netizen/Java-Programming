import java.util.Scanner;
public class CarRental{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int rent=sc.nextInt();
        int late=sc.nextInt();
        int fuel=sc.nextInt();
        int maintain=sc.nextInt();
        int profit=(rent*days)+late-fuel-maintain;
        System.out.print(profit);
        sc.close();
    }
}

