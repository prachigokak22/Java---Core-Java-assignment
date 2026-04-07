import java.util.*;
public class Even_odd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(n+ "Number is even");
        }
        else if(n%2 != 0){
            System.out.println(n+"Number is odd");
        }
        else{
            System.out.println("Number is not valid");
        }
    }
}