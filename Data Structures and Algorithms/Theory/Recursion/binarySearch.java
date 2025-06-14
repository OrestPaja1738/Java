
public class binarySearch {
    public static void main(String[] args) {
        int n = 5;
        int array[] = new int[n];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        int key = 5,left = 0,right = n - 1;

        int fnOutput = binSearch(key,left,right,array);
        System.out.println(fnOutput);
    }

    public static int binSearch(int key,int left,int right,int array[]){
        int mid = (left + right) / 2;

        if (key == array[mid]) {
            return key;//normally return index instead of keys value
        }
        if (right < left) {
            return -1;
        }
        else{
            if (key > array[mid]) {
                return binSearch(key, mid + 1, right, array);
            }
            return binSearch(key, left, mid - 1, array);
        }
    }
}
