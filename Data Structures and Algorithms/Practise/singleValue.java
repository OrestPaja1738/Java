import java.util.Arrays;

public class singleValue {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 4;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 1;
        arr[4] = 2;

        Arrays.sort(arr);
        int left = 0,right = arr.length - 1;
        while(left <= right){
            if (arr[left] == arr[left + 1]) {
                left += 2;
            }
            else{
                System.out.println(arr[left]);
                break;
            }
            if (arr[right] == arr[right - 1]) {
                right -= 2;
            }
            else{
                System.out.println(arr[right]);
                break;
            }
        }
    }
}
