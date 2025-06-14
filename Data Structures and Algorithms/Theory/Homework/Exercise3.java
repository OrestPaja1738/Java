import java.util.Arrays;
import java.util.LinkedList;

public class Exercise3 {
    
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        LinkedList<Integer> q = new LinkedList<>();

        for (int i = deck.length - 1; i >= 0; i--) {
            if (!q.isEmpty()) {
                q.addFirst(q.removeLast());
            }
            q.addFirst(deck[i]);
        }

        int[] res = new int[deck.length];
        
        for (int i = 0; i < deck.length; i++) {
            res[i] = q.removeFirst();
        }

        return res;
    }
    
}
