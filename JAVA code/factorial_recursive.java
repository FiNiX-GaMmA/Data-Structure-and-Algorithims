import java.util.*;

public class factorial_recursive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of the number is : "+factorial(n));
        sc.close();
    }
        
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
}
