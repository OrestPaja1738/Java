public class quickSort {
    public void quickSort(int arr[],int low,int high){
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(arr,low,high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);

        return;
    }
    public int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low,j = low; //you are working with subarrays

        while (i < high) { 
            if (arr[i] > pivot) {
                i++;
            }
            else{
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                i++;
                j++;
            }
        }
        int tmp = arr[j];
        arr[j] = arr[high];
        arr[high] = tmp;

        return j;
    }
}
