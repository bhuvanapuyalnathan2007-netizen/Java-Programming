import java.util.*;
public class SoftwareCompany{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int hrs=sc.nextInt();
        int rate=sc.nextInt();
        int design=sc.nextInt();
        int testing=sc.nextInt();
        int advance=sc.nextInt();
        int projCost=(hrs*rate)+design+testing-advance;
       System.out.print(projCost) ;
       sc.close();
    }
}