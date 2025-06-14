import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SpeedTest {
    public static void main(String[] args) {
        /*
         * This class is just for testing out and comparing the sorting
         * speed of gnome sort compared to insertion sort and quick sort!
         * Much of the initial setup is the same as the other class
         */

         Scanner scanner = new Scanner(System.in);
         int size = scanner.nextInt();

         int arr[] = new int[size];
         Random rand = new Random();

         for(int i = 0; i < size; i++){
            arr[i] = rand.nextInt(1_000_000);
         }

        //creating copies of main array
        int[] arrGnome = Arrays.copyOf(arr, size);
        int[] arrQuick = Arrays.copyOf(arr, size);
        int[] arrInsertion = Arrays.copyOf(arr, size);

        // Gnome Sort
        long startGnome = System.nanoTime();
        gnomeSort(arrGnome);
        long endGnome = System.nanoTime();
        System.out.println("Gnome Sort time: " + (endGnome - startGnome) / 1_000_000.0 + " ms");

        // Quick Sort
        long startQuick = System.nanoTime();
        quickSort(arrQuick, 0, arrQuick.length - 1);
        long endQuick = System.nanoTime();
        System.out.println("Quick Sort time: " + (endQuick - startQuick) / 1_000_000.0 + " ms");

        // Insertion Sort
        long startInsertion = System.nanoTime();
        insertionSort(arrInsertion);
        long endInsertion = System.nanoTime();
        System.out.println("Insertion Sort time: " + (endInsertion - startInsertion) / 1_000_000.0 + " ms");
    }

    // Gnome Sort
    public static void gnomeSort(int[] arr) {
        int pos = 0;
        while (pos < arr.length) {
            if (pos == 0 || arr[pos] >= arr[pos - 1]) {
                pos++;
            } else {
                int temp = arr[pos];
                arr[pos] = arr[pos - 1];
                arr[pos - 1] = temp;
                pos--;
            }
        }
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
