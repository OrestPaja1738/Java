package Sorting;

public class QuickSort {
    public void quickSort(int arr[],int low,int high){
        if (low >= high) {
            return;
        }

        int pivot = partition(arr,low,high);

        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    public int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low;
        int j = low;

        while (i < high) { 
            if (arr[i] > pivot) {
                i++;
            }
            else{
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
                i++;
            }
        }
        int tmp = arr[high];
        arr[high] = arr[j];
        arr[j] = tmp;

        return j;
    }
}
