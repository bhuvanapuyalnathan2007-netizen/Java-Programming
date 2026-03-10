import java.util.Scanner;
public class DeliveyService {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int deliveries=sc.nextInt();
        int payout=sc.nextInt();
        int Incentive=sc.nextInt();
        int fuelcost=sc.nextInt();
        int netEarnings=(deliveries*payout)+Incentive-fuelcost;
        System.out.println(netEarnings);
        sc.close();
    }
}
