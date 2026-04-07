
import java.util.Scanner;

 // TryCatchExceHand.java

 public class TryCatchExceHand{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double balance =  5000;

        try {
            System.out.println("Enter ammount to withdraw");
            double ammount = sc.nextInt();

            if (ammount > balance) {
                    throw new Exception("Insufficient balance ! ");

            }
            if(ammount <=0){
                throw  new Exception("Invalid Ammount!");

            }
            balance -= ammount;
            System.out.println("Withdraw successfuly");
            System.out.println("Remaining balance :"+balance);

        } catch (Exception e) {
            System.out.println("Error :"+ e.getMessage());
        } finally {
                System.out.println("Transaction Completed (Finally block always runs");

        }
    }
 }