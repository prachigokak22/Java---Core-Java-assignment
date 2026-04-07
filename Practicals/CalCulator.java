
import java.util.Scanner;


public class CalCulator {
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("1. Addition");
       System.out.println("2.Substract");
       System.out.println("3.Division");
       System.out.println("4.Multiplication");
       System.out.println("5. Modulus");

       System.out.println("Choose operation (1-5)");
       int choice = sc.nextInt();
       System.out.println("Enter first number");
       int n1 = sc.nextInt();
       System.out.println("Enter second number");
       int n2 = sc.nextInt();
       switch (choice) {
           case 1 :
               System.out.println("Result: "+(n1+n2));
               break;
               case 2:
                System.out.println("Result : "+(n1-n2));
                   break;
                   case 3 :
               System.out.println("Result: "+(n1/n2));
               break;
               case 4:
                System.out.println("Result : "+(n1*n2));
                   break;
                    case 5:
                System.out.println("Result : "+(n1%n2));
                   break;
           default:
               throw new AssertionError();
       }

    }
}