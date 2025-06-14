import java.util.ArrayList;
import java.util.HashMap;

public class ex1 {
    //finding non repeating character in a string
    public void foo(String s){
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0;i< s.length();i++){
            if (arr.contains(s.charAt(i)) == false) {
                arr.add(s.charAt(i));
            }
        }
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(int i = 0; i < s.length();i++){
            if (map.containsKey(s.charAt(i)) == true) {
                int x = map.get(s.charAt(i));
                map.put(s.charAt(i),x + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        for(Character x : arr){
            if (map.get(x) == 1) {
                System.out.println(x);
                break;
            }
        }
    }
}
