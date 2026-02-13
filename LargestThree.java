import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number");

        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();

            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();

                if (sc.hasNextInt()) {
                   int num3 = sc.nextInt(); 

                   if (num1> num2 && num1 > num2) {
                    System.out.println(num1 + " is a Largest number.");
                   } else if (num2 > num1 && num2 > num3) {
                        System.out.println(num2 + " is a greatest number.");
                   } else {
                    System.out.println(num3 + " is a greatest number. ");
                   } 
                } else {
                    System.out.println("Invalid input! Please enter third number .");
                }
            } else {
                System.out.println("Invalidinput !Enter valid input for number second!!");
            }

        } else {
            System.out.println("Invalid input! please enter a valid number for one/ first number");
        }

        sc.close();
    }
}