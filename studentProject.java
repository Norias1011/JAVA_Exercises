import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class studentProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter birthday (day of month):");
        int dayBirthday = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter birth month:");
        int monthBirthday = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter birth year:");
        int yearBirthday = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter course registered:");
        String courseRegist = scanner.nextLine();
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(yearBirthday, monthBirthday, dayBirthday);
        int age = Period.between(birth, today).getYears();

        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dayBirthday + "/" + monthBirthday + "/" + yearBirthday);
        System.out.println("Age: " + age);
        System.out.println("Course registered: " + courseRegist);
        scanner.close();
    }
    
}
