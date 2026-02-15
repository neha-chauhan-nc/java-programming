import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter angle 1st: ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (sc.hasNextInt()) {
                int b = sc.nextInt();

                if (sc.hasNextInt()) {
                    int c = sc.nextInt();

                    if (a>0 && b>0 && c>0 && (a+ b + c == 180) ) {
                        System.out.println("Valid. Triangle.");
                    } else {
                        System.out.println("Invalid! Triangle");
                    }
                } else {
                    System.out.println("Invalid! Enter 3rd number correct");
                }
            } else {
                System.out.println("Invalid ! enter correct 2nd number");
            }
        } else {
            System.out.println("Invalid! enter correct 1st number");
        }
        sc.close();
    }
}
