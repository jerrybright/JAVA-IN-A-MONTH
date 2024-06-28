import java.util.Scanner;

public class Array2D{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter the number of rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int arr[][]= new int[rows][columns];

        System.out.println("enter the items of the 2d array");

        for(int i=0; i < rows; i++){
            for (int j= 0 ;j < columns; j++){
                 arr[i][j]= sc.nextInt(); 
            }
        }

        System.out.println("the resultant matrix");
        for(int i=0; i < rows; i++){
            for (int j= 0 ;j < columns; j++){
                System.out.println(arr[i][j] + " ");
            }}
            sc.close();
    }
}