import java.util.Scanner;
public class Oper8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int idproof=sc.nextInt();
        if(age>=18&&idproof==1){
            System.out.println("Allowed");
        }else{
            System.out.println("Denied");
            sc.close();
        }

    }
    
}
