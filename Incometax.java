import java.util.Scanner;

public class Incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income: ");

        if(sc.hasNextDouble()){
            double inc = sc.nextDouble();
            double tax;

            if (inc <= 250000) {
                tax = 0;     
            } else if (inc <= 500000 && inc >= 250000) {
                tax = inc* 0.05;
            } else if (inc <= 1000000 && inc >= 500000) {
                tax = inc * 0.20;
            } else {
                tax = inc * 0.30;
            }
                System.out.println("your tax is: " + tax);
        }else{
            System.out.println("Invalid! Please enter correct income.");

        }
        sc.close();

    }
    
}
