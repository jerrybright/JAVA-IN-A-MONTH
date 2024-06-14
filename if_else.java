import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age: ");

        int age = sc.nextInt();

        // if(age >=18)
        //     System.out.println("Vote");
        // else
        //     System.out.println("grow up kid");

        // sc.close();

        String result = age >= 18 ? "vote": "grow up kiddo";//ternary operator
        System.out.println(result);

        sc.close();
    }
    
}
