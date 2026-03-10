 // Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Hotel {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int rooms=scan.nextInt();
      int price=scan.nextInt();
      int serviceCharges=scan.nextInt();
      int commission=scan.nextInt();
     int totalrevenue=(rooms*price)+serviceCharges-commission;
     System.out.println(totalrevenue);
     scan.close();
   }
}







