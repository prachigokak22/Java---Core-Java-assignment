//CustomeException.java

class invalidBalanceException extends  Exception{

    public invalidBalanceException(String message) {
        super(message);
    }   



}

public class CustomeException {

    static  void withdraw(double balance,double ammount) throws invalidBalanceException{
        if (ammount>balance) {
                throw  new invalidBalanceException("Balance is too Low");

        }
        else{
            balance -=ammount;
            System.out.println("Withdraw successfully ");
            System.out.println("Remaining balance : "+balance);
        }
    }
    public static void main(String[] args) {
        double balance = 5000;
        try {
            withdraw(balance, 1000);
        } catch (invalidBalanceException e) { 
            System.out.println("Error : "+e.getMessage());
        }
        System.out.println("Programme continues");
        
    }
}