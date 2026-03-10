import java.util.Scanner;
public class GymTrainer{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int basesalary=sc.nextInt();
        int sessions=sc.nextInt();
        int payperSession=sc.nextInt();
        int bonus=sc.nextInt();
         int maintenance=sc.nextInt();
        int Salary = basesalary + (sessions *payperSession) + bonus- maintenance;

        System.out.print(Salary);
        sc.close();
    }
}
