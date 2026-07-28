import java.util.Scanner;
public class Bitooct{
    public static int bitodec(int n){
    int dec=0,base=1;
        while(n>0){
        int r=n%10;
        dec=dec+r*base;
        base=base*2;
        n=n/10;
        }
        return dec;
    }
    public static int dectooct(int dec){
        int oct=0,base1=1;
        while(dec>0){
         int r=dec%8;
         oct=oct+r*base1;
         base1=base1*10;
         dec=dec/8;
        }
        return oct;
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int dec=bitodec(n);
            int ans=dectooct(dec);
            System.out.println(ans);
        }
    }
