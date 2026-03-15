import java.util.Scanner;
public class Oper13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int connectionvalue=sc.nextInt();
        int appliancemask=sc.nextInt();

        if((connectionvalue&appliancemask)!=0){
            System.out.println("Active");
        }else{
            System.out.println("Inactive");
            sc.close();
        }
    }
    
}
