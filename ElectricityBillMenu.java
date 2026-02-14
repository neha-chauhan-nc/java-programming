
    import java.util.Scanner;

public class ElectricityBillMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Dynamic Electricity Bill Calculator!");

        // Input the rates for each slab
        System.out.print("Enter rate for first 100 units: ");
        double rate1 = sc.nextDouble();

        System.out.print("Enter rate for next 100 units (101-200): ");
        double rate2 = sc.nextDouble();

        System.out.print("Enter rate for units above 200: ");
        double rate3 = sc.nextDouble();

        boolean continueCalc = true;

        while (continueCalc) {
            System.out.print("\nEnter your electricity units: ");
            if (sc.hasNextInt()) {
                int units = sc.nextInt();

                if (units < 0) {
                    System.out.println("Units cannot be negative!");
                    continue;
                }

                double bill;

                if (units <= 100) {
                    bill = units * rate1;
                } else if (units <= 200) {
                    bill = 100 * rate1 + (units - 100) * rate2;
                } else {
                    bill = 100 * rate1 + 100 * rate2 + (units - 200) * rate3;
                }

                System.out.println("Your electricity bill is: " + bill + " Rs");

            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear invalid input
                continue;
            }

            // Ask user if they want to continue
            System.out.print("Do you want to calculate another bill? (yes/no): ");
            String answer = sc.next().toLowerCase();
            if (!answer.equals("yes")) {
                continueCalc = false;
                System.out.println("Thank you for using the calculator!");
            }
        }

        sc.close();
    }
}


