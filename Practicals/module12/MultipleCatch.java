
import java.util.InputMismatchException;
import java.util.Scanner;

//MultipleCatch.java
public class MultipleCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int num = sc.nextInt();

            int result = 100/num;
            int arr[]= {1,2,3};

            System.out.println("Array value: "+arr[5]);
            System.out.println("Result :"+ result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: can not divide by zero");
        }catch (InputMismatchException e) {
            System.out.println("Error: Invalid input (enter integer only)");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } 
        catch (Exception e) {
            System.out.println("General Error: " + e);
        } 
        finally {
            System.out.println("Program Ended (Finally block)");
          
        }
    }
}