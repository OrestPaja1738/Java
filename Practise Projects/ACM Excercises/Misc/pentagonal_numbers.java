
import java.util.Scanner;


public class pentagonal_numbers {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n;

        System.err.println("Enter value for 1st number!");
        n = scanner.nextInt();

            for(int i = n; i <= 100; i++){
                int pentagonal_number = getPentagonalNumber(i);
                System.out.println("Value " + i + ":  " + pentagonal_number);
            }

    }

    public static int getPentagonalNumber(int n){

        int fnOutput = (n * ((3 * n) - 1)) / 2;

            return  fnOutput;
    }

}
