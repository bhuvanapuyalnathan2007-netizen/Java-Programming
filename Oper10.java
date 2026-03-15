import java.util.Scanner;
public class Oper10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int unitsconsumed=sc.nextInt();
        int voltagefluctuation=sc.nextInt();

        if(unitsconsumed>500||voltagefluctuation==1){
            System.out.println("Alert");
        }else{
            System.out.println("Normal");
            sc.close();
        }
    }
    
}
