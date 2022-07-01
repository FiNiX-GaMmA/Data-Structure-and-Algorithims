import java.util.*;

public class sum_of_natural_numbers {
    public static int sumOfNaturalNumbers(int n){
        if(n == 0){
            return 0;
        }
        return n+sumOfNaturalNumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfNaturalNumbers(n));
        sc.close();
    }
}
