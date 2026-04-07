
import java.util.Scanner;

// ArrayMatrix.java

public class ArrayMatrix{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Row Size");
        int row = sc.nextInt();
        System.err.println("Enter col size");
        int col = sc.nextInt();
        int a[][]= new int[row][col];
        int b[][]= new int[row][col];
        int add[][]= new int[row][col];
        int sub[][]= new int[row][col];

        System.err.println("Enter A aray elements");
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.err.println("Enter B array elements ");

         for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                add[i][j]= a[i][j]+b[i][j];
                sub[i][j]= a[i][j]-b[i][j];
            }
        }

         System.out.println("\nAddition of matrices:");
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(add[i][j]+ " ");
            }
             System.out.println();
        }

        System.err.println("Array A");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

          System.err.println("Array B");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

      

        // Display Subtraction
        System.out.println("\nSubtraction of matrices:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }

    }
}