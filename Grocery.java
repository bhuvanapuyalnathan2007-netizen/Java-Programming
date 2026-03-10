import java.util.Scanner;
public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sales = sc.nextDouble();
        double discount = sc.nextDouble();
        double gst = sc.nextDouble();

        double salesDiscount = sales - (sales * discount / 100);
        double salesGst = salesDiscount * gst / 100;
        double finalRevenue = salesDiscount + salesGst;

        System.out.printf("Final Revenue: %.2f", finalRevenue);

        sc.close();
    }
}

