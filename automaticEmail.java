import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class automaticEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Client's name :");
        String clientName = scanner.nextLine();
        System.out.println("Number of previously purchased trips: ");
        int purchasedTrip = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Destination offered: ");
        String cityTrip = scanner.nextLine();
        System.out.println("Hello " + clientName + ",");
        System.out.println("You have traveled with us " + purchasedTrip + " times already! Do you want to again?");
        System.out.println("Our travel agency is having a sale. Trips to " + cityTrip + " are 50% off!");
    }
    
}
