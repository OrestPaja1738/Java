import java.util.Scanner;

public class binaryConversion {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        binaryConversion(n);
    }
    public static void binaryConversion(int n){
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {//taking into account if n == 0 initially
            System.out.println(n % 2);
        }
        else{
            binaryConversion(n/2);
            System.out.println(n % 2);
        }
    }
}
