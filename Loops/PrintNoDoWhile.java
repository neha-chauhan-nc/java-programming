import java.util.Scanner;

public class PrintNoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        // Validation using do-while
        do {
            System.out.print("Enter a number between 1 and 10: ");
            
            // Check if input is integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // clear wrong input
                continue;
            }

            num = sc.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("Number must be between 1 and 10!");
            }

        } while (num < 1 || num > 10);

        // Print numbers from 1 to 10 using do-while
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        sc.close();
    }
}