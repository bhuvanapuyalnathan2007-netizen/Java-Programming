import java.util.Scanner;
public class Oper7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cartvalue=sc.nextInt();
        int premiummember=sc.nextInt();
        if(cartvalue>999||premiummember==1){
            System.out.println("Free shipping");
        }else{
            System.out.println("Charge applied");
            sc.close();
        }
    }
    
}
