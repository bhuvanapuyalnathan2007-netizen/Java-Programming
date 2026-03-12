import java.util.Scanner;
public class Sports {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int registration=sc.nextInt();
    int broadcast=sc.nextInt();
    int sponsor=sc.nextInt();
    int prize=sc.nextInt();
    int rent =sc.nextInt();
    int advertising=sc.nextInt();

    int Remainingfund=registration+broadcast+sponsor-prize-rent-advertising;
    System.out.println("Remaining tournament fund="+Remainingfund);
    sc.close();

    }
}
