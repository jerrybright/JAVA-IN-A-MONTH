import java.util.Scanner;
public class largestNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the first number");
        int a = sc.nextInt();
        System.out.println(" enter the second number");
        int b = sc.nextInt();
        int largest = 0;

        if (a == b ){
            System.out.println("Both numbers are equal");
        }
        else {
           largest = ( a > b ) ? a : b;
            System.out.println("The largest number is " + largest);
        }

        sc.close();
    }
}

//method 2 using math.max

// import java.util.Scanner;
// public class LearnCoding
// {
//     public static void main(String[] args) {
//         //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         //input first number
//         System.out.print("Enter the first number : ");
//         int first = sc.nextInt();
//         //input second number
//         System.out.print("Enter the second number : ");
//         int second = sc.nextInt();

//         int largest = 0;

//         //conditions
//         if(first == second)
//             System.out.println("Both numbers are equal");
//         else
//             System.out.println(Math.max(first, second));

//         //closing scanner class(not compulsory, but good practice)
//         sc.close();
//     }
// }
