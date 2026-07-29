import java.util.Scanner;
public class Octtodec{
    public static void octtodec(int n){
    int dec=0,base=1;
    while(n>0){
        int r=n%10;
        dec=dec+r*base;
        base=base*8;
        n=n/10;
    }
    System.out.println(dec);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        octtodec(n);
    }
}