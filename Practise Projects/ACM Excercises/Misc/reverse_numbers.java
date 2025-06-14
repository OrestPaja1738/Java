
import java.util.Scanner;


public class reverse_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.println("Enter array value:");
                arr[i] = scanner.nextInt();
            }

        System.out.printf("\n");    

        System.out.println("Reversed array below:");

            for(int i = 9; i >= 0 ; i--){
                System.out.println(arr[i]);
            }

            scanner.close();
    }
}
