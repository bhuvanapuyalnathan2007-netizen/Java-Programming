import java.util.Scanner;
public class Octtobi{
    public static int octtodec(int n){
    int dec=0,base=1;
        while(n>0){
        int r=n%10;
        dec=dec+r*base;
        base=base*8;
        n=n/10;
        }
        return dec;
    }
    public static int dectobi(int dec){
        int bi=0,base1=1;
        while(dec>0){
         int r=dec%2;
         bi=bi+r*base1;
         base1=base1*10;
         dec=dec/2;
        }
        return bi;
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int dec=octtodec(n);
            int ans=dectobi(dec);
            System.out.println(ans);
        }
    }
