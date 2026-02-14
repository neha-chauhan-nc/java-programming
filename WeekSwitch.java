import java.util.Scanner;

public class WeekSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day: ");
        int days;

        if (sc.hasNextInt()) {
            days = sc.nextInt();
        } else {
            System.out.println("Invalid input! Please enter a valid day.");
            sc.close();
            return;
        }

        

        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Not a weeks of the day.");
                break;
        }
        sc.close();
    }
}



