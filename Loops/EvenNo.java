

import java.util.Scanner;

public class EvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num<= 0) {
                System.out.println("Please enter a Positive number!!");
                sc.close();
                return;
            }

            for(int i = 2; i <= num; i= i+2 ){
                if (i%2 == 0) {
                    System.out.println("Your Even Number is: " + i);
                }
            }

        }else{
            System.out.println("Invalid! Please enter a number.");
        }
        sc.close();

    }
}
