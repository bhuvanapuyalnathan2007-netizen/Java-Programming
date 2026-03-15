import java.util.Scanner;
public class Oper14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int permissionA=sc.nextInt();
        int permissionB=sc.nextInt();
    
        int permission=(permissionA|permissionB);
        System.out.println("Merged permission code="+permission);
        sc.close();
    }
    
}
