import java.util.Scanner;

public class promProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like promotional items (yes/no) ?");
        String answerFirst = sc.nextLine();
        if (answerFirst.equals("no"))
        {
            System.out.println("Let us know if you change your mind!");
            sc.close();
            return;
        }
        else if (answerFirst.equals("yes"))
        {
            System.out.println("Enter a category:");
            String categoryAnswer = sc.nextLine();
            if (categoryAnswer.equals("sweets"))
                System.out.println("Gummy fruit for 200 coins");
            else
                System.out.println("Lingonberry juice for 140 coins.");
        }
        sc.close();
    }
}
