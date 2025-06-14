import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int fnOutput = getFib(n);
        System.out.println(fnOutput);
    }

    public static int getFib(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        else{
            return getFib(n - 1) + getFib(n - 2);
        }
    }
}
