import java.util.Scanner;

public class more_elseif {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number: ");

        int num = sc.nextInt();

        // if(num > 0){         //method 1
        //     System.out.println("Postive");
        // }
        // else if(num < 0){
        //     System.out.println("negative");
        // }
        // else
        //     System.out.println("zero");
        
        //     sc.close();

        // if(num >=0){    //method 2
        //     if(num == 0)
        //         System.out.println("zero");
        //     else    
        //         System.out.println("positive");
        // }else
        //     System.out.println("negetive");

        // sc.close();
        if(num == 0)
            System.out.println("zero");
        else{
            
            String result = num > 0 ? "positve": "negative";
            System.out.println(result);
        }
        sc.close();
    }
}
