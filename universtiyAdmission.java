import java.util.Scanner;

public class universtiyAdmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your GPA:");
        float gpa = sc.nextFloat();
        if ((age > 17 && age < 26)  && (gpa >= 3.0 && gpa <= 7.0))
            System.out.println("Congratulations! You're eligible for admission");
        else if ((age > 17 && age < 26) || (gpa >= 3.0 && gpa <= 7.0))
        {
            if (gpa > 7.0)
            {
                System.out.println("Maximum GPA is 7.0");
                sc.close();
                return ;
            }
            System.out.println("You don't meet all the requirements");
        }
        else
            System.out.println("Sorry, you're not eligible for admission.");
        sc.close();
    }
}
