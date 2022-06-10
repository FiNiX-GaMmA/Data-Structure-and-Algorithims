import java.util.Scanner;

public class GDC_euclidean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(GCD(n, m));
        sc.close();
    }
    public static int GCD(int a,int b) {
        if(b==0)
            return a;
        else
            return GCD(b,a%b);
        
    }
}
