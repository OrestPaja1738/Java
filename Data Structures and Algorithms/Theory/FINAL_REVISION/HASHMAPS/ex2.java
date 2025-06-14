
import java.util.HashMap;
import java.util.Map;

public class ex2 {
    //Write a function which returns true If none of the values are repeated in the array and false
    //if they are.

    public boolean foo(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < arr.length;i++){
            if (map.containsKey(arr[i]) == true) {
                int x = map.get(arr[i]);
                map.put(arr[i], x + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > 1) {
                return false;
            }
        }
        return true;
    }
}
