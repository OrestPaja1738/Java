import java.util.Random;
import java.util.Scanner;

public class GnomeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        Random random = new Random();

        int arr[] = new int[size]; //initializing array with a given size from user

        for(int i = 0; i < size;i++){
            arr[i] = random.nextInt(30);//populates the array with random values
        }

        System.out.println("Non sorted array:");
        for(Integer x : arr){
            System.out.println(x);
        }

        //Sorting process

        int pos = 0;

        while (pos < size) { 
            if (pos == 0 || arr[pos] >= arr[pos - 1]) {
                pos += 1;
                /*
                 * If current value is bigger or equal with the previous value
                 * we proceed by incrementing to the next position in the array
                 */
            }
            else{// arr[pos] < arr[pos - 1] : current value is smaller than previous value
                int temp = arr[pos - 1]; //if current value is smaller than previous value
                arr[pos - 1] = arr[pos]; // we swap the values 
                arr[pos] = temp;

                pos -= 1;
                /*
                 * After swapping values we decrement the position in order to check if all
                 * the previous values have been sorted
                 */
            }
        }

        System.out.println("Sorted Array:");
        for(Integer x : arr){
            System.out.println(x);
        }

        scanner.close();
    }
}
