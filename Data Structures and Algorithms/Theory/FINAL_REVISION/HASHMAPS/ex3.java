
import java.util.HashMap;

public class ex3 {
    /*
     * Given an array of Integers nums and an integer target, return indices of the two numbers
that add up to the target. You may assume that each input would have exactly one solution,
and you may not use the same element twice. You can return the answer in any order..
Example: Input: nums = [2, 7, 11, 15], target = 9. Output: [0, 1].
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

     public int[] foo(int arr[],int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            map.put(arr[i], i);
        }

        int index[] = new int[2];

        for(int i = 0; i < arr.length;i++){
            int complement = target - arr[i];

                if (map.containsKey(complement) == true && map.get(complement) != i) {
                    index[0] = i;
                    index[1] = map.get(complement);
                    break;
                }
        }

        return index;
     }
}
