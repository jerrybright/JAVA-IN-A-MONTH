import java.lang.Math;
import java.util.*;
class sqareCuberoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Square root of " + x + " is " + SquareRoot(x));
        System.out.println("Cube root of " + x + " is " + CubeRoot(x));

        sc.close();
    }

    static double SquareRoot(int x) {
        double sq;
        sq = Math.sqrt(x);
        return sq;
    }

    static double CubeRoot(int x) {
        double cb;
        cb = Math.cbrt(x);
        return cb;
    }
    
}