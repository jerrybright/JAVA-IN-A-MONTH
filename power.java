import java.util.*;
public class power {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        double base = sc.nextDouble();
        System.out.println("Enter the exponent number: ");
        int exponent = sc.nextInt();
        int result = 1;
        

        while (exponent!= 0){
            result *= base;
            --exponent; 
        }
        System.out.println("The power of the number is " + result);

        sc.close();
    }
    
}


//method2 using math.pow

// import java.util.Scanner;

// class LearnCoding {
//     public static void main(String[] args)
//     {
//         //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         //input base value and exponent value from user
//         System.out.print("Enter the value of base : ");
//         double base = sc.nextDouble();
        
//         System.out.print("Enter the value of exponent : ");
//         double exp = sc.nextDouble();
        
//         System.out.println("Answer = " + Math.pow(base,exp));
//         //closing scanner class(not compulsory, but good practice)
//         sc.close();
//     }
// }