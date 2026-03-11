import java.util.Scanner;
public class Studentscholarship {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int tuitionfees=sc.nextInt();
    int scholarship=sc.nextInt();
    int exanfee=sc.nextInt();
    int libraryfee=sc.nextInt();

    int scholarshipAmount=(tuitionfees*scholarship)/100;
    int afterscholarship=tuitionfees-scholarshipAmount;
    int finalfee=afterscholarship+exanfee+libraryfee;

    System.out.println("Final payable fee="+finalfee);

    }
    
}
