import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {
    
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        int threshold = nums.length / 3;

        for (int key : map.keySet()) {
            if (map.get(key) > threshold) {
                res.add(key);
            }
        }
        
        return res;
        
    }

}
