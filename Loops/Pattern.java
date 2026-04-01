import java.util.Scanner;

public class Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
        System.out.println("Enter number from 1 to 10: ");    
        if(!sc.hasNextInt()){
            System.out.println("Invalid!! Enter a valid input");
            sc.next();
            continue;
        }
        
        
        num = sc.nextInt();

        if(num>=1 && num<=10){
            break;
        } 
        else{
        System.out.println("Enter a valid number.");
     } 
        }

    for(int i=1; i<=num; i++){
       for(int j=1; j<=i; j++){
        System.out.print("*");
       } 
       System.out.println();
    } 

    sc.close();       
    }

}