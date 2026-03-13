import java.util.Scanner;
public class Oper4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int creditlimit=sc.nextInt();
        int purchaseamount=sc.nextInt();
        int cardblocked=sc.nextInt();
        
        if(purchaseamount<=creditlimit&&cardblocked==0){
            System.out.println("Approved");
        }else{
            System.out.println("Declined");
            sc.close();
        }
    }
    
}
