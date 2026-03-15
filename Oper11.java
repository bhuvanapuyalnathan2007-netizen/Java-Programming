import java.util.Scanner;
public class Oper11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int basebox=sc.nextInt();
        int levels=sc.nextInt();

        int capacity=(basebox<<levels);
        System.out.println("Total capacity"+capacity);
        sc.close();
        
}}
