import java.util.Scanner;

public class PositiveNegative {
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number");

        if (obj.hasNextInt()) {
            
            int num = obj.nextInt();

            if (num > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        } else {
            System.out.println("Zero");
        }

        obj.close();
    }

}
