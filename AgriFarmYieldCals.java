import java.util.Scanner;
public class AgriFarmYieldCals {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int YieldPrice=sc.nextInt();
        int acres=sc.nextInt();
        int extraYield=sc.nextInt();
        int damagedcrops=sc.nextInt();
        int FinalYield=(YieldPrice*acres)+extraYield-damagedcrops;
        System.out.print(FinalYield);
        sc.close();
    }
}
