// OverloadingDiffDataTyp.java

class calculator{
    public void add(int a,int b){
        System.out.println("Integer sum :"+ (a+b));
    }

    public void add(double a,double b){
        System.out.println("Double sum :"+(a-b));
    }
    public  void add(float a,float b){
        System.out.println("Float Multiplication :"+(a*b));
    }
}

public class OverloadingDiffDataTyp{
    public static void main(String[] args) {
        calculator c1= new calculator();
       c1.add(10, 20);
       c1.add(500.05, 200.08);
       c1.add(75.0, 1.0);        
    }
}