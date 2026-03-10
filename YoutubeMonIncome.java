import java.util.*;
public class YoutubeMonIncome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ads=sc.nextInt();
        int sponser=sc.nextInt();
        int aff=sc.nextInt();
        int tax=sc.nextInt();
        int production=sc.nextInt();
        int income=ads+sponser+aff-tax-production;
        System.out.print(income);
        sc.close();
    }
}
