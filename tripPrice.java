import java.util.Scanner;

public class tripPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost of one night at the hotel:\n");
        int nightsCost = scanner.nextInt();
        System.out.println("Enter the number of days of the trip:\n");
        int daysTrip = scanner.nextInt();
        System.out.println("Price of the trip: " + (nightsCost * daysTrip));
    }
    
}
