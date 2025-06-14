public class houseRobber {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 2;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 3;
        arr[4] = 1;

        int k = 2,minOutput = 1000;

        for(int i = 0;i < k;i++){
            int left = 0,right = 0,maxLeft = 0,minRight = 0;
            if (i == 0) {//current at index 0
                int target = arr[i];
                left = i + 2;
                right = arr.length - 1;
                while (left <= right) { 
                    int maxValue = Math.max(target, arr[left++]);
                    if (maxValue <= minOutput) {
                        minOutput = maxValue;
                    }
                }
            }
            if (i == 1) {//current at index 1
                int target = arr[i];
                minRight = i + 2;
                right = arr.length - 1;
                while (minRight <= right) { 
                    int maxValue = Math.max(target, arr[minRight++]);
                    if (maxValue <= minOutput) {
                        minOutput = maxValue;
                    }
                }
            }
            if (i == arr.length - 1) {//current at last index
                int target = arr[i];
                right = arr.length - 2;
                while (left <= right) { 
                    int maxValue = Math.max(target, arr[left++]);
                    if (maxValue <= minOutput) {
                        minOutput = maxValue;
                    }
                }
            }
            if (i == arr.length - 2) {//current at the index before last index
                int target = arr[i];
                maxLeft = i - 2;
                while (left <= maxLeft) { 
                    int maxValue = Math.max(target, arr[left++]);
                    if (maxValue <= minOutput) {
                        minOutput = maxValue;
                    }
                }
            }
            else{//any other case where current value is somewhere in the middle ranges
                int target = arr[i];
                maxLeft = i - 2;
                minRight = i + 2;
                right = arr.length - 1;

                while (left <= maxLeft) { 
                    int maxValue = Math.max(target, arr[left++]);
                    if (maxValue <= minOutput) {
                        minOutput = maxValue;
                    }
                }
                while (minRight <= right) {
                    int maxValue = Math.max(target, arr[minRight++]);
                    if (maxValue <= minOutput) {
                        minOutput = maxValue;
                    }
                }
            }
        }

        System.out.println(minOutput);
    }
}
