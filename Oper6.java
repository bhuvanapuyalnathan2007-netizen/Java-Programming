import java.util.Scanner;
public class Oper6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

    int familyincome=sc.nextInt();
    int percentage=sc.nextInt();
     
    if(familyincome<200000&&percentage>=75){
        System.out.println("Granted");
    }else{
        System.out.println("Not Granted");
        sc.close();
    }

    }
    
}
