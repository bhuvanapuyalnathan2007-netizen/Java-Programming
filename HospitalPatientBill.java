
    import java.util.Scanner;
    public class HospitalPatientBill {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numDays=sc.nextInt();
        int RcPerday=sc.nextInt();
        int medcost=sc.nextInt();
        int labfee=sc.nextInt();
        int insurance=sc.nextInt();
        int roomcost=numDays*RcPerday;
        int totalcost=roomcost+medcost+labfee-insurance;
        System.out.print(totalcost);
        sc.close();


    }
}


