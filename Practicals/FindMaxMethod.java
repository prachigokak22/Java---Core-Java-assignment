
import java.util.Scanner;

//FindMaxMethod.java
public  class FindMaxMethod{

    static  int findmax(int a,int b ,int c){
        int max;
        if (a>b && a>c) {
            max=a;
        }
        else if (b>c) {
            max=b;
        } else {
            max=c;
        }
        return max;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        int result = findmax(x, y, z);
        System.out.println("Max number is :" + result);
        
    }
}