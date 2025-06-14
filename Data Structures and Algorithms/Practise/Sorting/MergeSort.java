public class MergeSort {
    public void divideFoo(int arr[]){
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;

        int arrLeft[] = new int[mid];
        int arrRight[] = new int[arr.length - mid];

        for (int i = 0; i < mid ;i++) {
            arrLeft[i] = arr[i];
        }
        for (int i = mid; i < arr.length - mid; i++){
            arrRight[i - mid] = arr[i];
        }
        divideFoo(arrLeft);
        divideFoo(arrRight);
        mergeFoo(arr, arrLeft, arrRight);

        return;
    }
    public void mergeFoo(int arr[],int arrLeft[],int arrRight[]){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arrLeft.length && j < arrRight.length) { 
            if (arrLeft[i] < arrRight[j]) {
                arr[k] = arrLeft[i];
                i++;
                k++;
            }
            else{
                arr[k] = arrRight[j];
                j++;
                k++;
            }
        }
        while (i < arrLeft.length) { 
            arr[k] = arrLeft[i];
            i++;
            k++;
        }
        while (j < arrRight.length) { 
            arr[k] = arrRight[j];
            j++;
            k++;
        }
        return;
    }
}
