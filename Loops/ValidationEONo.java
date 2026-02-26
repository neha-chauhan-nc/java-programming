import java.util.Scanner;

public class ValidationEONo {
    void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter number from 1 to 20: ");
   
   if (sc.hasNextInt()) {
    int n = sc.nextInt();
    if(n>=1 && n<=20){
        System.out.println("Valid num. ");
        
    
    System.err.print("Even no.: ");
    for(int i =1; i<=n; i++){
        if(i%2==0){
            System.out.print( i+ " ");
        }

    }

    System.out.println("\n\nOdd no.: ");
    for(int i = 1; i<=n; i++){
        if(i%2!=0){
            System.out.print( i + " ");
        } 
    }
    }


   } else {
    System.out.println("Invalid number!! Please enter valid number.");
   }

   sc.close();
    }
    
}
