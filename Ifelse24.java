    import java.util.Scanner;

public class Ifelse24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double orderValue = sc.nextDouble();
        sc.nextLine(); // consume newline
        String timeSlot = sc.nextLine();
        String weather = sc.nextLine();

        double baseFee = 3.0;
        double distanceCharge = distance * 1.0;
        double peakCharge = 0.0;
        if (timeSlot.equals("Breakfast")) {
            peakCharge = 0.0;
        } else if (timeSlot.equals("Lunch")) {
            peakCharge = 2.5;
        } else if (timeSlot.equals("Dinner")) {
            peakCharge = 2.0;
        } else if (timeSlot.equals("Late-Night")) {
            peakCharge = 1.5;
        }
        double weatherCharge = 0.0;
        if (weather.equals("Clear")) {
            weatherCharge = 0.0;
        } else if (weather.equals("Rain")) {
            weatherCharge = 2.0;
        } else if (weather.equals("Snow")) {
            weatherCharge = 3.0;
        } else if (weather.equals("Storm")) {
            weatherCharge = 5.0;
        }

        
        double discount = 0.0;
        if (orderValue >= 30 && orderValue < 50) {
            discount = 1.0;
        } else if (orderValue >= 50 && orderValue < 75) {
            discount = 3.0;
        } else if (orderValue >= 75) {
            discount = 5.0;
        }

    
        double finalFee = baseFee + distanceCharge + peakCharge + weatherCharge - discount;
        if (finalFee < 2.99) {
            finalFee = 2.99;
        }

        
        int time = (int)(distance * 8); // base time

        
        if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            time += 10;
        }

    
        if (weather.equals("Rain")) {
            time += 5;
        } else if (weather.equals("Snow")) {
            time += 10;
        } else if (weather.equals("Storm")) {
            time += 15;
        }

        
        String priority;
        if (orderValue > 60) {
            priority = "Express";
        } else if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            priority = "High";
        } else {
            priority = "Standard";
        }

    
        System.out.println("Delivery Distance: " + distance + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weather);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + distanceCharge);
        System.out.println("Peak Time Surcharge: $" + peakCharge);
        System.out.println("Weather Surcharge: $" + weatherCharge);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + time + " minutes");
        System.out.println("Service Priority: " + priority);

        sc.close();
    }}
    

