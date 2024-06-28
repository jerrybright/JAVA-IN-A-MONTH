import java.util.Scanner;
public class greatestOfThree {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the all three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp, result ;

        temp = (a > b)? a : b;
        result  = (temp >c )? temp : c; 

        sc.close();
        System.out.println("The greatest number is " + result);
    }
}


//method 3 using math.max
// import java.util.Scanner;
// public class LearnCoding
// {
//     public static void main (String[]args)
//     {
//         //scanner class declaration
//         Scanner sc = new Scanner (System.in);
//         //input three numbers from user
//         System.out.print ("Enter the first number : ");
//         int first = sc.nextInt ();
//         System.out.print ("Enter the second number : ");
//         int second = sc.nextInt ();
//         System.out.print ("Enter the third number : ");
//         int third = sc.nextInt ();
//         System.out.println ();
//         int temp, result;

//         result = Math.max(first, Math.max(second, third));


//         System.out.println(result + " is the largest");

//         //closing scanner class(not compulsory, but good practice)
//         sc.close ();
//     }
// }