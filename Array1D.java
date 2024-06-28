import java.util.Scanner;
public class Array1D {
    public static void main(String[] args){
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("\nArray Elements are : \n");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i]+ " ");

        sc.close();
    }}


    //method2 using while loop

// import java.util.Scanner;

// class Array1D {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array : ");
//         int n = sc.nextInt();

//         int arr[]=new int[n];
//         System.out.println("Enter the Elements of the array: ");

//         int i = 0;
//         while(i < n){
//             arr[i]=sc.nextInt();
//             i++;
//         }


//         System.out.print("\nArray Elements are : \n");
//         for(i = 0; i < n; i++)
//             System.out.print(arr[i]+ " ");

//     }
// }
