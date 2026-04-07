import java.util.*;
public class Switchcase{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      double balance = 10000;

      System.out.println("1.Deposite");
      System.out.println("2.Check Balance");
      System.out.println("3.Withdraw ammount");
      System.out.println("Enter Your choice");
      int choice = sc.nextInt();
      switch(choice){
        case 1:
          System.out.println("Enter Ammount");
          double ammount = sc.nextDouble();
          if(ammount > 0){
        balance += ammount;
        System.out.println("Deposited ammount :"+ ammount + "your balance is :"+balance);
          }else{
            System.out.println("Enter valid ammount");
          }
        break;

        case 2:
          System.out.println("Your balance is :"+ balance);
          break;
        case 3:
          System.out.println("Enter Ammount for Withdraw");
          double withammount = sc.nextDouble();
          if(withammount > 0 && withammount<= balance ){
          balance-= withammount;
        System.out.println("Withdrw ammount :"+ withammount + "your balance is :"+balance);
          }
          else{
           System.out.println("Enter valid ammount");

          }
        default :
        System.out.println("Check");

      }

   }
}