import java.util.Scanner;
public class Oper3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int workinghours=sc.nextInt();
        int attendancepercentage=sc.nextInt();

        if(attendancepercentage>90&&workinghours>40){
            System.out.println("Eligible");
        }else{
           System.out.println("Not Eligible");
           sc.close();
        }
    }
    
}
