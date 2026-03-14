import java.util.Scanner;
public class Oper9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int usernamematch=sc.nextInt();
        int passwordmatch=sc.nextInt();
        int accountlocked=sc.nextInt();

        if(usernamematch==1&&passwordmatch==1&&accountlocked!=1){
            System.out.println("Success");
        }else{
            System.out.println("Failed");
            sc.close();
        }
    }
    
}
