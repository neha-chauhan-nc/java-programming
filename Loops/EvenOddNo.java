import java.util.Scanner;

public class EvenOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num;

        if (sc.hasNextInt()) {
            num = sc.nextInt(); 
        

        System.out.println("\nEven number:");
       for(int i = 1; i<=num; i++){
        if(i%2==0){
            System.out.print(i + " ");
        }
    }

        System.out.println("\n\nOdd number: ");
        for(int i = 1; i<=num; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        

       }

    }else{
            System.out.println("Invalid input!! enter correct number.");
        }
       sc.close();
    }
    
}
