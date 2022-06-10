import java.util.*;
public class GCD_novice_approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = Math.min(m, n);
        for (int i = res; i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                res = i;
                break;
            }
        }
        System.out.println(res);
        sc.close();
    }
}


// Java program to find GCD of two numbers
// this approcah is not efficient it takes O(min(m,n)) time
