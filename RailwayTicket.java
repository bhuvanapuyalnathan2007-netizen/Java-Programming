import java.util.Scanner;

public class RailwayTicket {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int genPass=sc.nextInt();
        int genFare=sc.nextInt();
        int acPass=sc.nextInt();
        int acFare=sc.nextInt();
        int  platform=sc.nextInt();
        int  maintenenace=sc.nextInt();
        int Fuel=sc.nextInt();
        int NetRevenue =(genPass* genFare)+ (acPass*acFare)+ platform -maintenenace-Fuel;
        System.out.println(NetRevenue);
        sc.close();
     }
}