// PaymentGatewayInterface.java 

interface  paymentgateway{
    void pay(double ammount);
}

class netbankingpayment implements paymentgateway{

    @Override
    public void pay(double ammount) {
        System.out.println(ammount+"is payed by netbanking");
    }

}

class creditcardpayment  implements paymentgateway{

    @Override
    public void pay(double ammount) {
        System.out.println(ammount+"is payed by credit card");
    }

}

class upiPay implements paymentgateway{

    @Override
    public void pay(double ammount) {
        System.out.println(ammount+"is payed by UPI ID");
    }
    
}

public class PaymentGatewayInterface{
    public static void main(String[] args) {
        
        paymentgateway p;
        p = new creditcardpayment();
        p.pay(10500.25);
        p= new upiPay();
        p.pay(4500.52);
        p= new netbankingpayment();
        p.pay(9875.78);

    }
}