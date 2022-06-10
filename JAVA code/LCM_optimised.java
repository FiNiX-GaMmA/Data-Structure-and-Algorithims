/**
 * LCM_optimised
 */

import java.util.Scanner;
public class LCM_optimised {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int LCM = (t*n)/GCD(t,n);
        System.out.println("LCM of the two numbrs is: "+LCM);
        sc.close();
}

public static int GCD(int a, int b) {
    if (b == 0)
        return a;
    return GCD(b, a % b);
    
}
}