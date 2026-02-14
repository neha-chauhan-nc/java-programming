import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a 1st number :");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
             
            System.out.println("Enter your 2nd number :");
            if (sc.hasNextInt()) {
               int num2 = sc.nextInt();
                

               System.out.println("Enter your choice by no. 1234 :- +, - , * , / :");
                
                int opr;
                if (sc.hasNextInt()) {
                    opr = sc.nextInt(); 
                } else {
                    System.out.println("Invalid ! Please enter correct number");
                    sc.close();
                    return;
                }
                switch (opr) {
                    case 1:
                        System.out.println("Your output: " + (num1 + num2));
                        break;
                    case 2:System.out.println("Your output: " + (num1 - num2));
                    break;

                    case 3: System.out.println("Your output: " + (num1 * num2));
                    break;

                    case 4: 
                    if (num2!= 0 ) {
                       System.out.println("Your output : "+ ( num1/num2)); 
                    } else {
                       System.out.println("Error! Division by zero not allowed."); 
                       
                    }
                    
                    break;
                    default:System.out.println("Invalid Number! Please enter a valid number");
                        break;
                }

            } else {
                System.out.println("Invalid! Please enter 2nd correct number.");
            }
        } else {
            System.out.println("Invalid! Please enter your 1st number correct.");
        }
        sc.close();
    }
}
