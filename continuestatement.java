import java.util.Scanner;
public class continuestatement{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        
        
        for(int i = low;i<=high;i++)
        {
            if(i%5==0)
                continue;
        
            System.out.print(i + " ");
        }sc.close();
    }
}