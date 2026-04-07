
import java.util.Scanner;

//StringRev.java

public class StringRev{
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String for reverse");
            String s = sc.next();
            String reve = "";
            
            for(int i= s.length()-1;i>=0;i--){
                reve = reve+s.charAt(i);
            }
            System.out.println("Reverse string is :"+ reve);
            if (s.equals(reve)) {
                System.out.println("String is palidrome :"+reve);
            }
            else{
                System.out.println("String is not palidrome : "+ reve);
            }
            
    }
}