import java.util.Scanner;
public class Oper1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int theorymarks=sc.nextInt();
        int practicalmarks=sc.nextInt();
        double average=((theorymarks+practicalmarks)/2);

        if(theorymarks>=50 && practicalmarks>=50 && average>=60){
        System.out.println("Result=PASS");
    }else{
        System.out.println("Result=FAIL");
        sc.close();
    }
}
}
