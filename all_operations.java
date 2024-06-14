import java.util.Scanner;

public class all_operations {
    
    public static void main (String[]args){

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();


        System.out.println("the addition of " + x + " and " + y + " is: " + (Add(x,y)));
        System.out.println("the subtraction of " + x + " and " + y + " is: " + (subtraction(x,y)));
        System.out.println("the multiplication of " + x + " and " + y + " is: " + (multiplication(x,y)));
        System.out.println("the division of " + x + " and " + y + " is: " + (division(x,y)));
        System.out.println("the power of " + x + " and " + y + " is: " + (power(x,y)));
        System.out.println("the modulus of " + x + " and " + y + " is: " + (modulus(x,y)));

        sc.close();
    }



    static int Add(int x, int y){
        int sum;
        sum = x + y;
        return sum;
    }

    static int subtraction(int x, int y){
        int sub;
        sub = x - y;
        return sub;
    }

    static int multiplication(int x, int y){
        int mul;
        mul = x * y;
        return mul;
    }

    static int division(int x, int y){
        int div;
        div = x / y;
        return div;
    }

    static int modulus(int x, int y){
        int mod;
        mod = x % y;
        return mod;
    }

    static double power(int x, int y){
        double powe;
        powe = Math.pow(x,y);
        return powe;
    }

    
}
