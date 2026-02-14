import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your units: ");
        if (sc.hasNextInt()) {
            int units = sc.nextInt();
            int bills;

            if (units < 0) {
                System.out.println("Units cannot be negative!");
                sc.close();
                return;
                
            }

            if (units <= 100) {
                bills = units * 5;
            } else if (units <= 200) {
                bills = (100 * 5) + (units - 100) * 7;
            } else {
                bills = (100 * 5) + (100 * 7) + (units - 200) * 10;
            }
            System.out.println("your bills is : " + bills + "Rs");

        } else {
            System.out.println("Invalid! Please enter a corrct number.");
        }
        sc.close();
    }
}
