import java.util.Scanner;

public class printingNumbers {
    public static void main(String[] args) {
         System.out.println("70");//string/text
        System.out.println(70+1);//number
        

       
        Scanner sc=new Scanner(System.in);//used for taking user input, sc=obj., Scanner=class, System.in= is built-in (specialised/Sub-class or) constructor  or parameter passed in Scanner() /(of class(scanner)) , System.in= taking i/p through "keyboard".

        //hum jab bhi object create/bnayenge krenge hum "parameter" ya "constructor" hi pass krenge.

        System.out.print("Enter a no.:- ");//asking to  user input
        int x=sc.nextInt();//store user input in "int" of x, nextInt()= is a func. like getter/setter of class(Scanner) with sc(obj)
        
        System.out.println("NO. is:- "+x);//print user i/p
        sc.close();
    }
    
}
