import java.util.*;

public class  TypeCasting {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer Number");
        int intval = sc.nextInt();
        double  doubleval= intval; ///implicit type casting small -> big

        System.out.println("Integer Value"+ intval + "Double value"+ doubleval);
      
        System.out.print("Enter Double Value   ");
        double doubval2 = sc.nextDouble();
        int intn2val = (int)doubval2;  //explicit type casting

        System.out.println("Double val:"+ doubval2 + "Int value:"+intn2val);

    }

}