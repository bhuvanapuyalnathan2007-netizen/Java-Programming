import java.util.Scanner;
public class Oper15 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int signalvalue=sc.nextInt();
    int togglemask=sc.nextInt();

    int signal=(signalvalue^togglemask);
    System.out.println("Toggled signal="+signal);
    sc.close();
    
    } 
}
