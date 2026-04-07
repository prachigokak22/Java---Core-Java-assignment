//SynchronizedThread.java


class BankAccount {
    int balance =3000;
    synchronized  void withdrwa(int ammount){
        System.out.println(Thread.currentThread().getName() + "Is trying to withdraw :"+ammount);
        if (balance >= ammount) {
            System.out.println("processing");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                System.getLogger(BankAccount.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            balance -=ammount;
            System.out.println(Thread.currentThread().getName()+"Completed Withdraw : Remaining balance is "+balance);

        }
        else{
            System.out.println(Thread.currentThread().getName()+"-Insufficient Balance !");
        }
    }
}

class UserThread extends  Thread{
    BankAccount acc;

    public UserThread( BankAccount acc,String name) {
        super(name);
        this.acc=acc;

    }   

    @Override
    public void run() {
        acc.withdrwa(500);
    }
    
    
}

public class SynchronizedThread{


    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount();
        UserThread t1 = new UserThread(b1, "user-1");
        UserThread t2 = new UserThread(b1, "user -2");

        t1.start();
        t2.start();
    }
}