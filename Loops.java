import java.util.Scanner;

public class Loops {

//     public static void main (String[] args) {

//         // Initialize the Scanner to read user input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter a number
//         System.out.print("Enter a number: ");

//         // Read the user input as an integer
//         int num = scanner.nextInt();
//         int i = 1;

//         // Loop from 1 to the entered number, printing each number
//         while (i <= num) {
//             System.out.print(i + " ");
//             i++;
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }


//==========================================================================



//     //for loop
//     public static void main (String[] args) {

//         // Initialize the Scanner to read user input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter a number
//         System.out.print("Enter a number: ");

//         // Read the user input as an integer
//         int num = scanner.nextInt();
        

//         // Loop from 1 to the entered number, printing each number
//         for( int i=1; i<num; i++){
//             System.out.println(i + " ");
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }




//==========================================================================





    //do-while loop
    public static void main (String[] args) {

        // Initialize the Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user input as an integer
        int num = scanner.nextInt();
        
        int i = 0;
        // Loop from 1 to the entered number, printing each number
        do{
            System.out.println(i + " ");
            i++;
        }
        while(i<num);
        // Close the scanner
        scanner.close();
    }
}


