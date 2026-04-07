//BankDemoAccemod.java

class BankAccount {

    private double balance = 5000;
    String accountType = "Savings";
    protected String bankname = "SBI";
    public String holderNAme = "Prachi";

    public void showBalance() {
        System.out.println("Balance :" + balance);
    }

    protected void showBank() {
        System.out.println("Bank: " + bankname);
    }
}


@SuppressWarnings("unused")
class SameBranchUser{
    public void display(){
        BankAccount acc = new BankAccount();
        // System.out.println(acc.balance); balance has private access in BankAccount
        System.out.println(acc.accountType);
        System.out.println( "Holder : " + acc.holderNAme);
        System.out.println("Bank :" + acc.bankname);
        
        acc.showBalance();
    }
}

class diffBankUser extends  BankAccount{
    public void  display(){
       // System.out.println(balance); ❌ private
        // System.out.println(accountType); ❌ default (not accessible)

        System.out.println("Holder: " + holderNAme); // ✅ public
        System.out.println("Bank: " + bankname); // ✅ protected via inheritance
    }
}

public class BankDemoAccemod {
    public static void main(String[] args) {
        System.out.println("---same bank user -- ");
        SameBranchUser s1 = new SameBranchUser();
        s1.display();

        System.out.println("\n -- ---- diff bank user --- ");

        diffBankUser d1 = new diffBankUser();
        d1.display();
        
    }
}