import java.util.Scanner;

public class nightClub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine();
        if (age >= 18)
            System.out.println("Welcome to the club!");
        sc.close();
    }
}