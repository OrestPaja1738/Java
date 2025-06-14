public class groupEvenValues {
    
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 6;

        int left = 0,right = 3;

        fnCall(arr,left,right);

        for(int i = 0;i < 4;i++){
            System.out.println(arr[i]);
        }
    }

    public static void fnCall(int arr[],int left,int right){
        if (left >= right) {
            return;
        }
        else{
            if (arr[left] % 2 == 0) {
                fnCall(arr, left + 1, right);
            }
            if (arr[right] % 2 != 0) {
                fnCall(arr, left, right - 1);
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                fnCall(arr, left + 1, right - 1);
            }
        }
    }
}
