import java.util.Scanner;
public class FactoryMachine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rodsperHr=sc.nextInt();
        int hoursWorked=sc.nextInt();
        int overtimeRods=sc.nextInt();
        int rejectedRods=sc.nextInt();
        int FinalProduction=(rodsperHr*hoursWorked)+overtimeRods-rejectedRods;
        System.out.print(FinalProduction);
        sc.close();
    }
}
