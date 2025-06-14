
import java.util.Scanner;

public class powerOfThree {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        boolean fnResult = fn(n);
        System.out.println("Output " + fnResult);
    }

    public static boolean fn(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            return true;
        }
        else{
            if(n % 3 == 0){
                return fn(n / 3);
            }
            return false;
        }
    }
}
