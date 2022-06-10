import java.util.Scanner;

public class trailing_zeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        int n = in.nextInt();
        for (int i = 5; i <= n; i*=5) {
            ans += n/i;
        }
        System.out.println(ans);
        in.close();
    }
}
