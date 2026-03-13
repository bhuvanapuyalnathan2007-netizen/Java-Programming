import java.util.Scanner;
public class Oper2 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int accountbalance=sc.nextInt();
    int withdraewalamount=sc.nextInt();
    int dailylimit=sc.nextInt();
    
    if(withdraewalamount<=accountbalance&&withdraewalamount<=dailylimit){
        System.out.println("Transaction Approved");
    }else{
        System.out.println("Transaction Declained");
        sc.close();
    }
    }}
    