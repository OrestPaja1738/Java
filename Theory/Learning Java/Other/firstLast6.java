
import java.util.Scanner;

public class firstLast6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Enter value for n!");
        n = scanner.nextInt();

        int[] array = new int[n];
        getData(array,n,scanner);

        boolean status = getStatus(array,n);

        System.out.println("Result: " + status);
    }

    public static void getData(int[] array,int n,Scanner scanner) {
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for array");
            array[i] = scanner.nextInt();
        }
    }

    public static boolean getStatus(int[] array,int n){

        boolean status;

        if (array[0] == 6 || array[n - 1] == 6) {
            status = true;
        }
        else{
            status = false;
        }
        return status;
    }
}
