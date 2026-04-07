
import java.util.Scanner;

//StringComaEqual.java

public class StringComaEqual{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1 = sc.next();
        System.out.println("Enter String 2");
        String s2 = sc.next();

        if (s1.equals(s2)) {
            System.out.println("Both string are equal");
        }else{
            System.out.println("String are not equal");
        }

        int result = s1.compareTo(s2);
        if (result == 0) {
            System.out.println("Strings are equal using comparto");
        }
        else if (result >0) {
            System.out.println("First string is greater");
        }else {
            System.out.println("second string is greater ");
        }

        
    }
}