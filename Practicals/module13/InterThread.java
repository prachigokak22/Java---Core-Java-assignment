// Shared resource
class BankAccount {

    int balance = 0;

    // Deposit method (Producer)
    synchronized void deposit(int amount) {

        System.out.println("Depositing: " + amount);
        balance += amount;

        // Notify waiting thread
        notify();

        System.out.println("Balance after deposit: " + balance);
    }

    // Withdraw method (Consumer)
    synchronized void withdraw(int amount) {

        if (balance < amount) {
            System.out.println("Waiting for deposit...");
            try {
                wait(); // wait until deposit happens
            } catch (InterruptedException e) {}
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}

// Thread 1 → Withdraw
class WithdrawThread extends Thread {

    BankAccount acc;

    WithdrawThread(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(2000);
    }
}

// Thread 2 → Deposit
class DepositThread extends Thread {

    BankAccount acc;

    DepositThread(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.deposit(3000);
    }
}

public class InterThread {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        WithdrawThread t1 = new WithdrawThread(account);
        DepositThread t2 = new DepositThread(account);

        t1.start(); // withdraw first → will wait
        t2.start(); // deposit → notify
    }
}