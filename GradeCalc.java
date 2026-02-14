import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your marks:");
        if (sc.hasNextInt()) {

            int grade = sc.nextInt();

            if (grade >= 90 && grade <= 100) {
                System.out.println("Grade A");
            } else if (grade >= 80 && grade < 90) {
                System.out.println("Grade B");
            } else if (grade >= 65 && grade < 80) {
                System.out.println("Grade C");
            } else if (grade >= 50 && grade < 65) {
                System.out.println("Grade D");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Invalid valid! Please enter correct marks.");
        }

        sc.close();
    }
}
