
import java.util.*;

public class Fibonaci {

    public static void main(String[] args) {
        //   int a = 0, b = 1;
        //   int temp = 0;                          
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int num = sc.nextInt();
        //   for (int i = 1; i <= num; i++) {
        //       System.out.println(a + " ");
        //       temp = a + b;
        //       a = b;
        //       b = temp;
        //   }

        /// while loop 
        ///
      // int i=1,a1=0,b1=1;
      // while (i<=num) {
      //    int next = a1+b1;
      //    System.out.println(a1+" ");
      //    a1=b1;
      //    b1=next;
      //    i++;
          
      // }

      

      int n = 5;
        int a = 0, b = 1, i = 1;

        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        } while (i <= n);
    }
}
