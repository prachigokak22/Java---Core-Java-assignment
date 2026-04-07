//MultiThreading.java

class  DepositeThread extends Thread{
    
    public void run(){
        for(int i= 1;i<=3;i++){
            System.out.println("Deposite money ....");

            try{
                    Thread.sleep(1500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

}

class WithdrawThread extends Thread{
    public void run(){
        for(int i =1; i<=3;i++){
            System.out.println("Withdrawing money");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class MultiThreading {
    public static void main(String [] args){

        DepositeThread d1 = new DepositeThread();
        WithdrawThread w1 = new WithdrawThread();
        d1.start();
        w1.start();
    }
}