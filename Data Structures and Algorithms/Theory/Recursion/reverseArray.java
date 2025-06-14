public class reverseArray {
    public static void main(String[] args) {
        int[] arr = new int[4];

        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;

        int i = 0;

        printReverse(arr,i);
    }

    public static void printReverse(int arr[],int i){
        if (i == arr.length) {
            return;
        }
        if (i > arr.length) {
            throw new IllegalArgumentException();
        }
        else{
            printReverse(arr, i + 1);
            System.out.println(arr[i]);
        }
    }
}
