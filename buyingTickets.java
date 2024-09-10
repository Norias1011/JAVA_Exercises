import java.util.Scanner;

public class buyingTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many tickets do you need:");
        int numberTickets = sc.nextInt();
        sc.nextLine();
        System.out.println("Do you have student discount (y/n)?");
        char studentDiscount = sc.nextLine().charAt(0);
        if (studentDiscount == 'y')
            System.out.println("Total tickets price: " + (numberTickets * 10) + " euros");
        else
            System.out.println("Total tickets price: " + (numberTickets * 15) + " euros");
        sc.close();
    }
}
