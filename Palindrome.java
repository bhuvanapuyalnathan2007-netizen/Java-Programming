/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Palindrome{
    public static boolean palindrome(int n){
    int rev=0;
    int m=n;
    while(n>0){
        int r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    return rev==m;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean ans=palindrome(n);
    if(ans){
    System.out.println("palindrome");
}else{
    System.out.println("Not Palindrome");
}
}
}

