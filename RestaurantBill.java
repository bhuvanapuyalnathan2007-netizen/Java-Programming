import java.util.Scanner;
public class RestaurantBill{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int TotalBill=sc.nextInt();
        int service=sc.nextInt();
        int gst=sc.nextInt();
        int numPeople=sc.nextInt();
        int serviceCharge=(TotalBill+(TotalBill*service/100));
        int GstCharge=serviceCharge*gst/100;
        double amountPerperson=((serviceCharge+GstCharge)/numPeople);
        System.out.print(amountPerperson);
        sc.close();
    }
}