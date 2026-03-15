import java.util.Scanner;
public class Oper12 {
    public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int filesize=sc.nextInt();
  int compressioncycles=sc.nextInt();
  int size=(filesize>>compressioncycles);
    System.out.println("Compressed size="+size);
    sc.close();
}
}
