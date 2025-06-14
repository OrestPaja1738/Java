public class findIndexImproved {
    public static void main(String[] args) {
        int arr[] = new int[7];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 7;
        arr[5] = 7;
        arr[6] = 8;

        int left = 0,right = arr.length - 1;
        int indexOne = -1,indexTwo = -1;

        int target = 1;

        while (left <= right) { 
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                if (mid == 0) {//first index found at extreme left
                    indexOne = mid;
                    break;
                }
                if(arr[mid - 1] != target){//first index found
                    indexOne = mid;
                    break;
                }
                if (arr[mid - 1] == target) { //current value is on the right of the left most desired index 
                    right = mid - 1;
                    left = 0;
                }
            }
            if (target > arr[mid]) {
                left = mid + 1;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            }
        }

            left = 0;
            right = arr.length - 1;

        while (left <= right) { 
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                if (mid == arr.length - 1) {//found 2nd index at extreme right
                    indexTwo = mid;
                    break;
                }
                if (arr[mid + 1] != target) {//2nd index found
                    indexTwo = mid;
                    break;
                }
                if (arr[mid + 1] == target) {//current value is on the left of 2nd index
                    left = mid + 1;
                    right = arr.length - 1;
                }
            }
            if (target > arr[mid]) {
                left = mid + 1;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            }
        }

        System.out.println("Indexes: " + indexOne + " " + indexTwo);
    }
}
