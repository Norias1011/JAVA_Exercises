import java.util.Scanner;

public class examResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your exam score:");
        int grade = sc.nextInt();
        if (grade >= 50)
            System.out.println("You passed the exam!");
        else
            System.out.println("You failed the exam.");
        sc.close();
    }
}
