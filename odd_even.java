import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // //method1
        // int num = sc.nextInt();
        // if(num %2 ==0)
        //     System.out.println("even number");
        // else    
        //     System.out.println("odd number");
        
        //method2
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even": "odd";

        System.out.println(num + " is " + evenOdd);

        reader.close();
    }
}


// method 3

//  import java.util.Scanner;
//  public class Innerodd_even {
//     public static boolean isEven(int num){
//         if ((num & 1) == 0)
//             return true;
//         else 
//             return false;



//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);
//         System.out.println("enter a number");

//         int num = reader.nextInt();

//         if(isEven(num) == true)
//             System.out.println("even");
//         else
//             System.out.println("odd");
//     }
    
//  }

