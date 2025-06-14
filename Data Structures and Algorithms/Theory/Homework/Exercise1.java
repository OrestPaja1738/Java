import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    
    Map<String, Integer> memo = new HashMap<>();

    public int minEditDistance(String s, String t) {
        return dp(s, t, s.length(), t.length());
    }

    private int dp(String s, String t, int i, int j) {
        String key = i + "," + j;

        if (memo.containsKey(key)) return memo.get(key);
        if (i == 0) return j;
        if (j == 0) return i;

        if (s.charAt(i - 1) == t.charAt(j - 1)) {
            return dp(s, t, i - 1, j - 1);
        }

        int insert = dp(s, t, i, j - 1);
        int delete = dp(s, t, i - 1, j);
        int replace = dp(s, t, i - 1, j - 1);
        int res = 1 + Math.min(insert, Math.min(delete, replace));
        memo.put(key, res);
        
        return res;
    }

}
