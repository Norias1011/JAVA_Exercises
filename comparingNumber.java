import java.util.Scanner;

public class comparingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the second number:");
        int secondNumber = sc.nextInt();
        if (firstNumber > secondNumber)
            System.out.println("The first number is greater");
        else if (firstNumber < secondNumber)
            System.out.println("The second number is greater");
        else
            System.out.println("The numbers are equal");
        sc.close();
    }
}
