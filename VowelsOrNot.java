import java.util.Scanner;

public class VowelsOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        if (sc.hasNext()) {
            char ch = sc.next().toLowerCase().charAt(0);

            if (!Character.isLetter(ch)) {
                System.out.println("Invalid! please enter a character.");
            }else{

            switch (ch) {
                case 'a':
                    case 'e': 
                    case 'i': 
                    case 'o':
                    case 'u': System.out.println("Vowels");
                    break;
            
                default: System.out.println("Consonants");
                    break;
            }

        }
        
        } else {
            System.out.println("Invalid ! Please enter a valid character.");
        }
        sc.close();
      }
}


