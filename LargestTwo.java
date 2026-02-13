import java.util.Scanner;

public class LargestTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");

        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();

            System.out.println("Enter second number: ");
        if (sc.hasNextInt()) {
            int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "is a greater number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is a greater number. ");
        } else {
            System.out.println(" Both are equal number.");
        }
        } else {
            System.out.println("Invalid input! enter a second number correct.");
        }

        } else {
           System.out.println("Invalid input! enter a first number ."); 
        }
        sc.close();
    }
}
