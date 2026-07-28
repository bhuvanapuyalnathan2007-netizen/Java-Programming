import java.util.Scanner;
public class Bitodec{
    public static void bitodec(int n){
    int dec=0,base=1;
        while(n>0){
        int r=n%10;
        dec=dec+r*base;
        base=base*2;
        n=n/10;
        }
        System.out.println(dec);
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            bitodec(n);
        }
    }
